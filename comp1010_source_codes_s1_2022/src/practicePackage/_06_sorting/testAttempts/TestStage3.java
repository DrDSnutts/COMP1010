package practicePackage._06_sorting.testAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import practicePackage._06_sorting.attempts.*;

public class TestStage3 {

	@Test
	public void testMerge() {
		assertNull(Stage3.merge(null, null));
		assertNull(Stage3.merge(null, new int[] { 10, 20, 30 }));
		assertNull(Stage3.merge(new int[] { 10, 20, 30 }, null));
		assertEquals("[10, 20, 30, 70, 70, 90]",
				Arrays.toString(Stage3.merge(new int[] { 10, 20, 30 }, new int[] { 70, 70, 90 })));
		assertEquals("[10, 20, 30, 70, 70, 90]",
				Arrays.toString(Stage3.merge(new int[] { 70, 70, 90 }, new int[] { 10, 20, 30 })));
		assertEquals("[10, 20, 70, 70, 80, 90]",
				Arrays.toString(Stage3.merge(new int[] { 10, 70, 90 }, new int[] { 20, 70, 80 })));
		assertEquals("[5, 10, 10, 15, 20, 30, 35, 40, 50]",
				Arrays.toString(Stage3.merge(new int[] { 10, 10, 20, 30, 40, 50 }, new int[] { 5, 15, 35 })));
	}

	@Test
	public void testSort() {
		Unit a = new Unit("COMP1010", 400);
		Unit b = new Unit("COMP1000", 1000);
		Unit c = new Unit("COMP1350", 1000);
		Unit d = new Unit("STAT1070", 1500);
		Unit e = new Unit("COMP1000", 1000);
		Unit[] data = new Unit[] { a, d, c };
		assertEquals("[STAT1070: 1500, COMP1350: 1000, COMP1010: 400]", Arrays.toString(Stage3.sort(data)));
		data = new Unit[] { b, d, c, a, e };
		assertEquals("[STAT1070: 1500, COMP1350: 1000, COMP1000: 1000, COMP1000: 1000, COMP1010: 400]",
				Arrays.toString(Stage3.sort(data)));
		assertFalse(data[1] == e, "Should be b since b occured before e in the array");
	}

	@Test
	public void testSortTwoArrays() {
		assertNull(Stage3.sortTwoArrays(null, null));
		assertNull(Stage3.sortTwoArrays(new int[] { 20, 70, 10 }, null));
		assertNull(Stage3.sortTwoArrays(null, new int[] { 20, 70, 10 }));
		assertNull(Stage3.sortTwoArrays(new int[] { 20, 70, 10 }, new int[] { 20, 70, 10, 5 }));
		assertNull(Stage3.sortTwoArrays(new int[] { 20, 70, 10, 5 }, new int[] { 20, 70, 10 }));

		int[] weight = new int[] { 1, 4, 2 };
		assertEquals("[20, 10, 70]", Arrays.toString(Stage3.sortTwoArrays(new int[] { 20, 70, 10 }, weight)));
		assertEquals("[1, 4, 2]", Arrays.toString(weight), "ensure that you didn't modify the weight array");
		assertEquals("[70, 20, 90, 10]",
				Arrays.toString(Stage3.sortTwoArrays(new int[] { 20, 70, 10, 90 }, new int[] { 3, 1, 90, 4 })));
		assertEquals("[70, 90, 10, 20]",
				Arrays.toString(Stage3.sortTwoArrays(new int[] { 20, 90, 10, 70 }, new int[] { 3, 1, 2, 1 })));
	}

	@Test
	public void testSortPositiveNegative() {
		assertNull(Stage3.sortPositiveNegative(null));
		assertEquals("[10, 20, 70]", Arrays.toString(Stage3.sortPositiveNegative(new int[] { 20, 70, 10 })));
		assertEquals("[-70, -20, -10]", Arrays.toString(Stage3.sortPositiveNegative(new int[] { -20, -70, -10 })));
		assertEquals("[10, 20, 70, -11, -5, -4]",
				Arrays.toString(Stage3.sortPositiveNegative(new int[] { -5, 20, 70, -4, 10, -11 })));
		assertEquals("[0, 10, 20, 70, -5, -4]",
				Arrays.toString(Stage3.sortPositiveNegative(new int[] { -4, 20, 70, -5, 10, 0 })));
	}

	@Test
	public void testSortOddEven() {
		assertNull(Stage3.sortOddEven(null));
		assertEquals("[10, 20, 70]", Arrays.toString(Stage3.sortOddEven(new int[] { 20, 70, 10 })));
		assertEquals("[-75, 15, 25]", Arrays.toString(Stage3.sortOddEven(new int[] { 25, -75, 15 })));
		assertEquals("[4, 10, 20, 70, 5, 11]", Arrays.toString(Stage3.sortOddEven(new int[] { 11, 20, 5, 70, 10, 4 })));
		assertEquals("[-4, 10, 20, 70, -11, -5]",
				Arrays.toString(Stage3.sortOddEven(new int[] { -4, 20, 70, -5, 10, -11 })));

	}

	@Test
	public void testSort2Dinto1D() {
		assertNull(Stage3.sort2Dinto1D(null));
		assertEquals("[1, 2, 7, 10, 20, 70, 200, 300, 400]",
				Arrays.toString(Stage3.sort2Dinto1D(new int[][] { { 2, 7, 1 }, { 20, 70, 10 }, { 300, 200, 400 } })));
		assertEquals("[1, 2, 7, 10, 20, 70, 200, 300, 400]",
				Arrays.toString(Stage3.sort2Dinto1D(new int[][] { { 2, 70, 1 }, { 20, 7, 10 }, { 300, 200, 400 } })));
		assertEquals("[10, 15, 20, 40, 70, 90]",
				Arrays.toString(Stage3.sort2Dinto1D(new int[][] { { 20, 70 }, { 10 }, { 15, 90, 40 } })));

	}

	@Test
	public void testFirstValue() {
		assertNull(Stage3.sort2Dinto1D(null));
		int[][] data = new int[][] { { 50, 60, 70 }, { 70, 80, 90 }, { 10, 20, 30 } };
		assertEquals("[[10, 20, 30], [50, 60, 70], [70, 80, 90]]", Arrays.deepToString(Stage3.sortFirstValue(data)));
		data = new int[][] { { 10, 70, 5 }, { 90 }, { 10, 70, 20 }, { 10, 70 } };
		assertEquals("[[10, 70], [10, 70, 5], [10, 70, 20], [90]]", Arrays.deepToString(Stage3.sortFirstValue(data)));
		data = new int[][] { { 90, 5 }, { 90 }, {}, { 2, 4, 8 }, { 90, 4, 10, 70, 20 } };
		assertEquals("[[], [2, 4, 8], [90], [90, 4, 10, 70, 20], [90, 5]]",
				Arrays.deepToString(Stage3.sortFirstValue(data)));
		
		data = new int[][] {{70, 10, 20}, { 10, 70, 20 }, { 90 }, { 10, 70, 20 } };
		int hash1 = data[1].hashCode();
		int hash2 = data[3].hashCode();
		assertEquals("[[10, 70, 20], [10, 70, 20], [70, 10, 20], [90]]",
				Arrays.deepToString(Stage3.sortFirstValue(data)));
		assertNotEquals(hash1, data[1].hashCode());
		assertEquals(hash1, data[0].hashCode());
		assertEquals(hash2, data[1].hashCode());

	}

	@Test
	public void testSortAscending() {
		assertNull(Stage3.sortAscending(null));
		assertEquals("[[1, 2, 7], [10, 20, 70], [200, 300, 400]]", Arrays
				.deepToString(Stage3.sortAscending(new int[][] { { 2, 7, 1 }, { 20, 70, 10 }, { 300, 200, 400 } })));
		assertEquals("[[1, 2, 7], [10, 20, 70], [200, 300, 400]]", Arrays
				.deepToString(Stage3.sortAscending(new int[][] { { 2, 70, 1 }, { 20, 7, 10 }, { 300, 200, 400 } })));
		assertEquals("[[10, 15], [20], [40, 70, 90]]",
				Arrays.deepToString(Stage3.sortAscending(new int[][] { { 20, 70 }, { 10 }, { 15, 90, 40 } })));

	}

}
