package practicePackage._06_sorting.testAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import practicePackage._06_sorting.attempts.*;

public class TestStage2 {
	@Test
	public void testShiftToRightPlace() {
		assertNull(Stage2.shiftToRightPlace(null, 0));
		assertEquals("[10, 20, 70, 90]", Arrays.toString(Stage2.shiftToRightPlace(new int[] { 10, 20, 70, 90 }, 1)));
		assertEquals("[10, 20, 70, 40]", Arrays.toString(Stage2.shiftToRightPlace(new int[] { 10, 70, 20, 40 }, 2)));
		assertEquals("[10, 10, 20, 40, 70, 70, 90]",
				Arrays.toString(Stage2.shiftToRightPlace(new int[] { 10, 10, 20, 70, 70, 90, 40 }, 6)));
		assertEquals("[-5, 10, 70, 40]", Arrays.toString(Stage2.shiftToRightPlace(new int[] { 10, 70, -5, 40 }, 2)));
	}

	@Test
	public void testSwapToRightPlace() {
		assertNull(Stage2.swapToRightPlace(null, 0));
		assertEquals("[20, 70, 40, 90, 30, 80, 20]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 40, 70, 20, 90, 30, 80, 20 }, 0)));
		assertEquals("[20, 20, 40, 90, 30, 80, 70]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 70, 40, 90, 30, 80, 20 }, 1)));
		assertEquals("[20, 20, 30, 90, 40, 80, 70]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 20, 40, 90, 30, 80, 70 }, 2)));
		assertEquals("[20, 20, 30, 40, 90, 80, 70]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 20, 30, 90, 40, 80, 70 }, 3)));
		assertEquals("[20, 20, 30, 40, 70, 80, 90]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 20, 30, 40, 90, 80, 70 }, 4)));
		assertEquals("[20, 20, 30, 40, 70, 80, 90]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 20, 30, 40, 70, 80, 90 }, 5)));
		assertEquals("[20, 20, 30, 40, 70, 80, 90]",
				Arrays.toString(Stage2.swapToRightPlace(new int[] { 20, 20, 30, 40, 70, 80, 90 }, 6)));
	}

	@Test
	public void testPair() {
		assertNull(Stage2.pair(null));
		assertEquals("[]", Arrays.toString(Stage2.pair(new int[] {})));
		assertEquals("[100, 90]", Arrays.toString(Stage2.pair(new int[] { 10, 20, 70, 90 })));
		assertEquals("[15, 16, 15]", Arrays.toString(Stage2.pair(new int[] { 3, 5, 7, 8, 11, 12 })));
		assertEquals("[14, 12, 15]", Arrays.toString(Stage2.pair(new int[] { -2, 0, 7, 8, 12, 16 })));
		assertEquals("[1003, 17, 15, 14]", Arrays.toString(Stage2.pair(new int[] { 3, 3, 3, 8, 6, 12, 14, 1000 })));
	}

	@Test
	public void testMostCommon() {
		assertEquals(-1, Stage2.mostCommon(null));
		assertEquals(-1, Stage2.mostCommon(new int[] {}));
		assertEquals(10, Stage2.mostCommon(new int[] { 10, 20, 70, 90 }));
		assertEquals(20, Stage2.mostCommon(new int[] { 10, 20, 20, 70, 70, 90 }));
		assertEquals(20, Stage2.mostCommon(new int[] { 10, 20, 20, 20, 70, 70, 90 }));
		assertEquals(70, Stage2.mostCommon(new int[] { 10, 20, 20, 70, 70, 70, 90 }));
		assertEquals(90, Stage2.mostCommon(new int[] { 10, 20, 20, 70, 70, 90, 90, 90 }));
		assertEquals(-5, Stage2.mostCommon(new int[] { -5, -5, -5, -5, 10, 10, 10, 20, 20 }));

	}

	@Test
	public void testIsSorted() {
		assertFalse(Stage2.isSorted(null));
		assertFalse(Stage2.isSorted(new int[] { 10, 20, 70, 90, 5 }));
		assertFalse(Stage2.isSorted(new int[] { 90, 70, 4, 20, 10 }));
		assertFalse(Stage2.isSorted(new int[] { 5, 90, 70, 20, 10 }));
		assertFalse(Stage2.isSorted(new int[] { 10, 10, 10, 10, 5, 40, 80, 90 }));
		assertTrue(Stage2.isSorted(new int[] { 10 }));
		assertTrue(Stage2.isSorted(new int[] { 5, 10 }));
		assertTrue(Stage2.isSorted(new int[] { 10, 5 }));
		assertTrue(Stage2.isSorted(new int[] { 10, 20, 70, 90 }));
		assertTrue(Stage2.isSorted(new int[] { 90, 70, 20, 10 }));
		assertTrue(Stage2.isSorted(new int[] { 10, 20, 20, 70, 90 }));
		assertTrue(Stage2.isSorted(new int[] { 90, 70, 20, 10, 10 }));
		assertTrue(Stage2.isSorted(new int[] { 10, 10, 10, 10, 35, 40, 80, 90 }));
		assertTrue(Stage2.isSorted(new int[] { 10, 10, 10, 10, 9, 8, 7 }));
	}

	@Test
	public void testInsertAtRightPlace() {
		assertNull(Stage2.insertAtRightPlace(null, 0));
		assertEquals("[5, 10, 20, 70, 90]",
				Arrays.toString(Stage2.insertAtRightPlace(new int[] { 10, 20, 70, 90 }, 5)));
		assertEquals("[10, 20, 70, 90, 100]",
				Arrays.toString(Stage2.insertAtRightPlace(new int[] { 10, 20, 70, 90 }, 100)));
		assertEquals("[10, 20, 30, 70, 90]",
				Arrays.toString(Stage2.insertAtRightPlace(new int[] { 10, 20, 70, 90 }, 30)));
	}

	@Test
	public void testSort() {
		assertEquals("[10, 20, 70, 90]", Arrays.toString(Stage2.sort(new int[] { 10, 70, 20, 90 })));
		assertEquals("[10, 20, 20, 30, 40, 70, 90]",
				Arrays.toString(Stage2.sort(new int[] { 20, 90, 10, 20, 40, 30, 70 })));
		assertEquals("[5, 5, 5, 10, 20]", Arrays.toString(Stage2.sort(new int[] { 20, 5, 5, 10, 5 })));
	}

	@Test
	public void testBubbleSortCount() {
		assertEquals(-1, Stage2.bubbleSortCount(null));
		assertEquals(0, Stage2.bubbleSortCount(new int[] {}));
		assertEquals(0, Stage2.bubbleSortCount(new int[] { 10, 20, 70, 90 }));
		assertEquals(1, Stage2.bubbleSortCount(new int[] { 10, 70, 20, 90 }));
		assertEquals(3, Stage2.bubbleSortCount(new int[] { 10, 70, 5, 20, 90 }));
		assertEquals(4, Stage2.bubbleSortCount(new int[] { 10, 70, 5, 20, 20, 90 }));
		assertEquals(5, Stage2.bubbleSortCount(new int[] { 10, 70, 5, 20, 90, 20 }));
		assertEquals(10, Stage2.bubbleSortCount(new int[] { 90, 70, 20, 10, 5 }));
		assertEquals(11, Stage2.bubbleSortCount(new int[] { 40, 70, 20, 90, 30, 80, 20 }));
		assertEquals(14, Stage2.bubbleSortCount(new int[] { 2, 3, -4, 7, 5, 1, 10, 12, 6, 8, 9 }));
	}

	@Test
	public void testInsertionSortCount() {
		assertEquals(-1, Stage2.insertionSortCount(null));
		assertEquals(0, Stage2.insertionSortCount(new int[] {}));
		assertEquals(0, Stage2.insertionSortCount(new int[] { 10, 20, 70, 90 }));
		assertEquals(1, Stage2.insertionSortCount(new int[] { 10, 70, 20, 90 }));
		assertEquals(3, Stage2.insertionSortCount(new int[] { 10, 70, 5, 20, 90 }));
		assertEquals(5, Stage2.insertionSortCount(new int[] { 10, 70, 5, 20, 20, 90 }));
		assertEquals(6, Stage2.insertionSortCount(new int[] { 10, 70, 5, 20, 90, 20 }));
		assertEquals(10, Stage2.insertionSortCount(new int[] { 90, 70, 20, 10, 5 }));
		assertEquals(12, Stage2.insertionSortCount(new int[] { 40, 70, 20, 90, 30, 80, 20 }));
		assertEquals(14, Stage2.insertionSortCount(new int[] { 2, 3, -4, 7, 5, 1, 10, 12, 6, 8, 9 }));
	}
}
