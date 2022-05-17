package attempts;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.*;

import java.lang.reflect.*;
import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UnitTest {

	public static int score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	ArrayList<String> methodsPassed = new ArrayList<String>();

	Block[] allEven, eleven;
	Chain twentySeven, ten, six, seven;

	// The sizes of the first 100 000 Collatz chains
	int[] sizes;

	@BeforeEach
	public void run() throws IOException {
		allEven = createBlock(new int[] { 1, 2, 4, 8, 16, 32 });
		eleven = createBlock(new int[] { 1, 2, 4, 8, 16, 5, 10, 20, 40, 13, 26, 52, 17, 34, 11 });

		twentySeven = new Chain();
		twentySeven.createChain(27);

		ten = new Chain();
		ten.createChain(10);

		six = new Chain();
		six.createChain(6);

		seven = new Chain();
		seven.createChain(7);

		currentMethodName = null;

		sizes = new DataSetReader("collatzSizes.txt").sizes;
	}

	/**
	 * 
	 * @param id
	 * @return an array of blocks that contain all of the ids with valid ranks.
	 */
	private Block[] createBlock(int[] id) {
		Block[] chain = new Block[id.length];
		for (int i = 0; i < id.length; i++) {
			chain[i] = new Block(id[i], id.length - i);
			if (i != 0) {
				chain[i].next = chain[i - 1];
			}
		}
		return chain;
	}

	@Test
	@Order(1)
	@Graded(description = "Block - testNumberEvenBlocks", marks = 11)
	public void testNumberEvenBlocks() {
		assertEquals(5, allEven[5].numberEvenBlocks());
		assertEquals(3, allEven[3].numberEvenBlocks());

		assertEquals(10, eleven[14].numberEvenBlocks());
		assertEquals(8, eleven[10].numberEvenBlocks());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(2)
	@Graded(description = "Block - testNumberOddBlocks", marks = 11)
	public void testNumberOddBlocks() {
		assertEquals(1, allEven[5].numberOddBlocks());
		assertEquals(1, allEven[3].numberOddBlocks());

		assertEquals(5, eleven[14].numberOddBlocks());
		assertEquals(3, eleven[10].numberOddBlocks());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(3)
	@Graded(description = "Block - testIsValid", marks = 11)
	public void testIsValid() {
		for (int i = allEven.length - 1; i >= 0; i--) {
			assertTrue(allEven[i].isValid());
		}
		for (int i = 0; i < eleven.length; i++) {
			assertTrue(eleven[i].isValid());
		}

		// Check for infinite loop
		eleven[0].next = eleven[2];
		assertFalse(eleven[14].isValid());
		eleven[0].next = null;

		// Check for invalid id
		eleven[8].id = 6;
		assertFalse(eleven[14].isValid());
		eleven[8].id = 40;

		eleven[5].id = 31;
		assertFalse(eleven[14].isValid());
		eleven[5].id = 5;

		// Invalid rank should not be checked
		eleven[8].rank = 6;
		assertTrue(eleven[14].isValid());
		eleven[8].rank = 7;

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
	@Order(4)
	@Graded(description = "Block - testIsValidAdvanced", marks = 3)
	public void testIsValidAdvanced() {
		testIsValid();
		currentMethodName = null;
		
		assertTrue(allEven[allEven.length - 1].isValidAdvanced());
		assertTrue(eleven[eleven.length - 1].isValidAdvanced());

		// Check for invalid starting rank
		for (int i = allEven.length - 2; i >= 0; i--) {
			assertFalse(allEven[i].isValidAdvanced());
		}
		for (int i = 0; i < eleven.length - 1; i++) {
			assertFalse(eleven[i].isValidAdvanced());
		}

		// Check for infinite loop
		eleven[0].next = eleven[2];
		assertFalse(eleven[eleven.length - 1].isValidAdvanced());
		eleven[0].next = null;

		// Check for invalid id
		eleven[8].id = 6;
		assertFalse(eleven[eleven.length - 1].isValidAdvanced());
		eleven[8].id = 40;

		eleven[5].id = 31;
		assertFalse(eleven[eleven.length - 1].isValidAdvanced());
		eleven[5].id = 5;

		// Check for invalid rank
		eleven[8].rank = 6;
		assertFalse(eleven[eleven.length - 1].isValidAdvanced());
		eleven[8].rank = 7;

		eleven[8].rank = 8;
		assertFalse(eleven[eleven.length - 1].isValidAdvanced());
		eleven[8].rank = 7;

		// Check that fast Collatz chain passes
		// (6, 1) -> (3, 2) -> (5, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)
		Block[] fastCollatz = new Block[8];
		fastCollatz[0] = new Block(1, 7);
		fastCollatz[1] = new Block(2, 6, fastCollatz[0]);
		fastCollatz[2] = new Block(4, 5, fastCollatz[1]);
		fastCollatz[3] = new Block(8, 4, fastCollatz[2]);
		fastCollatz[4] = new Block(5, 3, fastCollatz[3]);
		fastCollatz[5] = new Block(3, 2, fastCollatz[4]);
		fastCollatz[6] = new Block(6, 1, fastCollatz[5]);
		assertTrue(new Block(1, 1).isValidAdvanced());
		assertTrue(fastCollatz[fastCollatz.length - 2].isValidAdvanced());

		// Check valid ranking
		fastCollatz[3].rank = 3;
		assertFalse(fastCollatz[fastCollatz.length - 2].isValidAdvanced());
		fastCollatz[3].rank = 3;

		// It needs to be either fast or normal, not both.
		fastCollatz[7] = fastCollatz[6];
		fastCollatz[6] = fastCollatz[5];
		fastCollatz[5] = new Block(10, 3, fastCollatz[4]);
		fastCollatz[6].next = fastCollatz[5];
		for (int i = 0; i < 5; i++) {
			fastCollatz[i].rank++;
		}
		assertEquals("(6, 1) -> (3, 2) -> (10, 3) -> (5, 4) -> (8, 4) -> (4, 6) -> (2, 7) -> (1, 8)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertFalse(fastCollatz[fastCollatz.length - 1].isValidAdvanced());

		fastCollatz[4] = new Block(16, 4, fastCollatz[3]);
		fastCollatz[5] = new Block(5, 3, fastCollatz[4]);
		fastCollatz[6].next = fastCollatz[5];
		fastCollatz[3].rank++;
		assertEquals("(6, 1) -> (3, 2) -> (5, 3) -> (16, 4) -> (8, 5) -> (4, 6) -> (2, 7) -> (1, 8)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertFalse(fastCollatz[fastCollatz.length - 1].isValidAdvanced());

		// Check fast Collatz chain where only the first Block is odd
		for (int i = 0; i < 6; i++) {
			fastCollatz[i].rank -= 2;
		}
		assertEquals("(5, 1) -> (16, 2) -> (8, 3) -> (4, 4) -> (2, 5) -> (1, 6)", fastCollatz[5].toString());

		assertTrue(fastCollatz[5].isValidAdvanced());
		fastCollatz[5].next = fastCollatz[3];
		for (int i = 0; i < 4; i++) {
			fastCollatz[i].rank--;
		}
		assertEquals("(5, 1) -> (8, 2) -> (4, 3) -> (2, 4) -> (1, 5)", fastCollatz[5].toString());
		assertTrue(fastCollatz[5].isValidAdvanced());

		// Check fast Collatz chain where the first Block is odd
		int[] num = new int[] { 1, 2, 4, 8, 16, 5, 10, 20, 40, 13 };
		fastCollatz = createBlock(num);

		assertEquals(
				"(13, 1) -> (40, 2) -> (20, 3) -> (10, 4) -> (5, 5) -> (16, 6) -> (8, 7) -> (4, 8) -> (2, 9) -> (1, 10)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertTrue(fastCollatz[fastCollatz.length - 1].isValidAdvanced());

		// Remove (40, 2) from the chain
		fastCollatz[9].next = fastCollatz[7];
		for (int i = 0; i < 8; i++) {
			fastCollatz[i].rank--;
		}
		assertEquals("(13, 1) -> (20, 2) -> (10, 3) -> (5, 4) -> (16, 5) -> (8, 6) -> (4, 7) -> (2, 8) -> (1, 9)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertFalse(fastCollatz[fastCollatz.length - 1].isValidAdvanced());
		
		// Remove (16, 5) from the chain
		fastCollatz[5].next = fastCollatz[3];
		for (int i = 0; i < 4; i++) {
			fastCollatz[i].rank--;
		}
		assertEquals("(13, 1) -> (20, 2) -> (10, 3) -> (5, 4) -> (8, 5) -> (4, 6) -> (2, 7) -> (1, 8)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertTrue(fastCollatz[fastCollatz.length - 1].isValidAdvanced());
		
		// Add (40, 2) to the chain
		fastCollatz[9].next = fastCollatz[8];
		for (int i = 0; i < 8; i++) {
			fastCollatz[i].rank++;
		}
		assertEquals("(13, 1) -> (40, 2) -> (20, 3) -> (10, 4) -> (5, 5) -> (8, 6) -> (4, 7) -> (2, 8) -> (1, 9)",
				fastCollatz[fastCollatz.length - 1].toString());
		assertFalse(fastCollatz[fastCollatz.length - 1].isValidAdvanced());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(5)
	@Graded(description = "Chain - testCreateChain", marks = 11)
	public void testCreateChain() {
		Chain c = new Chain();
		assertNull(c.createChain(0));
		assertNull(c.createChain(-5));
		
		assertNotNull(ten.head);
		assertEquals(10, ten.head.id);
		assertEquals("(10, 1) -> (5, 2) -> (16, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)", ten.toString());
		assertEquals(10, ten.head.id);
		
		assertEquals("(10, 1) -> (5, 2) -> (16, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)", ten.toString());
		assertEquals("(6, 1) -> (3, 2) -> (10, 3) -> (5, 4) -> (16, 5) -> (8, 6) -> (4, 7) -> (2, 8) -> (1, 9)",
				six.toString());
		assertEquals(
				"(7, 1) -> (22, 2) -> (11, 3) -> (34, 4) -> (17, 5) -> (52, 6) -> (26, 7) -> (13, 8) -> (40, 9) -> (20, 10) -> (10, 11) -> (5, 12) -> (16, 13) -> (8, 14) -> (4, 15) -> (2, 16) -> (1, 17)",
				seven.toString());

		c = new Chain();
		assertEquals(
				"(12, 1) -> (6, 2) -> (3, 3) -> (10, 4) -> (5, 5) -> (16, 6) -> (8, 7) -> (4, 8) -> (2, 9) -> (1, 10)",
				c.createChain(12).toString());
		assertEquals(
				"(12, 1) -> (6, 2) -> (3, 3) -> (10, 4) -> (5, 5) -> (16, 6) -> (8, 7) -> (4, 8) -> (2, 9) -> (1, 10)",
				c.toString());
		
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(6)
	@Graded(description = "Chain - testSize", marks = 11)
	public void testSize() {
		testCreateChain();
		currentMethodName = null;
		
		Chain c = new Chain();
		for (int i = 1; i < 1000; i++) {
			c.createChain(i);
			assertNotNull(c.head);
			assertEquals(i, c.head.id);
			assertEquals(1, c.head.rank);
			assertEquals(sizes[i], c.size());
		}

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(7)
	@Graded(description = "Chain - testMaxValue", marks = 11)
	public void testMaxValue() {
		testCreateChain();
		currentMethodName = null;
		
		assertNotNull(ten.maxValue());
		assertEquals(16, ten.maxValue().id);
		assertEquals(3, ten.maxValue().rank);
		assertEquals("(16, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)", ten.maxValue().toString());

		assertEquals(16, six.maxValue().id);
		assertEquals(5, six.maxValue().rank);
		assertEquals("(16, 5) -> (8, 6) -> (4, 7) -> (2, 8) -> (1, 9)", six.maxValue().toString());

		Chain c = new Chain();
		assertNull(c.maxValue());

		c.createChain(9);
		assertEquals(52, c.maxValue().id);
		assertEquals(9, c.maxValue().rank);

		assertEquals(9232, twentySeven.maxValue().id);
		assertEquals(78, twentySeven.maxValue().rank);

		c.createChain(9232);
		assertEquals(9232, c.maxValue().id);
		assertEquals(1, c.maxValue().rank);

		c.createChain(1);
		assertEquals(1, c.maxValue().id);
		assertEquals(1, c.maxValue().rank);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(8)
	@Graded(description = "Chain - testCreateFasterChain", marks = 5)
	public void testCreateFasterChain() {
		testSize();
		currentMethodName = null;
		
		Chain c = new Chain();
		Chain ans = c.createFasterChain(1);
		assertNotNull(ans);
		assertEquals("(1, 1)", ans.toString());

		ans = c.createFasterChain(-1);
		assertNull(ans);

		ans = c.createFasterChain(-7);
		assertNull(ans);

		ans = c.createFasterChain(0);
		assertNull(ans);

		String copy = ten.toString();
		ans = ten.createFasterChain(10);
		assertNotNull(ans);
		assertEquals(6, ans.size());
		assertEquals("(10, 1) -> (5, 2) -> (8, 3) -> (4, 4) -> (2, 5) -> (1, 6)", ans.toString());
		assertEquals(copy, ten.toString());

		ans = ten.createFasterChain(11);
		assertNotNull(ans);
		assertEquals(11, ans.size());
		assertEquals(
				"(11, 1) -> (17, 2) -> (26, 3) -> (13, 4) -> (20, 5) -> (10, 6) -> (5, 7) -> (8, 8) -> (4, 9) -> (2, 10) -> (1, 11)",
				ans.toString());
		assertEquals(copy, ten.toString());

		ans = ten.createFasterChain(6);
		assertNotNull(ans);
		assertEquals(7, ans.size());
		assertEquals("(6, 1) -> (3, 2) -> (5, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)", ans.toString());
		assertEquals(copy, ten.toString());

		ans = ten.createFasterChain(512);
		assertNotNull(ans);
		assertEquals(10, ans.size());
		assertEquals(
				"(512, 1) -> (256, 2) -> (128, 3) -> (64, 4) -> (32, 5) -> (16, 6) -> (8, 7) -> (4, 8) -> (2, 9) -> (1, 10)",
				ans.toString());
		assertEquals(copy, ten.toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(9)
	@Graded(description = "Chain - testSort", marks = 5)
	public void testSort() {
		testCreateChain();
		currentMethodName = null;
		
		Chain c = new Chain();
		Chain ans = c.Sort();
		assertNotNull(ans);
		assertNull(ans.head);

		String copy = ten.toString();
		ans = ten.Sort();
		assertNotNull(ans);
		assertEquals("(1, 7) -> (2, 6) -> (4, 5) -> (5, 2) -> (8, 4) -> (10, 1) -> (16, 3)", ans.toString());
		assertEquals(copy, ten.toString());

		copy = six.toString();
		ans = six.Sort();
		assertNotNull(ans);
		assertEquals("(1, 9) -> (2, 8) -> (3, 2) -> (4, 7) -> (5, 4) -> (6, 1) -> (8, 6) -> (10, 3) -> (16, 5)",
				ans.toString());
		assertEquals(copy, six.toString());

		copy = seven.toString();
		ans = seven.Sort();
		assertNotNull(ans);
		assertEquals(
				"(1, 17) -> (2, 16) -> (4, 15) -> (5, 12) -> (7, 1) -> (8, 14) -> (10, 11) -> (11, 3) -> (13, 8) -> (16, 13) -> (17, 5) -> (20, 10) -> (22, 2) -> (26, 7) -> (34, 4) -> (40, 9) -> (52, 6)",
				ans.toString());
		assertEquals(copy, seven.toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(10)
	@Graded(description = "Chain - testRemoveId", marks = 5)
	public void testRemoveId() {
		testCreateChain();
		currentMethodName = null;
		
		assertNull(six.removeId(7));

		// (6, 1) -> (3, 2) -> (10, 3) -> (5, 4) -> (16, 5) -> (8, 6) -> (4, 7) -> (2,
		// 8) -> (1, 9)
		assertNotNull(six.head);
		Block toBeRemoved = six.head.next.next.next;
		Block removed = six.removeId(5);
		assertNotNull(removed);
		assertEquals(5, removed.id);
		assertEquals(4, removed.rank);
		assertNull(removed.next);
		assertTrue(toBeRemoved == removed, "They are refferencing the same Block");
		assertEquals(8, six.size());
		assertEquals("(6, 1) -> (3, 2) -> (10, 3) -> (16, 4) -> (8, 5) -> (4, 6) -> (2, 7) -> (1, 8)", six.toString());

		toBeRemoved = six.head.next;
		removed = six.removeId(3);
		assertNotNull(removed);
		assertEquals(3, removed.id);
		assertEquals(2, removed.rank);
		assertNull(removed.next);
		assertTrue(toBeRemoved == removed);
		assertEquals(7, six.size());
		assertEquals("(6, 1) -> (10, 2) -> (16, 3) -> (8, 4) -> (4, 5) -> (2, 6) -> (1, 7)", six.toString());

		toBeRemoved = six.head;
		removed = six.removeId(6);
		assertNotNull(removed);
		assertEquals(6, removed.id);
		assertEquals(1, removed.rank);
		assertNull(removed.next);
		assertTrue(toBeRemoved == removed);
		assertEquals(10, six.head.id);
		assertEquals(6, six.size());
		assertEquals("(10, 1) -> (16, 2) -> (8, 3) -> (4, 4) -> (2, 5) -> (1, 6)", six.toString());

		toBeRemoved = six.head.next.next.next.next.next;
		removed = six.removeId(1);
		assertNotNull(removed);
		assertEquals(1, removed.id);
		assertEquals(6, removed.rank);
		assertNull(removed.next);
		assertTrue(toBeRemoved == removed);
		assertEquals(5, six.size());
		assertEquals("(10, 1) -> (16, 2) -> (8, 3) -> (4, 4) -> (2, 5)", six.toString());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(11)
	@Graded(description = "Chain - testFirstCommonBlock", marks = 5)
	public void testFirstCommonBlock() {
		testCreateChain();
		currentMethodName = null;
		
		assertNull(ten.firstCommonBlock(null));

		assertNotNull(seven.head);
		assertEquals("(10, 11) -> (5, 12) -> (16, 13) -> (8, 14) -> (4, 15) -> (2, 16) -> (1, 17)",
				seven.firstCommonBlock(ten).toString());
		assertEquals("(10, 11) -> (5, 12) -> (16, 13) -> (8, 14) -> (4, 15) -> (2, 16) -> (1, 17)",
				ten.firstCommonBlock(seven).toString());
		assertEquals("(10, 106) -> (5, 107) -> (16, 108) -> (8, 109) -> (4, 110) -> (2, 111) -> (1, 112)",
				six.firstCommonBlock(twentySeven).toString());
		assertEquals("(10, 106) -> (5, 107) -> (16, 108) -> (8, 109) -> (4, 110) -> (2, 111) -> (1, 112)",
				twentySeven.firstCommonBlock(six).toString());

		Chain a = new Chain();
		Chain b = new Chain();
		a.createChain(26);
		b.createChain(15);
		assertEquals(
				"(40, 10) -> (20, 11) -> (10, 12) -> (5, 13) -> (16, 14) -> (8, 15) -> (4, 16) -> (2, 17) -> (1, 18)",
				a.firstCommonBlock(b).toString());
		assertEquals(
				"(40, 10) -> (20, 11) -> (10, 12) -> (5, 13) -> (16, 14) -> (8, 15) -> (4, 16) -> (2, 17) -> (1, 18)",
				b.firstCommonBlock(a).toString());

		a.createChain(341);
		b.createChain(80);
		assertEquals("(16, 8) -> (8, 9) -> (4, 10) -> (2, 11) -> (1, 12)", a.firstCommonBlock(b).toString());
		assertEquals("(16, 8) -> (8, 9) -> (4, 10) -> (2, 11) -> (1, 12)", b.firstCommonBlock(a).toString());
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(12)
	@Graded(description = "Chain - testLongestChain", marks = 5)
	public void testLongestChain() {
		testCreateChain();
		currentMethodName = null;
		
		Chain result = new Chain();
		assertNull(ten.longestChain(-5, -2));
		assertNull(ten.longestChain(-10, 0));
		assertNull(ten.longestChain(10, 3));

		Chain ans = ten.longestChain(1, 3);
		assertNotNull(ans);
		assertEquals(result.createChain(3).toString(), ans.toString());
		assertEquals(result.createChain(10).toString(), ten.toString());

		ans = ten.longestChain(3, 3);
		assertNotNull(ans);
		assertEquals(result.createChain(3).toString(), ans.toString());
		assertEquals(result.createChain(10).toString(), ten.toString());

		ans = ten.longestChain(2, 10);
		assertNotNull(ans);
		assertEquals(20, ans.size());
		assertEquals(result.createChain(9).toString(), ans.toString());

		ans = ten.longestChain(-3, 10);
		assertNotNull(ans, "Since there are a few valid chains in this range, it should not be null");
		assertEquals(20, ans.size());
		assertEquals(result.createChain(9).toString(), ans.toString());

		ans = ten.longestChain(5, 30);
		assertNotNull(ans);
		assertEquals(112, ans.size());
		assertEquals(result.createChain(27).toString(), ans.toString());

		ans = seven.longestChain(27, 40);
		assertNotNull(ans);
		assertEquals(112, ans.size());
		assertEquals(result.createChain(27).toString(), ans.toString());

		ans = seven.longestChain(100, 105);
		assertNotNull(ans);
		assertEquals(88, ans.size());
		assertEquals(103, ans.head.id);

		ans = seven.longestChain(100, 7000);
		assertNotNull(ans);
		assertEquals(262, ans.size());
		assertEquals(6171, ans.head.id);
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(13)
	@Graded(description = "Chain - testSizeEffective", marks = 3)
	public void testSizeEffective() {
		testSize();
		currentMethodName = null;
		
		Chain c = new Chain();
		c.createChain(77031);

		assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
			for (int i = 0; i < 5000000; i++) {
				assertEquals(sizes[77031], c.size());
			}
		});

		c.createChain(27);
		assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
			for (int i = 0; i < 5000000; i++) {
				assertEquals(sizes[27], c.size());
			}
		});

		c.createChain(6171);
		assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
			for (int i = 0; i < 5000000; i++) {
				assertEquals(sizes[6171], c.size());
			}
		});

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
	@Order(14)
	@Graded(description = "Chain - testCreateChainEffective", marks = 3)
	public void testCreateChainEffective() {
		testCreateChain();
		currentMethodName = null;

		Chain c = new Chain();
		assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
			for (int i = 1; i < 100000; i++) {
				c.createChain(i);
				assertEquals(sizes[i], c.size());
			}
		});
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@AfterEach
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if (currentMethodName != null && !methodsPassed.contains(currentMethodName)) {
			methodsPassed.add(currentMethodName);
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score += graded.marks();
			result += graded.description() + " passed. Marks awarded: " + graded.marks() + "\n";
		}
	}

	@AfterAll
	public static void wrapUp() throws IOException {
		if (result.length() != 0) {
			result = result.substring(0, result.length() - 1); // remove the last "\n"
		}
		System.out.println(result);
		System.out.println("\nIndicative mark: " + score + " out of 100");
	}

}
