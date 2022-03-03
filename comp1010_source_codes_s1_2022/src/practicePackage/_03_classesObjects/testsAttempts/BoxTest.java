package practicePackage._03_classesObjects.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._03_classesObjects.attempts.*;

class BoxTest {
	Box a, b, c, d, e;
	
	@BeforeEach
	void run() {
		a = new Box(1,1,1);
		b = new Box(3,2,5);
		c = new Box(2,9,9);
		d = new Box(18,3,3);
		e = new Box(1,18,9);
	}
	
	@Test
	void testBoxIntIntInt() {
		assertEquals(1, a.depth);
		assertEquals(1, a.height);
		assertEquals(1, a.width);
		
		assertEquals(3, b.depth);
		assertEquals(2, b.height);
		assertEquals(5, b.width);

		assertEquals(2, c.depth);
		assertEquals(9, c.height);
		assertEquals(9, c.width);
		
		Box invalid = new Box(-1, 0, 9);
		assertEquals(1, invalid.depth);
		assertEquals(1, invalid.height);
		assertEquals(9, invalid.width);
		
		invalid = new Box(3, -7, 0);
		assertEquals(3, invalid.depth);
		assertEquals(1, invalid.height);
		assertEquals(1, invalid.width);
		
		invalid = new Box(0, 5, -4);
		assertEquals(1, invalid.depth);
		assertEquals(5, invalid.height);
		assertEquals(1, invalid.width);
	}

	@Test
	void testBoxBox() {
		Box copy = new Box(b);
		assertNotEquals(b, copy); //not reference copy
		assertEquals(3, copy.depth);
		assertEquals(2, copy.height);
		assertEquals(5, copy.width);
		
		copy = new Box(e);
		assertEquals(1, copy.depth);
		assertEquals(18, copy.height);
		assertEquals(9, copy.width);
	}

	@Test
	void testToString() {
		assertEquals("1 x 1 x 1", a.toString());
		assertEquals("3 x 2 x 5", b.toString());
		assertEquals("1 x 18 x 9", e.toString());
	}

	@Test
	void testVolume() {
		assertEquals(1, a.volume());
		assertEquals(30, b.volume());
		assertEquals(162, c.volume());
		assertEquals(162, d.volume());
		assertEquals(162, e.volume());
	}

	@Test
	void testLongestSide() {
		assertEquals(1, a.longestSide());
		assertEquals(5, b.longestSide());
		assertEquals(9, c.longestSide());
		assertEquals(18, d.longestSide());
		assertEquals(18, e.longestSide());
	}

	@Test
	void testBaseArea() {		
		assertEquals(1, a.baseArea());
		assertEquals(15, b.baseArea());
		assertEquals(18, c.baseArea());
		assertEquals(54, d.baseArea());
		assertEquals(9, e.baseArea());
	}

	@Test
	void testFrontArea() {
		assertEquals(1, a.frontArea());
		assertEquals(10, b.frontArea());
		assertEquals(81, c.frontArea());
		assertEquals(9, d.frontArea());
		assertEquals(162, e.frontArea());
	}

	@Test
	void testSideArea() {
		assertEquals(1, a.sideArea());
		assertEquals(6, b.sideArea());
		assertEquals(18, c.sideArea());
		assertEquals(54, d.sideArea());
		assertEquals(18, e.sideArea());
	}

	@Test
	void testSurfaceArea() {
		assertEquals(6, a.surfaceArea());
		assertEquals(62, b.surfaceArea());
		assertEquals(234, c.surfaceArea());
		assertEquals(234, d.surfaceArea());
		assertEquals(378, e.surfaceArea());
	}

	@Test
	void testLargestFaceArea() {
		assertEquals(1, a.largestFaceArea());
		assertEquals(15, b.largestFaceArea());
		assertEquals(81, c.largestFaceArea());
		assertEquals(54, d.largestFaceArea());
		assertEquals(162, e.largestFaceArea());
	}

	@Test
	void testCompareTo() {
		assertEquals(-1, a.compareTo(b));
		assertEquals(-1, a.compareTo(c));
		assertEquals(-1, a.compareTo(d));
		assertEquals(-1, a.compareTo(e));
	
		assertEquals(1, b.compareTo(a));
		assertEquals(-1, b.compareTo(c));
		assertEquals(-1, b.compareTo(d));
		assertEquals(-1, b.compareTo(e));

		assertEquals(1, c.compareTo(a));
		assertEquals(1, c.compareTo(b));
		assertEquals(0, c.compareTo(d));
		assertEquals(-1, c.compareTo(e));

		assertEquals(1, d.compareTo(a));
		assertEquals(1, d.compareTo(b));
		assertEquals(0, d.compareTo(c));
		assertEquals(-1, d.compareTo(e));

		assertEquals(1, e.compareTo(a));
		assertEquals(1, e.compareTo(b));
		assertEquals(1, e.compareTo(c));
		assertEquals(1, e.compareTo(d));
	}

	@Test
	void testCanFitInside() {
		assertFalse(a.canFitInside(a));
		assertTrue(a.canFitInside(b));
		assertTrue(a.canFitInside(c));
		assertTrue(a.canFitInside(d));
		assertFalse(a.canFitInside(e));

		assertFalse(b.canFitInside(a));
		assertFalse(b.canFitInside(b));
		assertFalse(b.canFitInside(c));
		assertFalse(b.canFitInside(d));
		assertFalse(b.canFitInside(e));

		assertFalse(c.canFitInside(a));
		assertFalse(c.canFitInside(b));
		assertFalse(c.canFitInside(c));
		assertFalse(c.canFitInside(d));
		assertFalse(c.canFitInside(e));
		
		e = new Box(6,4,3);
		assertTrue(b.canFitInside(e));
		
		e = new Box(3, 18, 9);
		assertTrue(b.canFitInside(e));
	}
	
	@Test
	void testIsIdenticalToBox() {
		assertFalse(a.isIdenticalTo(b));
		assertFalse(b.isIdenticalTo(c));
		assertFalse(c.isIdenticalTo(d));
		assertFalse(d.isIdenticalTo(e));
		assertFalse(b.isIdenticalTo(e));

		e = new Box(5, 2, 3);
		assertTrue(b.isIdenticalTo(e));
		
		e = new Box(3, 18, 3);
		assertTrue(d.isIdenticalTo(e));
	}
		
	@Test
	void testCompareToAdvanced() {
		assertEquals(-1, a.compareToAdvanced(b));
		assertEquals(-1, a.compareToAdvanced(c));
		assertEquals(-1, a.compareToAdvanced(d));
		assertEquals(-1, a.compareToAdvanced(e));
	
		assertEquals(1, b.compareToAdvanced(a));
		assertEquals(-1, b.compareToAdvanced(c));
		assertEquals(-1, b.compareToAdvanced(d));
		assertEquals(-1, b.compareToAdvanced(e));

		assertEquals(1, c.compareToAdvanced(a));
		assertEquals(1, c.compareToAdvanced(b));
		assertEquals(-1, c.compareToAdvanced(d));
		assertEquals(-1, c.compareToAdvanced(e));

		assertEquals(1, d.compareToAdvanced(a));
		assertEquals(1, d.compareToAdvanced(b));
		assertEquals(1, d.compareToAdvanced(c));
		assertEquals(-1, d.compareToAdvanced(e));

		assertEquals(1, e.compareToAdvanced(a));
		assertEquals(1, e.compareToAdvanced(b));
		assertEquals(1, e.compareToAdvanced(c));
		assertEquals(1, e.compareToAdvanced(d));
		
		e = new Box(5, 2, 3);
		assertEquals(0, b.compareToAdvanced(e));
	}
}
