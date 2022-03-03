package practicePackage._04_recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._04_recursion.attempts.*;

public class Stage2Test {
	@Test
	public void testCountDigits() {
		assertEquals(0, Stage2.countDigits(0));
		assertEquals(1, Stage2.countDigits(8));
		assertEquals(4, Stage2.countDigits(1729));
		assertEquals(4, Stage2.countDigits(-1729));
		assertEquals(5, Stage2.countDigits(80264));
		assertEquals(5, Stage2.countDigits(-80264));
		assertEquals(10, Stage2.countDigits(1234567890));
	}

	@Test
	public void testSumEvenDigits() {
		assertEquals(2, Stage2.sumEvenDigits(1729));
		assertEquals(2, Stage2.sumEvenDigits(-1729));
		assertEquals(6, Stage2.sumEvenDigits(-6179));
		assertEquals(0, Stage2.sumEvenDigits(1739));
		assertEquals(0, Stage2.sumEvenDigits(-1739));
		assertEquals(20, Stage2.sumEvenDigits(80264));
		assertEquals(20, Stage2.sumEvenDigits(-80264));
	}

	@Test
	public void testSumDigitsOver() {
		assertEquals(16, Stage2.sumDigitsOver(1729, 3));
		assertEquals(18, Stage2.sumDigitsOver(-1729, 1));
		assertEquals(0, Stage2.sumDigitsOver(1739, 9));
		assertEquals(20, Stage2.sumDigitsOver(8264, 0));
		assertEquals(8, Stage2.sumDigitsOver(-80264, 7));
		assertEquals(30, Stage2.sumDigitsOver(1234567890, 5));
		assertEquals(45, Stage2.sumDigitsOver(1234567890, 0));
		assertEquals(45, Stage2.sumDigitsOver(987654321, 0));
	}

	@Test
	public void testCountDigit() {
		assertEquals(0, Stage2.countDigit(0, 0));
		assertEquals(1, Stage2.countDigit(8, 8));
		assertEquals(0, Stage2.countDigit(8, 5));
		assertEquals(2, Stage2.countDigit(1721, 1));
		assertEquals(2, Stage2.countDigit(-1721, 1));
		assertEquals(5, Stage2.countDigit(-1212121212, 1));
		assertEquals(5, Stage2.countDigit(-1212121212, 2));
		assertEquals(0, Stage2.countDigit(-1212121212, 3));
		assertEquals(3, Stage2.countDigit(888, 8));
		assertEquals(3, Stage2.countDigit(-888, 8));
	}
	
	@Test
	public void testFirstDigit() {
		assertEquals(0, Stage2.firstDigit(0));
		assertEquals(8, Stage2.firstDigit(8));
		assertEquals(8, Stage2.firstDigit(-8));
		assertEquals(1, Stage2.firstDigit(1729));
		assertEquals(1, Stage2.firstDigit(-1729));
		assertEquals(5, Stage2.firstDigit(5678));
		assertEquals(4, Stage2.firstDigit(412356789));
		assertEquals(8, Stage2.firstDigit(812356799));
		assertEquals(4, Stage2.firstDigit(-412356789));
		assertEquals(8, Stage2.firstDigit(-812356799));
		assertEquals(5, Stage2.firstDigit(-5678));
	}

	@Test
	public void testProduct() {
		assertEquals(18, Stage2.product(2, 9));
		assertEquals(1500, Stage2.product(30, 50));
		assertEquals(150, Stage2.product(3, 50));
		assertEquals(200, Stage2.product(2, 100));
		assertEquals(61, Stage2.product(61, 1));
		assertEquals(12353*1153, Stage2.product(12353, 1153));
	}

	@Test
	public void testFibonacci() {
		assertEquals(0, Stage2.fibonacci(0));
		assertEquals(1, Stage2.fibonacci(1));
		assertEquals(5, Stage2.fibonacci(5));
		assertEquals(8, Stage2.fibonacci(6));
		assertEquals(21, Stage2.fibonacci(8));
		assertEquals(102334155, Stage2.fibonacci(40));
	}

	@Test
	public void testTribonacci() {
		assertEquals(0, Stage2.tribonacci(0));
		assertEquals(0, Stage2.tribonacci(1));
		assertEquals(1, Stage2.tribonacci(2));
		assertEquals(1, Stage2.tribonacci(3));
		assertEquals(2, Stage2.tribonacci(4));
		assertEquals(4, Stage2.tribonacci(5));
		assertEquals(7, Stage2.tribonacci(6));
		assertEquals(13, Stage2.tribonacci(7));
		assertEquals(755476, Stage2.tribonacci(25));
	}
	
	@Test
	public void testCombinations() {
		assertEquals(1, Stage2.combinations(5, 0));
		assertEquals(1, Stage2.combinations(2, 2));
		assertEquals(10, Stage2.combinations(5, 3));
		assertEquals(120, Stage2.combinations(10, 7));
		assertEquals(38760, Stage2.combinations(20, 14));
	}		
	
	@Test
	public void testHighestDigit() {
		assertEquals(7, Stage2.highestDigit(1732));
		assertEquals(7, Stage2.highestDigit(-1732));
		assertEquals(9, Stage2.highestDigit(-917308562));
		assertEquals(9, Stage2.highestDigit(917308562));
		assertEquals(8, Stage2.highestDigit(888));
		assertEquals(0, Stage2.highestDigit(0));
	}
	
	@Test
	public void testSmallestDigit() {
		assertEquals(1, Stage2.smallestDigit(1732));
		assertEquals(1, Stage2.smallestDigit(-1732));
		assertEquals(0, Stage2.smallestDigit(-917308562));
		assertEquals(0, Stage2.smallestDigit(917308562));
		assertEquals(1, Stage2.smallestDigit(-917318562));
		assertEquals(1, Stage2.smallestDigit(917318562));
		assertEquals(8, Stage2.smallestDigit(888));
		assertEquals(0, Stage2.smallestDigit(0));
	}
	
	@Test
	public void testSmallestEvenDigit() {
		assertEquals(2, Stage2.smallestEvenDigit(1732));
		assertEquals(2, Stage2.smallestEvenDigit(-1732));
		assertEquals(0, Stage2.smallestEvenDigit(-917308562));
		assertEquals(0, Stage2.smallestEvenDigit(917308562));
		assertEquals(8, Stage2.smallestEvenDigit(-91738511));
		assertEquals(8, Stage2.smallestEvenDigit(917385311));
		assertEquals(8, Stage2.smallestEvenDigit(888));
		assertEquals(0, Stage2.smallestEvenDigit(0));
	}
	
	@Test
	public void testHighestEvenDigit() {
		assertEquals(8, Stage2.highestEvenDigit(17382));
		assertEquals(6, Stage2.highestEvenDigit(-61732));
		assertEquals(8, Stage2.highestEvenDigit(888));
		assertEquals(0, Stage2.highestEvenDigit(0));
		assertEquals(8, Stage2.highestEvenDigit(-917308562));
		assertEquals(8, Stage2.highestEvenDigit(917308562));
		assertEquals(0, Stage2.highestEvenDigit(-957313579));
		assertEquals(0, Stage2.highestEvenDigit(957313579));
	}
	
	@Test
	public void testHighestEvenDigitLocation() {
		assertEquals(2, Stage2.highestEvenDigitLocation(17382));
		assertEquals(5, Stage2.highestEvenDigitLocation(-61732));
		assertEquals(1, Stage2.highestEvenDigitLocation(888));
		assertEquals(0, Stage2.highestEvenDigitLocation(0));
		assertEquals(3, Stage2.highestEvenDigitLocation(-864));
		assertEquals(4, Stage2.highestEvenDigitLocation(-917308562));
		assertEquals(4, Stage2.highestEvenDigitLocation(917308562));
		assertEquals(0, Stage2.highestEvenDigitLocation(-957313579));
		assertEquals(0, Stage2.highestEvenDigitLocation(957313579));	
	}
	
	@Test
	public void testHighestDigitLocation() {
		assertEquals(2, Stage2.highestDigitLocation(17382));
		assertEquals(3, Stage2.highestDigitLocation(-61732));
		assertEquals(1, Stage2.highestDigitLocation(888));
		assertEquals(0, Stage2.highestDigitLocation(0));
		assertEquals(3, Stage2.highestDigitLocation(-864));
		assertEquals(8, Stage2.highestDigitLocation(-197308562));
		assertEquals(8, Stage2.highestDigitLocation(197308562));
		assertEquals(1, Stage2.highestDigitLocation(-957313579));
		assertEquals(1, Stage2.highestDigitLocation(957313579));	
	}
	
	@Test
	public void testSmallestDigitLocation() {
		assertEquals(5, Stage2.smallestDigitLocation(17382));
		assertEquals(4, Stage2.smallestDigitLocation(-61732));
		assertEquals(1, Stage2.smallestDigitLocation(888));
		assertEquals(0, Stage2.smallestDigitLocation(0));
		assertEquals(1, Stage2.smallestDigitLocation(-864));
		assertEquals(9, Stage2.smallestDigitLocation(-197348562));
		assertEquals(9, Stage2.smallestDigitLocation(197348562));
		assertEquals(5, Stage2.smallestDigitLocation(-957313572));
		assertEquals(5, Stage2.smallestDigitLocation(957313572));	
		assertEquals(1, Stage2.smallestDigitLocation(-957353572));
		assertEquals(1, Stage2.smallestDigitLocation(957353572));	
	}
}
