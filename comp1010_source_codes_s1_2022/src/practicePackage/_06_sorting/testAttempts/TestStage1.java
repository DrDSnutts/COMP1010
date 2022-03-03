package practicePackage._06_sorting.testAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import practicePackage._06_sorting.attempts.*;

public class TestStage1 {
	@Test
	public void testSwap() {
		int[] data = new int[] { 10, 20, 5, 70, 90 };
		assertNull(Stage1.swap(data, -1, 3));
		assertNull(Stage1.swap(data, 7, 3));
		assertNull(Stage1.swap(data, 1, 10));
		assertNull(Stage1.swap(data, 4, -2));
		assertEquals("[70, 20, 5, 10, 90]", Arrays.toString(Stage1.swap(data, 0, 3)));
		assertEquals("[70, 5, 20, 10, 90]", Arrays.toString(Stage1.swap(data, 1, 2)));
		assertEquals("[70, 10, 20, 5, 90]", Arrays.toString(Stage1.swap(data, 1, 3)));
		assertEquals("[5, 10, 20, 70, 90]", Arrays.toString(Stage1.swap(data, 3, 0)));
		assertEquals("[5, 20, 10, 70, 90]", Arrays.toString(Stage1.swap(data, 1, 2)));
	}

	@Test
	public void testPartSorted() {
		assertEquals(-1, Stage1.partSorted(null));
		assertEquals(1, Stage1.partSorted(new int[] { 90, 20, 40, 100 }));
		assertEquals(4, Stage1.partSorted(new int[] { 10, 20, 40, 100 }));
		assertEquals(3, Stage1.partSorted(new int[] { 10, 20, 90, 70 }));
		assertEquals(4, Stage1.partSorted(new int[] { 20, 20, 30, 40, 5, 70, 90, 80 }));
	}

	@Test
	public void testDuplicates() {
		assertFalse(Stage1.duplicates(null));
		assertFalse(Stage1.duplicates(new int[] {}));
		assertFalse(Stage1.duplicates(new int[] { 10, 20, 70, 90 }));
		assertFalse(Stage1.duplicates(new int[] { 5, 10, 15, 20, 70, 80, 90 }));
		assertTrue(Stage1.duplicates(new int[] { 5, 5, 10, 15, 20, 70, 80, 90 }));
		assertTrue(Stage1.duplicates(new int[] { 5, 10, 15, 20, 70, 90, 90 }));
		assertTrue(Stage1.duplicates(new int[] { 5, 10, 15, 15, 15, 20, 70, 80, 90 }));
	}
}
