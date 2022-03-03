package practicePackage._01_introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._01_introduction.attempts.Stage4;

public class Stage4Test {
	@Test
	void testIndexOf() {
		assertEquals(0, Stage4.indexOf(new int[] {10,10,10}, 10));
		assertEquals(2, Stage4.indexOf(new int[] {10,10,20}, 20));
		assertEquals(-1, Stage4.indexOf(new int[] {10,10,20}, 30));
		assertEquals(8, Stage4.indexOf(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 9));
	}
	
	@Test
	void testlastIndexOf() {
		assertEquals(2, Stage4.lastIndexOf(new int[] {10,10,10}, 10));
		assertEquals(0, Stage4.lastIndexOf(new int[] {20,10,10}, 20));
		assertEquals(-1, Stage4.lastIndexOf(new int[] {10,10,20}, 30));
		assertEquals(8, Stage4.lastIndexOf(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 9));
	}
	
	@Test
	void testFibonacci() {
		assertEquals(0, Stage4.fibonacci(0));
		assertEquals(1, Stage4.fibonacci(1));
		assertEquals(5, Stage4.fibonacci(5));
		assertEquals(8, Stage4.fibonacci(6));
		assertEquals(34, Stage4.fibonacci(9));
		assertEquals(9227465, Stage4.fibonacci(35));
	}
	
	@Test
	void testGcd() {
		assertEquals(10, Stage4.gcd(70, 40));
		assertEquals(10, Stage4.gcd(40, 70));
		assertEquals(1, Stage4.gcd(15, 32));
		assertEquals(51, Stage4.gcd(-51, 153));
		assertEquals(100, Stage4.gcd(100, 10000));
	}
	
	@Test
	void testHighestPerfectSquare() {
		assertEquals(16, Stage4.highestPerfectSquare(20));
		assertEquals(1, Stage4.highestPerfectSquare(1));
		assertEquals(256, Stage4.highestPerfectSquare(278));
		assertEquals(1000000, Stage4.highestPerfectSquare(1000000));
	}
	
	@Test
	void testIsSquare() {
		assertTrue(Stage4.isSquare(25));
		assertTrue(Stage4.isSquare(6561));
		assertTrue(Stage4.isSquare(739 * 739));
		assertFalse(Stage4.isSquare(251));
		assertFalse(Stage4.isSquare(-25));
		assertFalse(Stage4.isSquare(1000001));
	}
	
	@Test
	void testMedian() {
		assertEquals(2, Stage4.median(2, 2, 8));
		assertEquals(5, Stage4.median(5, 2, 5));
		assertEquals(7, Stage4.median(2, 7, 7));
		assertEquals(8, Stage4.median(8, 8, 8));
		assertEquals(2, Stage4.median(2, 1, 8));
		assertEquals(3, Stage4.median(5, 2, 3));
		assertEquals(7, Stage4.median(9, 7, 2));
		assertEquals(7, Stage4.median(2, 7, 9));
		assertEquals(831325, Stage4.median(831325, 725353, 9345363));
	}
	
	@Test
	void testRoundOffAdvanced() {
		assertEquals(2, Stage4.roundOffAdvanced(1.99));
		assertEquals(-2, Stage4.roundOffAdvanced(-1.99));
		assertEquals(1, Stage4.roundOffAdvanced(1.49));
		assertEquals(-1, Stage4.roundOffAdvanced(-1.49));
		assertEquals(1, Stage4.roundOffAdvanced(0.75));
		assertEquals(7, Stage4.roundOffAdvanced(7.0));
		assertEquals(6, Stage4.roundOffAdvanced(5.9999));
		assertEquals(401, Stage4.roundOffAdvanced(400.5));
		assertEquals(-1, Stage4.roundOffAdvanced(-0.501));
	}
	
	@Test
	void testFloorAdvanced() {
		assertEquals(1, Stage4.floorAdvanced(1.99));
		assertEquals(0, Stage4.floorAdvanced(0.75));
		assertEquals(7, Stage4.floorAdvanced(7.00));
		assertEquals(5, Stage4.floorAdvanced(5.9999));
		assertEquals(-4, Stage4.floorAdvanced(-3.7));
		assertEquals(-4, Stage4.floorAdvanced(-3.1));
		assertEquals(400, Stage4.floorAdvanced(400.001));
		assertEquals(-500, Stage4.floorAdvanced(-499.99999));
	}
	
	@Test
	void testCeilingAdvanced() {
		assertEquals(5, Stage4.ceilingAdvanced(4.2));
		assertEquals(7, Stage4.ceilingAdvanced(7.0));
		assertEquals(6, Stage4.ceilingAdvanced(5.999));
		assertEquals(-3, Stage4.ceilingAdvanced(-3.7));
		assertEquals(-3, Stage4.ceilingAdvanced(-3.1));
		assertEquals(0, Stage4.ceilingAdvanced(0.0));
		assertEquals(0, Stage4.ceilingAdvanced(-0.99));
	}
	
	@Test
	void testGetWithout() {
		assertEquals("super", Stage4.getWithout("super", -1)); //no change
		assertEquals("super", Stage4.getWithout("super", 5)); //no change
		assertEquals("uper", Stage4.getWithout("super", 0));
		assertEquals("supe", Stage4.getWithout("super", 4));
		assertEquals("sper", Stage4.getWithout("super", 1));
		assertEquals("suer", Stage4.getWithout("super", 2));
		assertEquals("a b cd ", Stage4.getWithout("a b c d ", 5));
	}
	
	@Test
	void testIsNumeric() {
		assertTrue(Stage4.isNumeric("1234567890"));
		assertTrue(Stage4.isNumeric("34038459308572893457549637966556"));
		assertFalse(Stage4.isNumeric("a234567890"));
		assertFalse(Stage4.isNumeric("123456789a"));
		assertFalse(Stage4.isNumeric("01234-67890"));
		assertTrue(Stage4.isNumeric("340753287585732985735923659364572365139576329563578326583756328573265872635873658376587356387563875365873"));
		assertFalse(Stage4.isNumeric("340753287585732985735923659364572365139576329563578326583756328573265872635873658376587356387%563875365873"));
	}	
	
	@Test
	void testWithoutLeadingZeroes() {
		assertEquals("7", Stage4.withoutLeadingZeroes("007"));
		assertEquals("", Stage4.withoutLeadingZeroes(""));
		assertEquals("COMP1010", Stage4.withoutLeadingZeroes("0COMP1010"));
		assertEquals("COMP1010 is the best unit ever! 000000000000", Stage4.withoutLeadingZeroes("COMP1010 is the best unit ever! 000000000000"));
		assertEquals("", Stage4.withoutLeadingZeroes("000000000000000000000000000"));
	}
	
	@Test
	void testReverse() {
		assertEquals("", Stage4.reverse(""));
		assertEquals("$", Stage4.reverse("$"));
		assertEquals("Super nintendo chalmers", Stage4.reverse("sremlahc odnetnin repuS"));
	}
	
	@Test
	void testIsPalindrome() {
		assertTrue(Stage4.isPalindrome("madam"));
		assertFalse(Stage4.isPalindrome("reaper"));
		assertTrue(Stage4.isPalindrome("nintendo odnetnin"));
		assertTrue(Stage4.isPalindrome(""));
		assertTrue(Stage4.isPalindrome("%"));
	}	
	
	@Test
	void testIsConcatTwoSquares() {
		assertTrue(Stage4.isConcatTwoSquares(164));
		assertTrue(Stage4.isConcatTwoSquares(1000));
		assertTrue(Stage4.isConcatTwoSquares(2566561));
		assertTrue(Stage4.isConcatTwoSquares(11000000));
		assertTrue(Stage4.isConcatTwoSquares(2500));
		assertFalse(Stage4.isConcatTwoSquares(25));
		assertFalse(Stage4.isConcatTwoSquares(10007));
		assertFalse(Stage4.isConcatTwoSquares(12345));
		assertFalse(Stage4.isConcatTwoSquares(2147483647));
	}
}
