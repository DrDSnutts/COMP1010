/**
 * Do not remove or modify this comment as it will interfere with the auto-marking of your submission.
 * Penalty for removing this comment: 20% \of the total mark for this exam. So if you get 80% \\but remove
 * the comment, your marks will reduce to 60%
 * uuid: 0ac49c4c-6dbe-40e8-a16c-c45a32f868e4
 */
/*****************************
 *                           *
 * DO NOT MODIFY THIS FILE   *
 *						 	 *
 *****************************/

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

public class AllInOneTest {
	public static String currentMethodName = null;
	public static int score = 0;
	public static String result = "";

	@Before
	public void beforeEachTest() {
		currentMethodName = null;
	}

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="testCountEvenArrayList(ArrayList<Integer>)", marks=10)
	public void testCountEvenArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question1.countEven(null));

		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(0, Question1.countEven(emptyList));

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(6, 0, 5, -7, -10));
		assertEquals(3, Question1.countEven(list1)); //3 values (6, 0 and -10) are even

		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, -2, 2, 4, -4));
		assertEquals(5, Question1.countEven(list2)); //all 5 values are even

		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, -1, 3, -3));
		assertEquals(0, Question1.countEven(list3)); //none of the values are even

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="containsDigitRecursive(int, int)", marks=10)
	public void testContainsDigitRecursive() throws NoSuchMethodException, SecurityException {
		assertTrue(Question2.containsDigitRecursive(1729, 1));
		assertTrue(Question2.containsDigitRecursive(1729, 7));
		assertTrue(Question2.containsDigitRecursive(1729, 2));
		assertTrue(Question2.containsDigitRecursive(1729, 9));
		assertFalse(Question2.containsDigitRecursive(1729, 0));
		assertFalse(Question2.containsDigitRecursive(1729, 3));
		assertFalse(Question2.containsDigitRecursive(1729, 4));
		assertFalse(Question2.containsDigitRecursive(1729, 5));
		assertFalse(Question2.containsDigitRecursive(1729, 6));
		assertFalse(Question2.containsDigitRecursive(1729, 8));
		assertTrue(Question2.containsDigitRecursive(8999999, 8));
		assertTrue(Question2.containsDigitRecursive(899999, 8));
		assertTrue(Question2.containsDigitRecursive(89999, 8));
		assertFalse(Question2.containsDigitRecursive(8999999, 7));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="differenceEvenOddIndices(ArrayList<Integer>)", marks=10)
	public void testDifferenceEvenOddIndicesArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question3.differenceEvenOddIndices(null)); //null list check
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Question3.differenceEvenOddIndices(list)); //empty list check

		list.add(20); //list is [20]
		assertEquals(20, Question3.differenceEvenOddIndices(list));
		list.add(30); //list is [20, 30]
		assertEquals(-10, Question3.differenceEvenOddIndices(list));

		list.add(60); //list is [20, 30, 60]
		assertEquals(50, Question3.differenceEvenOddIndices(list));

		list.add(10); //list is [20, 30, 60, 10]
		list.add(50); //list is [20, 30, 60, 10, 50]
		list.add(30); //list is [20, 30, 60, 10, 50, 30]
		assertEquals(60, Question3.differenceEvenOddIndices(list));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="withoutSpacesRecursive(String)", marks=10)
	public void testWithoutSpacesRecursiveString() throws NoSuchMethodException, SecurityException {
		assertEquals("voila", Question4.withoutSpacesRecursive("voila"));
		assertEquals("abcd.", Question4.withoutSpacesRecursive(" a      b c      d  .     "));
		assertEquals("", Question4.withoutSpacesRecursive(""));
		assertEquals("", Question4.withoutSpacesRecursive("                 "));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="areMutuallyReverse(ArrayList<Integer>)", marks=5)
	public void testAreMutuallyReverse() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(90,20,70,10));
		assertTrue(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(70,20,90));
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,10));
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = null;
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,10));
		b = null;
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();
		for(int i=0; i < 20; i++) {
			a.add(i);
			b.add(0,i);
		}
		assertTrue(Question5.areMutuallyReverse(a,b));	
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="reverse(ArrayList<Integer>)", marks=5)
	public void testReverse() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = null;
		assertNull(Question6.reverse(a));

		a = new ArrayList<Integer>();
		assertNotNull(Question6.reverse(a));
		assertEquals("[]", Question6.reverse(a).toString());

		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		assertNotNull(Question6.reverse(a));
		assertEquals("[90, 20, 70, 10]", Question6.reverse(a).toString());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="MyLinkedList:sumInRange(int)", marks=5)
	public void testMyLinkedListSumInRange() throws NoSuchMethodException, SecurityException {
		Question7 obj = new Question7();
		assertEquals(0, obj.sumInRange(10, 50, null));

		Node head = new Node(50, null);
		head = obj.add(60, head);
		head = obj.add(-30, head);
		head = obj.add(70, head);
		head = obj.add(40, head); //[50, 60, -30, 70, 40]
		assertEquals(0, obj.sumInRange(10, 20, head));
		assertEquals(90, obj.sumInRange(10, 50, head));
		assertEquals(40, obj.sumInRange(10, 50, head.next.next));
		assertEquals(0, obj.sumInRange(10, 50, head.next.next.next.next.next));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Graded(description="MyLinkedList:firstDuplicate()", marks=5)
	public void testMyLinkedListFirstDuplicate() throws NoSuchMethodException, SecurityException {
		Question8 obj = new Question8();
		Node head = new Node(5, null);
		obj.add(6, head);
		obj.add(3, head);
		obj.add(7, head); //[5, 6, 3, 7]

		Node result = obj.firstDuplicate(head); //should become [7, 3, 6, 5]
		assertNull(result);

		obj.add(3, head); //[5, 6, 3, 7, 3]
		result = obj.firstDuplicate(head);
		assertNotNull(result);
		assertEquals(3, result.data);

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();		
	}

	@Test @Graded(marks=10, description="getLongestAscendingRun(List)")
	public void testGetLongestRepeatingSubList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = null;
		assertNull(Question9.getLongestRepeatingSubList(list));
		list = new ArrayList<Integer>();
		assertNull(Question9.getLongestRepeatingSubList(list));
		list.add(10);
		assertNull(Question9.getLongestRepeatingSubList(list));
		list.add(10);
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10]", Question9.getLongestRepeatingSubList(list).toString());
		list.add(10);
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 10]", Question9.getLongestRepeatingSubList(list).toString());
		list.add(2, 20);
		list.add(10); //10,10,20,10,10
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 10]", Question9.getLongestRepeatingSubList(list).toString());
		list = new ArrayList<Integer>(Arrays.asList(10,70,20,90,30,80,20,90,30,10,70,20));
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 70, 20]", Question9.getLongestRepeatingSubList(list).toString());
		list = new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,2,2,2,2,2));
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", Question9.getLongestRepeatingSubList(list).toString());		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="productRecursive(int, int[], int)", marks=10)
	public void testProductRecursive() throws NoSuchMethodException, SecurityException {
		int[] a = {2,5,10,4};
		assertTrue(Question10.productRecursive(0, a, 50));
		assertFalse(Question10.productRecursive(0, a, 60));

		int[] b = {3,5,2};
		assertFalse(Question10.productRecursive(0, b, 6));
		assertTrue(Question10.productRecursive(0, b, 30));
		assertFalse(Question10.productRecursive(0, b, 8));

		int[] c = {1,2,3,4,5,6,7,8,9,10};
		assertTrue(Question10.productRecursive(0, c, 3628800));
		assertFalse(Question10.productRecursive(2, c, 3628800));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="indicesAddingUpto(ArrayList<Integer>, int, int)", marks=5)
	public void testIndicesAddingUpto() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2,5,10,4));
		assertNotNull(Question11.indicesAddingUpto(a, 0, 11));
		assertEquals("[0, 1, 3]", Question11.indicesAddingUpto(a, 0, 11).toString());
		assertNull(Question11.indicesAddingUpto(a, 0, 8));

		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		assertNotNull(Question11.indicesAddingUpto(b, 0, 50));
		assertEquals("[0, 1, 2, 3, 5, 6, 7, 8, 9]", Question11.indicesAddingUpto(b, 0, 50).toString());
		assertNull(Question11.indicesAddingUpto(b, 0, 56));

		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 10, 2, 30, 3, 50, 4, 70, 5, 90, 6, 100));
		assertNotNull(Question11.indicesAddingUpto(c, 0, 21));
		assertEquals("[0, 1, 2, 4, 8]", Question11.indicesAddingUpto(c, 0, 21).toString());

		ArrayList<Integer> empty = new ArrayList<Integer>();
		assertNotNull(Question11.indicesAddingUpto(empty, 0, 0));
		assertEquals("[]", Question11.indicesAddingUpto(empty, 0, 0).toString());
		assertNull(Question11.indicesAddingUpto(empty, 0, 1));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="Box:Box(int,int,int)", marks=5)
	public void testBoxIntIntInt() throws NoSuchMethodException, SecurityException {
		Box c = new Box(10, 5, 2);
		assertEquals(10, c.depth);
		assertEquals(5, c.height);
		assertEquals(2, c.width);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="Box:compareTo(Box)", marks=5)
	public void testBoxCompareTo() throws NoSuchMethodException, SecurityException {
		Box c = new Box();
		c.depth = 10;
		c.height = 5;
		c.width = 4;

		Box d = new Box();
		d.depth = 2;
		d.height = 20;
		d.width = 5;

		assertEquals(0, c.compareTo(d));
		assertEquals(0, d.compareTo(c));

		d.depth++;

		assertEquals(-1, c.compareTo(d));
		assertEquals(1, d.compareTo(c));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Graded(description="Box:isCube()", marks=5)
	public void testBoxIsCube() throws NoSuchMethodException, SecurityException {
		Box c = new Box();
		c.depth = 10;
		c.height = 5;
		c.width = 10;

		Box d = new Box();
		d.depth = 2;
		d.height = 2;
		d.width = 5;

		assertFalse(c.isCube());
		assertFalse(d.isCube());

		d.depth = 2;
		d.height = 2;
		d.width = 2;

		assertTrue(d.isCube());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@After
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if(currentMethodName != null) {
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score+=graded.marks();
			result+=graded.description()+" passed. Marks awarded: "+graded.marks()+"\n";
		}
	}

	@AfterClass
	public static void wrapUp() throws IOException {
		System.out.println("Score = "+score);
		System.out.println(result);
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		File file = new File("report"+timeStamp+".txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Score = "+score+"\n");
		writer.write(result+"\n");
		writer.flush();
		writer.close();
	}
}