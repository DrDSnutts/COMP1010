package practicePackage._01_introduction.testsAttempts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._01_introduction.attempts.Stage5;

public class Stage5Test {
	private int[] empty;
	private int[] singleItemArray;
	private int[] tenMultiples;
	private int[] negPos;
	private int[] ascAllPos;
	private int[] descNegs;
	private int[] multiplesTen1;
	private int[] multiplesTen2;
	private int[] mixedPosNeg;
	private int[] allZeroes1;
	private int[] allZeroes2;

	@BeforeEach
	public void run() {
		empty = new int[]{};
		singleItemArray = new int[]{777};
		multiplesTen1 = new int[]{10, 70, 20, 90};
		multiplesTen2 = new int[]{10, 70, 20, 90};
		mixedPosNeg = new int[]{-50, 30, -20, 0, 20, -30, 50};
		allZeroes1 = new int[]{0, 0, 0, 0, 0};
		allZeroes2 = new int[]{0, 0, 0, 0, 0};
		tenMultiples = new int[]{10,-70,-20,90};
		negPos = new int[]{-3, 15, -13, 16, -1, 10, -101};
		ascAllPos = new int[]{4, 7, 13, 28, 137, 224, 237, 254};
		descNegs = new int[]{-115, -125, -202, -225, -229, -255};
	}

	@Test
	public void testAllPositives() {
		assertFalse(Stage5.allPositives(null));
		assertTrue(Stage5.allPositives(empty));
		assertTrue(Stage5.allPositives(singleItemArray));
		assertFalse(Stage5.allPositives(tenMultiples));
		assertFalse(Stage5.allPositives(negPos));
		assertTrue(Stage5.allPositives(ascAllPos));
		assertFalse(Stage5.allPositives(descNegs));
		assertFalse(Stage5.allPositives(mixedPosNeg));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage5.allPositives(e));
	}

	@Test
	public void testContainsPositive() {
		assertFalse(Stage5.containsPositive(null));
		assertFalse(Stage5.containsPositive(empty));
		assertTrue(Stage5.containsPositive(singleItemArray));
		assertTrue(Stage5.containsPositive(tenMultiples));
		assertTrue(Stage5.containsPositive(negPos));
		assertTrue(Stage5.containsPositive(ascAllPos));
		assertFalse(Stage5.containsPositive(descNegs));
		assertTrue(Stage5.containsPositive(mixedPosNeg));
		int[] e = {0, 0, 0, 0, 0};
		assertFalse(Stage5.containsPositive(e));
	}

	@Test
	public void testIdentical() {
		assertFalse(Stage5.identical(multiplesTen1, null));
		assertFalse(Stage5.identical(null, multiplesTen2));
		assertFalse(Stage5.identical(null, null));
		assertFalse(Stage5.identical(empty, singleItemArray));
		assertTrue(Stage5.identical(multiplesTen1, multiplesTen2));
		assertTrue(Stage5.identical(multiplesTen2, multiplesTen1));
		assertFalse(Stage5.identical(multiplesTen1, new int[]{10, 20, 70, 90}));
		assertFalse(Stage5.identical(multiplesTen2, new int[]{10, 70, 20}));
		assertFalse(Stage5.identical(multiplesTen1, new int[]{10, 70}));
		assertFalse(Stage5.identical(multiplesTen2, new int[]{10}));
		assertTrue(Stage5.identical(allZeroes1, allZeroes2));
		assertTrue(Stage5.identical(allZeroes2, allZeroes1));
	}	
	
	@Test
	public void testContainsUptoIndex() {
		assertFalse(Stage5.containsUptoIndex(null, 35, 23));
		assertFalse(Stage5.containsUptoIndex(empty, 96, 69));
		assertTrue(Stage5.containsUptoIndex(singleItemArray, 777, 0));
		assertFalse(Stage5.containsUptoIndex(tenMultiples, 90, 4));
		assertFalse(Stage5.containsUptoIndex(negPos, -13, -1));
		assertTrue(Stage5.containsUptoIndex(ascAllPos, 254, 7));
		assertTrue(Stage5.containsUptoIndex(descNegs, -115, 0));
		int[] e = {7, 7, 7, 7, 7, 7, 7};
		assertTrue(Stage5.containsUptoIndex(e, 7, 0));
		assertTrue(Stage5.containsUptoIndex(e, 7, 6));
	}	
	
	@Test
	public void testGetFrequencyTable() {
		assertNull(Stage5.getFrequencyTable(null));
		assertNotNull(Stage5.getFrequencyTable(empty));
		assertEquals(0, Stage5.getFrequencyTable(empty).length);
		assertNotNull(Stage5.getFrequencyTable(singleItemArray));
		assertEquals("[1]", Arrays.toString(Stage5.getFrequencyTable(singleItemArray)));
		assertNotNull(Stage5.getFrequencyTable(mixedPosNeg));
		assertEquals("[1, 1, 1, 1, 1, 1, 1]", Arrays.toString(Stage5.getFrequencyTable(mixedPosNeg)));
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(Stage5.getFrequencyTable(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5})));
		assertEquals("[2, 3, 5]", Arrays.toString(Stage5.getFrequencyTable(new int[]{4, 7, 13, 13, 7, 13, 13, 13, 7, 4})));
	}	
}
