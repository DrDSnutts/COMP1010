package practicePackage._01_introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._01_introduction.attempts.Stage1;

@SuppressWarnings("unused")
public class Stage1Test {	
	@Test
	public void testSquare() {
		assertEquals(0, Stage1.square(0));
		assertEquals(10000, Stage1.square(100));
		assertEquals(121, Stage1.square(-11));
		assertEquals(262144, Stage1.square(512));
		int n = (int)(Math.random()*1000)-500;
		assertEquals(n*n, Stage1.square(n), "Square of "+n+" expected to be "+(n*n)+" but was "+Stage1.square(n));
	}
	
	@Test
	public void testCube() {
		assertEquals(125, Stage1.cube(5));
		assertEquals(-125, Stage1.cube(-5));
		assertEquals(1000000, Stage1.cube(100));
		assertEquals(0, Stage1.cube(0));
	}
	
	@Test
	public void testAverage() {
		assertEquals(1.4, Stage1.average(1.2, 1.6), 0.001);
		assertEquals(-8.5, Stage1.average(-9, -8), 0.001);
		assertEquals(0, Stage1.average(-1.417, 1.417), 0.001);
	}
	
	@Test
	public void testLastDigit() {
		assertEquals(0, Stage1.lastDigit(0));
		assertEquals(9, Stage1.lastDigit(1729));
		assertEquals(7, Stage1.lastDigit(2147483647));
	}	
	
	@Test
	public void testIsPositive() {
		assertTrue(Stage1.isPositive(6));
		assertTrue(Stage1.isPositive(12));
		assertFalse(Stage1.isPositive(0));
		assertTrue(Stage1.isPositive(10000000));
		assertFalse(Stage1.isPositive(-7));
		assertFalse(Stage1.isPositive(-1));
		assertFalse(Stage1.isPositive(-10));
	}
	
	@Test
	public void testIsEven() {
		assertTrue(Stage1.isEven(6));
		assertTrue(Stage1.isEven(-12));
		assertTrue(Stage1.isEven(0));
		assertTrue(Stage1.isEven(10000000));
		assertFalse(Stage1.isEven(7));
		assertFalse(Stage1.isEven(-911));
		assertFalse(Stage1.isEven(1010101));
	}
	
	@Test
	public void testHigher() {
		assertEquals(5, Stage1.higher(2, 5));
		assertEquals(6, Stage1.higher(6, 4));
		assertEquals(123014203, Stage1.higher(123014203, 534535));
		assertEquals(56464234, Stage1.higher(32342, 56464234));
		assertEquals(443554535, Stage1.higher(443554535, 443554535));
	}
	
	@Test
	public void testEvenOne() {
		assertEquals(6, Stage1.evenOne(6, 11));
		assertEquals(-12, Stage1.evenOne(15, -12));
		assertEquals(-6, Stage1.evenOne(-6, 11));
		assertEquals(-1234, Stage1.evenOne(-1234, 1235));
		assertEquals(0, Stage1.evenOne(-15, 0));
	}
	
	@Test
	public void testIsInRange() {
		assertTrue(Stage1.isInRange(4, 1, 6));
		assertTrue(Stage1.isInRange(-4, -10, -4));
		assertTrue(Stage1.isInRange(-10, -10, -4));
		assertTrue(Stage1.isInRange(-100, -100, -100));
		
		assertFalse(Stage1.isInRange(7, 1, 6));
		assertFalse(Stage1.isInRange(0, 1, 6));
		assertFalse(Stage1.isInRange(-11, -10, -4));
		assertFalse(Stage1.isInRange(-3, -10, -4));
		assertFalse(Stage1.isInRange(100, -100, -100));	
	}
	
	@Test
	public void testHighest() {
		for(int i=1; i < 4; i++) {
			for(int k=1; k < 4; k++) {
				for(int p=1; p < 4; p++) {
					int expected = Math.max(Math.max(i, k), p);
					int actual = Stage1.highest(i, k, p);
					assertEquals(expected, actual, "highest of "+i+", "+k+", "+p+" should be "+expected);
				}
			}
		}
	}
}
