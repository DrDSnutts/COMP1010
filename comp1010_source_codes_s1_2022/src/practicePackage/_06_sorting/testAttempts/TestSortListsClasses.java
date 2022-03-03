package practicePackage._06_sorting.testAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import practicePackage._06_sorting.attempts.*;

public class TestSortListsClasses {
	@Test
	public void testCompareTo() {
		Unit a = new Unit("COMP1010", 400);
		Unit b = new Unit("COMP1000", 1000);
		Unit c = new Unit("COMP1010", 1000);
		assertEquals(-1, a.compareTo(b));
		assertEquals(1, b.compareTo(a));
		assertEquals(0, a.compareTo(a));
		assertEquals(-1, a.compareTo(c));
		assertEquals(1, c.compareTo(a));
		assertEquals(-1, b.compareTo(c));
		assertEquals(1, c.compareTo(b));
	}

	@Test
	public void testInsert() {
		ArrayList<Integer> list = new ArrayList<>();
		assertNull(SortLists.insert(null, 10));
		assertNotNull(SortLists.insert(list, 10));
		assertEquals("[10]", SortLists.insert(list, 10).toString());
		assertEquals("[10, 70]", SortLists.insert(list, 70).toString());
		assertEquals("[10, 20, 70]", SortLists.insert(list, 20).toString());
		assertEquals("[10, 20, 70, 90]", SortLists.insert(list, 90).toString());
		assertEquals("[5, 10, 20, 70, 90]", SortLists.insert(list, 5).toString());
		assertEquals("[5, 10, 20, 20, 70, 90]", SortLists.insert(list, 20).toString());
	}

	@Test
	public void testInsertUnique() {
		ArrayList<Integer> list = new ArrayList<>();
		assertNull(SortLists.insertUnique(null, 10));
		assertNotNull(SortLists.insertUnique(list, 10));
		assertEquals("[10]", SortLists.insertUnique(list, 10).toString());
		assertEquals("[10, 70]", SortLists.insertUnique(list, 70).toString());
		assertEquals("[10, 20, 70]", SortLists.insertUnique(list, 20).toString());
		assertEquals("[10, 20, 70, 90]", SortLists.insertUnique(list, 90).toString());
		assertEquals("[5, 10, 20, 70, 90]", SortLists.insertUnique(list, 5).toString());
		assertEquals("[5, 10, 20, 70, 90]", SortLists.insertUnique(list, 20).toString());
	}

	@Test
	public void testSortInput() {
		assertNull(SortLists.sortInput(null, 1));
		assertNotNull(SortLists.sortInput(new int[][] {}, 3));
		assertEquals("[[], [], []]", SortLists.sortInput(new int[][] {}, 3).toString());

		int[][] data = new int[][] { { 1, 3 }, { 2, 1 }, { 2, 0 } };
		assertEquals("[[2], [2, 3], [0, 1], [1]]", SortLists.sortInput(data, 4).toString());
		assertEquals("[[1, 3], [2, 1], [2, 0]]", Arrays.deepToString(data));

		data = new int[][] { { 1, 2 }, { 2, 1 }, { 0, 1 }, { 1, 1 }, { 0, 1 }, { 2, 0 } };
		assertEquals("[[1, 2], [0, 2], [0, 1]]", SortLists.sortInput(data, 3).toString());

		data = new int[][] { { 5, 1 }, { 1, 2 }, { 2, 0 }, { 0, 1 }, { 0, 4 }, { 4, 5 } };
		assertEquals("[[1, 2, 4], [0, 2, 5], [0, 1], [], [0, 5], [1, 4]]", SortLists.sortInput(data, 6).toString());

	}
}
