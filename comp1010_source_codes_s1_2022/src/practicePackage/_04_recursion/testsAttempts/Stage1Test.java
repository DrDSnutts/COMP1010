package practicePackage._04_recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._04_recursion.attempts.*;

public class Stage1Test  {	
	@Test
	public void testSum() {
		assertEquals(0, Stage1.sum(0));
		assertEquals(0, Stage1.sum(-5));
		assertEquals(6, Stage1.sum(3));	
		int n = (int)(300*Math.random()) + 100;
		int expected = n;
		expected*=(n+1);
		expected/=2;
		assertEquals(expected, Stage1.sum(n));
	}

	@Test
	public void testSumRange() {
		assertEquals(0, Stage1.sumRange(0, 0));
		assertEquals(20, Stage1.sumRange(20, 20));
		assertEquals(0, Stage1.sumRange(20, 10));
		assertEquals(26, Stage1.sumRange(5, 8));
		assertEquals(55, Stage1.sumRange(1, 10));
		assertEquals(800*(801)/2-500*(501)/2, Stage1.sumRange(501, 800));

	}

	@Test
	public void testProduct() {
		assertEquals(1, Stage1.product(0));
		assertEquals(1, Stage1.product(-5));
		assertEquals(120, Stage1.product(5));	
		assertEquals(3628800*11*12, Stage1.product(12));	
	}

	@Test
	public void testSumSquares() {
		assertEquals(0, Stage1.sumSquares(0));
		assertEquals(0, Stage1.sumSquares(-5));
		assertEquals(14, Stage1.sumSquares(3));	
		assertEquals(2686700, Stage1.sumSquares(200));	
	}

	@Test
	public void testSumEven() {
		assertEquals(0, Stage1.sumEven(0));
		assertEquals(0, Stage1.sumEven(-5));
		assertEquals(2, Stage1.sumEven(3));	
		assertEquals(6, Stage1.sumEven(4));	
		assertEquals(250500, Stage1.sumEven(1000));	
	}

	@Test
	public void testSumOdd() {
		assertEquals(0, Stage1.sumOdd(0));
		assertEquals(0, Stage1.sumOdd(-5));
		assertEquals(4, Stage1.sumOdd(3));	
		assertEquals(4, Stage1.sumOdd(4));	
		assertEquals(9, Stage1.sumOdd(5));	
		assertEquals(202500, Stage1.sumOdd(900));	
	}

	@Test
	public void testSumEvenSquares() {
		assertEquals(0, Stage1.sumEvenSquares(0));
		assertEquals(0, Stage1.sumEvenSquares(-5));
		assertEquals(20, Stage1.sumEvenSquares(5));	
		assertEquals(56, Stage1.sumEvenSquares(7));	
		assertEquals(120, Stage1.sumEvenSquares(8));	
		assertEquals(20958500, Stage1.sumEvenSquares(500));	
	}

	@Test
	public void testContainsDigit() {
		assertFalse(Stage1.containsDigit(null));
		assertFalse(Stage1.containsDigit(""));
		assertTrue(Stage1.containsDigit("c3po"));
		assertTrue(Stage1.containsDigit("90210"));
		assertTrue(Stage1.containsDigit("4chan"));
		assertFalse(Stage1.containsDigit("superman"));
		assertFalse(Stage1.containsDigit("no digits here :("));
	}
	
	@Test
	public void testSumOddSquares() {
		assertEquals(0, Stage1.sumOddSquares(0));
		assertEquals(0, Stage1.sumOddSquares(-5));
		assertEquals(10, Stage1.sumOddSquares(4));	
		assertEquals(35, Stage1.sumOddSquares(6));	
		assertEquals(84, Stage1.sumOddSquares(7));	
		assertEquals(35999900, Stage1.sumOddSquares(600));	
	}

	@Test
	public void testIsNumeric() {
		assertFalse(Stage1.isNumeric(null));
		assertTrue(Stage1.isNumeric(""));
		assertFalse(Stage1.isNumeric("c3po"));
		assertTrue(Stage1.isNumeric("90210"));
		assertTrue(Stage1.isNumeric("0"));
		assertTrue(Stage1.isNumeric("4057342587835373489543479354573967546947644293853429569365934"));
		assertFalse(Stage1.isNumeric("4chan"));
		assertFalse(Stage1.isNumeric("superman"));
		assertFalse(Stage1.isNumeric("no digits here :("));
	}

	@Test
	public void testContainsStringChar() {
		assertFalse(Stage1.contains(null, '$'));
		assertFalse(Stage1.contains("", '$'));
		assertFalse(Stage1.contains("superman", 'N')); //upper case
		assertTrue(Stage1.contains("superman", 'n'));
		assertTrue(Stage1.contains("superman", 's'));
		assertTrue(Stage1.contains("the quick brown fox jumped over something", 'x'));
		assertFalse(Stage1.contains("the quick brown fox jumped over something", 'z'));
	}

	@Test
	public void testContainsStringString() {
		assertFalse(Stage1.contains(null, "super"));
		assertFalse(Stage1.contains("", "super"));
		assertFalse(Stage1.contains("hi", null));
		assertFalse(Stage1.contains("superman", "MAN")); //upper case
		assertTrue(Stage1.contains("superman", "man"));
		assertTrue(Stage1.contains("Trinity? THE Trinity!?", "Trinity"));
		assertFalse(Stage1.contains("Trinity? THE Trinity!?", "night"));
	}

	@Test
	public void testPower() {
		assertEquals(4, Stage1.power(2, 2));	
		assertEquals(4, Stage1.power(-2, 2));	
		assertEquals(8, Stage1.power(2, 3));	
		assertEquals(65536, Stage1.power(2, 16));	
		assertEquals(1024*1024, Stage1.power(2, 20));	
		assertEquals(-8, Stage1.power(-2, 3));	
		assertEquals(1, Stage1.power(4, 0));	
		assertEquals(6561, Stage1.power(3, 8));	
	}
}
