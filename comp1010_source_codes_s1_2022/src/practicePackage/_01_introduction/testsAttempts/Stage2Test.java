package practicePackage._01_introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._01_introduction.attempts.Stage2;

@SuppressWarnings("unused")
public class Stage2Test {
	@Test
	public void testTwoOutOfThree() {
		assertTrue(Stage2.twoOutOfThree(1,1,10));
		assertTrue(Stage2.twoOutOfThree(1,10,10));
		assertTrue(Stage2.twoOutOfThree(10,25,10));
		assertTrue(Stage2.twoOutOfThree(0,0,-1));
		assertTrue(Stage2.twoOutOfThree(-5,-5,5));
		assertTrue(Stage2.twoOutOfThree(100,100,-100));
		assertFalse(Stage2.twoOutOfThree(1,2,3));
		assertFalse(Stage2.twoOutOfThree(0,0,0));
		assertFalse(Stage2.twoOutOfThree(10000,-20,0));
		assertFalse(Stage2.twoOutOfThree(-300,-300,-300));
		assertFalse(Stage2.twoOutOfThree(-101,-20,-300));
		assertFalse(Stage2.twoOutOfThree(-100,-100,-100));
		assertFalse(Stage2.twoOutOfThree(250,250,250));
	}
	
	@Test
	public void testLastDigit() {
		assertEquals(0,Stage2.lastDigit(0));
		assertEquals(8,Stage2.lastDigit(8));
		assertEquals(5,Stage2.lastDigit(15));
		assertEquals(5,Stage2.lastDigit(-15));
		assertEquals(7,Stage2.lastDigit(-1000007));
		assertEquals(4,Stage2.lastDigit(1000004));
		assertEquals(5,Stage2.lastDigit(5555));
	}
	
	@Test
	public void testAverage() {
		assertEquals(5,Stage2.average(0,10));
		assertEquals(-20,Stage2.average(-10,-30));
		assertEquals(0,Stage2.average(0,0));
		assertEquals(12.5,Stage2.average(10,15));
		assertEquals(0,Stage2.average(-20,20));
		assertEquals(7.5,Stage2.average(-5,20));
		assertEquals(-7.5,Stage2.average(-20,5));
		assertEquals(4999.5,Stage2.average(-1,10000));
		assertNotEquals(4,Stage2.average(0,9));
		assertNotEquals(0,Stage2.average(0,1));
	}
	
	@Test
	public void testAbsolute() {
		assertEquals(10, Stage2.absolute(10));
		assertEquals(10, Stage2.absolute(-10));
		assertEquals(0, Stage2.absolute(0));
		assertEquals(1237, Stage2.absolute(-1237));
	}
	
	@Test
	public void testConstrain() {
		assertEquals(10, Stage2.constrain(0,10,20));
		assertEquals(20, Stage2.constrain(30,10,20));
		assertEquals(15, Stage2.constrain(15,10,20));
		assertEquals(-10, Stage2.constrain(0,-20,-10));
		assertEquals(0, Stage2.constrain(0,0,0));
		assertEquals(40, Stage2.constrain(10,40,50));
		assertEquals(0, Stage2.constrain(0,-10,10));
		assertEquals(-10, Stage2.constrain(-10,-15,-5));
	}
	
	@Test
	public void testGetQuadrant() {
		assertEquals(1, Stage2.getQuadrant(0, 0));
		assertEquals(1, Stage2.getQuadrant(2,2));
		assertEquals(2, Stage2.getQuadrant(-2,3));
		assertEquals(3, Stage2.getQuadrant(-3,-4));
		assertEquals(4, Stage2.getQuadrant(3,-3));
	}
	
	@Test
	public void testRoundOff() {
		assertEquals(2, Stage2.roundOff(1.99));
		assertEquals(1, Stage2.roundOff(1.49));
		assertEquals(1, Stage2.roundOff(0.75));
		assertEquals(7, Stage2.roundOff(7.0));
		assertEquals(6, Stage2.roundOff(5.9999));
		assertEquals(401, Stage2.roundOff(400.5));
		assertEquals(0, Stage2.roundOff(0.001));
	}
	
	@Test
	public void testFloor() {
		assertEquals(1, Stage2.floor(1.99));
		assertEquals(0, Stage2.floor(0.75));
		assertEquals(7, Stage2.floor(7.00));
		assertEquals(5, Stage2.floor(5.9999));
		assertEquals(400, Stage2.floor(400.001));
	}
	
	@Test
	public void testCeiling() {
		assertEquals(2, Stage2.ceiling(1.99));
		assertEquals(1, Stage2.ceiling(0.75));
		assertEquals(7, Stage2.ceiling(7.00));
		assertEquals(6, Stage2.ceiling(5.9999));
		assertEquals(401, Stage2.ceiling(400.001));
	}
	
	@Test
	public void testGetLastChar() {
		assertEquals('r', Stage2.getLastChar("Super"));
		assertEquals('!', Stage2.getLastChar("This is fun!"));
		assertEquals('x', Stage2.getLastChar("x"));
	}
	
	@Test
	public void testGetWithoutFirstChar() {
		assertEquals("uper", Stage2.getWithoutFirstChar("Super"));
		assertEquals("his is fun!", Stage2.getWithoutFirstChar("This is fun!"));
		assertEquals("", Stage2.getWithoutFirstChar("x"));
	}

	@Test
	public void testGetWithoutLastChar() {
		assertEquals("Supe", Stage2.getWithoutLastChar("Super"));
		assertEquals("This is fun", Stage2.getWithoutLastChar("This is fun!"));
		assertEquals("", Stage2.getWithoutLastChar("x"));
	}
}
