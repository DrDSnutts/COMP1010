package practicePackage._04_recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import practicePackage._04_recursion.attempts.*;

public class Stage4Test {
	@Test
	public void testBinarySearch() {
		int[] a = {10,10,10,10,10,10};
		assertTrue(Stage4.binarySearch(a, 10, 0, a.length-1) >= 0);
		assertEquals(-1, Stage4.binarySearch(a, 20, 0, a.length-1));

		a = new int[]{10,20,30,40,50,60,70,80,80,80,80,80,90};

		assertTrue(Stage4.binarySearch(a, 10, 0, a.length-1) >= 0);
		assertTrue(Stage4.binarySearch(a, 10, 0, a.length-1) < a.length);
		assertEquals(10, a[Stage4.binarySearch(a, 10, 0, a.length-1)]);

		assertTrue(Stage4.binarySearch(a, 80, 0, a.length-1) >= 0);
		assertTrue(Stage4.binarySearch(a, 80, 0, a.length-1) < a.length);
		assertEquals(80, a[Stage4.binarySearch(a, 80, 0, a.length-1)]);

		assertEquals(-1, Stage4.binarySearch(a, 100, 0, a.length-1));
	}

	@Test
	public void testFastPower() {
		assertEquals(4, Stage4.fastPower(2, 2));	
		assertEquals(4, Stage4.fastPower(-2, 2));	
		assertEquals(8, Stage4.fastPower(2, 3));	
		assertEquals(-8, Stage4.fastPower(-2, 3));	
		assertEquals(1, Stage4.fastPower(4, 0));	
		assertEquals(6561, Stage4.fastPower(3, 8));	
	}

	@Test
	public void testFastFibonacci() {
		assertEquals(0, Stage4.fastFibonacci(0));
		assertEquals(1, Stage4.fastFibonacci(1));
		assertEquals(5, Stage4.fastFibonacci(5));
		assertEquals(8, Stage4.fastFibonacci(6));
		assertEquals(21, Stage4.fastFibonacci(8));
	}

	@Test
	public void testGetPermutation() {
		assertNull(Stage4.getPermutation(5, -1));
		assertNull(Stage4.getPermutation(5, 120));
		assertNull(Stage4.getPermutation(0, 120));

		assertNotNull(Stage4.getPermutation(5, 0));
		assertEquals("12345", Stage4.getPermutation(5, 0));

		assertNotNull(Stage4.getPermutation(5, 7));
		assertEquals("13254", Stage4.getPermutation(5, 7));

		assertNotNull(Stage4.getPermutation(5, 119));
		assertEquals("54321", Stage4.getPermutation(5, 119));

		assertNotNull(Stage4.getPermutation(9, 0));
		assertEquals("123456789", Stage4.getPermutation(9, 0));
	}
	
	@Test
	public void testVeryFastFibonacci() {
		assertNotNull(Stage4.veryFastFibonacci(0));
		assertEquals(new BigInteger("0"), Stage4.veryFastFibonacci(0));
		assertNotNull(Stage4.veryFastFibonacci(1));
		assertEquals(new BigInteger("1"), Stage4.veryFastFibonacci(1));
		assertNotNull(Stage4.veryFastFibonacci(5));
		assertEquals(new BigInteger("5"), Stage4.veryFastFibonacci(5));
		assertNotNull(Stage4.veryFastFibonacci(6));
		assertEquals(new BigInteger("8"), Stage4.veryFastFibonacci(6));

		//will timeout for O(phi^n) complexity

		assertNotNull(Stage4.veryFastFibonacci(2000));
		BigInteger expected = new BigInteger("4224696333392304878706725602341482782579852840250681098010280137314308584370130707224123599639141511088446087538909603607640194711643596029271983312598737326253555802606991585915229492453904998722256795316982874482472992263901833716778060607011615497886719879858311468870876264597369086722884023654422295243347964480139515349562972087652656069529806499841977448720155612802665404554171717881930324025204312082516817125");
		assertEquals(expected, Stage4.veryFastFibonacci(2000));
	}	
	
	@Test
	public void testAddsUpTo() {
		assertTrue(Stage4.addsUpTo(new int[] {10, 70, 20, 90}, 0, 110));
		assertFalse(Stage4.addsUpTo(new int[] {10, 70, 20, 90}, 0, 50));
		assertTrue(Stage4.addsUpTo(new int[] {10, 70, 20, 90, 30, 80}, 0, 270));
		assertTrue(Stage4.addsUpTo(new int[] {1,2,3,4,5,6,7,8,9,10}, 0, 30));
		assertTrue(Stage4.addsUpTo(new int[] {10, 70, 2000, 90, 300, 80}, 0, 2310));
	}
	
	@Test
	public void testCombinesUpTo() {
		assertTrue(Stage4.combinesUpTo(new int[] {10, 70, 20, 90}, 0, 110));
		assertFalse(Stage4.combinesUpTo(new int[] {80, 90, 10}, 0, 150));
		assertTrue(Stage4.combinesUpTo(new int[] {80, 90, 10}, 0, 160));
		assertTrue(Stage4.combinesUpTo(new int[] {10, 70, 20, 90}, 0, 50));
		assertTrue(Stage4.combinesUpTo(new int[] {10, 70, 20, 90, 30, 80}, 0, 270));
		assertTrue(Stage4.combinesUpTo(new int[] {1,2,3,4,5,6,7,8,9,10}, 0, 30));
		assertTrue(Stage4.combinesUpTo(new int[] {10, 70, 2000, 90, 300, 80}, 0, 1690));
		assertTrue(Stage4.combinesUpTo(new int[] {10, 100, 1000, 10000}, 0, 8890));
		assertFalse(Stage4.combinesUpTo(new int[] {10, 100, 1000, 10000}, 0, 8880));
	}
	
	@Test
	public void testWaysAddsUpTo() {
		assertEquals(2, Stage4.waysAddsUpTo(new int[] {10, 70, 20, 90}, 0, 100));
		/*
		 * 10,70,20
		 * 10,90
		 */
		
		assertEquals(6, Stage4.waysAddsUpTo(new int[] {10, 70, 20, 90, -20, 20}, 0, 100));
		/*
		 * 10,70,20
		 * 10,70,20,-20,20
		 * 10,70,20 (the last 20)
		 * 100,20,90,-20
		 * 10,90
		 * 10,90,-20,20
		 */
		
		assertEquals(5, Stage4.waysAddsUpTo(new int[] {10, 70, 20, 90, -30, 30}, 0, 100));
		/*
		 * 10,70,20
		 * 10,70,20,-30,30
		 * 10,90
		 * 10,90,-30,30
		 * 70,30
		 */
	}

	@Test
	public void testSplit53() {
		assertTrue(Stage4.split53(new int[] {1, 1}));
		assertTrue(Stage4.split53(new int[] {2, 4, 2}));
		assertTrue(Stage4.split53(new int[] {3, 3, 5, 1}));
		assertTrue(Stage4.split53(new int[] {3, 5, 6, 10, 3, 3}));

		assertFalse(Stage4.split53(new int[] {3, 5, 8}));
		assertFalse(Stage4.split53(new int[] {2, 2, 2, 1}));
		assertFalse(Stage4.split53(new int[] {5,5,5, 5, 3,3,3,3,3})); //extra 5
	}
	
	@Test
	public void testFirstPeak() {
		assertEquals(1, Stage4.firstPeak(new int[] {10,70,20,90}));
		assertEquals(0, Stage4.firstPeak(new int[] {40,30,20,10}));
		assertEquals(3, Stage4.firstPeak(new int[] {10,20,30,40}));
		int[] data = new int[1024*1024];
		assertEquals(0, Stage4.firstPeak(data));
		int idx = (int)(Math.random()*data.length);
		for(int i=1; i < data.length; i++) {
			data[i] = data[i-1]+1;
		}
		assertEquals(data.length-1, Stage4.firstPeak(data));
		data[idx]++;
		assertEquals(idx, Stage4.firstPeak(data));		
	}
	
	@Test
	public void testInverseModulo() {
		assertNotNull(Stage4.inverseModule(5, 37));
		assertNotNull(Stage4.inverseModule(9, 20));
		assertNotNull(Stage4.inverseModule(16, 61));
		assertNotNull(Stage4.inverseModule(15, 64));
		assertNotNull(Stage4.inverseModule(20, 9));
		assertEquals(15, Stage4.inverseModule(5, 37));
		assertEquals(9, Stage4.inverseModule(9, 20));
		assertEquals(42, Stage4.inverseModule(16, 61));
		assertEquals(47, Stage4.inverseModule(15, 64));
		assertEquals(5, Stage4.inverseModule(20, 9));
		assertNull(Stage4.inverseModule(20, 180));
	}
}
