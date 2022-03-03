package practicePackage._01_introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._01_introduction.attempts.Stage3;

public class Stage3Test {
	@Test
	public void testSum() {
		assertEquals(1, Stage3.sum(1));
		assertEquals(55, Stage3.sum(10));
		assertEquals(1275, Stage3.sum(50));
	}

	@Test
	public void testSumEvenV1() {
		assertEquals(2, Stage3.sumEvenV1(1));
		assertEquals(110, Stage3.sumEvenV1(10));
		assertEquals(2550, Stage3.sumEvenV1(50));
	}

	@Test
	public void testSumOddV1() {
		assertEquals(1, Stage3.sumOddV1(1));
		assertEquals(100, Stage3.sumOddV1(10));
		assertEquals(2500, Stage3.sumOddV1(50));
	}

	@Test
	public void testSumEvenV2() {
		assertEquals(0, Stage3.sumEvenV2(1));
		assertEquals(30, Stage3.sumEvenV2(10));
		assertEquals(650, Stage3.sumEvenV2(50));
	}

	@Test
	public void testSumOddV2() {
		assertEquals(1, Stage3.sumOddV2(1));
		assertEquals(25, Stage3.sumOddV2(10));
		assertEquals(625, Stage3.sumOddV2(50));	
	}

	@Test
	public void testProduct() {
		assertEquals(120, Stage3.product(5));
		assertEquals(1, Stage3.product(1));
		assertEquals(1, Stage3.product(0));
		assertEquals(1, Stage3.product(-4));
		assertEquals(3628800, Stage3.product(10));
	}

	@Test
	public void testProductEven() {
		assertEquals(3840, Stage3.productEven(5));
		assertEquals(2, Stage3.productEven(1));
		assertEquals(1, Stage3.productEven(0));
		assertEquals(1, Stage3.productEven(-4));
		assertEquals(46080, Stage3.productEven(6));
	}

	@Test
	public void testProductOdd() {
		assertEquals(945, Stage3.productOdd(5));
		assertEquals(1, Stage3.productOdd(1));
		assertEquals(1, Stage3.productOdd(0));
		assertEquals(1, Stage3.productOdd(-4));
		assertEquals(135135, Stage3.productOdd(7));
	}

	@Test
	public void testCountDigits() {
		assertEquals(0, Stage3.countDigits(0));
		assertEquals(1, Stage3.countDigits(5));
		assertEquals(2, Stage3.countDigits(18));
		assertEquals(7, Stage3.countDigits(2147483));
	}

	@Test
	public void testPower() {
		assertEquals(1, Stage3.power(-5, 0));
		assertEquals(-12, Stage3.power(-12, 1));
		assertEquals(9, Stage3.power(-3, 2));
		assertEquals(1024, Stage3.power(-2, 10));
		assertEquals(-2048, Stage3.power(-2, 11));
	}

	@Test
	public void testSumIntArray() {
		assertEquals(190, Stage3.sum(new int[] {10,70,20,90}));
		assertEquals(0, Stage3.sum(new int[] {})); //empty array
		assertEquals(0, Stage3.sum(new int[] {-50,50})); 
		assertEquals(100, Stage3.sum(new int[] {100})); 
	}

	@Test
	public void testSumEvenIntArray() {
		assertEquals(150, Stage3.sumEven(new int[] {10,70,-20,90}));
		assertEquals(0, Stage3.sumEven(new int[] {11,73,-29,95}));
		assertEquals(0, Stage3.sumEven(new int[] {})); //empty array
		assertEquals(0, Stage3.sumEven(new int[] {-50,50})); 
		assertEquals(30, Stage3.sumEven(new int[] {1,2,3,4,5,6,7,8,9,10})); 
		assertEquals(-30, Stage3.sumEven(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10})); 
	}
}
