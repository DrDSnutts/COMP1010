import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PointTest {
	public static int score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	ArrayList<String> methodsPassed = new ArrayList<String>();	
	Point a, b, c, d;

	@BeforeEach
	public void run() {
		currentMethodName = null;
		a = new Point(2, 5);
		b = new Point(5, 2);
		c = new Point(-1, 4);
		d = new Point(7, -3);

	}

	@Test @Order(1) @Graded(description="Point:getQuadrant()", marks=3)
	public void testGetQuadrant() {
		assertEquals(1, a.getQuadrant());
		assertEquals(1, b.getQuadrant());
		assertEquals(2, c.getQuadrant());
		assertEquals(4, d.getQuadrant());

		Point temp = new Point(10, 0);
		assertEquals(1, temp.getQuadrant());

		temp = new Point(-10, 0);
		assertEquals(2, temp.getQuadrant());

		temp = new Point(0, 10);
		assertEquals(1, temp.getQuadrant());

		temp = new Point(0, -10);
		assertEquals(4, temp.getQuadrant());

		temp = new Point(0, 0);
		assertEquals(1, temp.getQuadrant());

		temp = new Point(-2, -3);
		assertEquals(3, temp.getQuadrant());

		temp = new Point(2, -3);
		assertEquals(4, temp.getQuadrant());

		temp = new Point(-1, -1);
		assertEquals(3, temp.getQuadrant());
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(2) @Graded(description="Point:compareTo(Point)", marks=3)
	public void testCompareTo() {
		assertEquals(1, a.compareTo(c));
		assertEquals(0, a.compareTo(b));
		assertEquals(-1, a.compareTo(d));
		assertEquals(-1, c.compareTo(a));
		assertEquals(0, b.compareTo(a));
		assertEquals(1, d.compareTo(a));

		assertEquals(1, b.compareTo(c));
		assertEquals(-1, b.compareTo(d));
		assertEquals(-1, c.compareTo(b));
		assertEquals(1, d.compareTo(b));

		assertEquals(-1, c.compareTo(d));
		assertEquals(1, d.compareTo(c));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(3) @Graded(description="Point:shift(Point)", marks=3)
	public void testShift() {
		assertNotNull(a.shift(c));
		assertEquals(1, a.shift(c).x);
		assertEquals(9, a.shift(c).y);
		assertEquals("(2,5)", a.toString()); //to make sure you didn't modify calling / parameter object
		assertEquals("(-1,4)", c.toString()); //to make sure you didn't modify calling / parameter object

		assertNotNull(c.shift(d));
		assertEquals(6, c.shift(d).x);
		assertEquals(1, c.shift(d).y);
		assertEquals("(-1,4)", c.toString()); //to make sure you didn't modify calling / parameter object
		assertEquals("(7,-3)", d.toString()); //to make sure you didn't modify calling / parameter object

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(4) @Graded(description="Point:flipXAxis()", marks=3)
	public void testFlipXAxis() {
		assertNotNull(a.flipXAxis());
		assertEquals("(2,-5)", a.flipXAxis().toString());

		assertNotNull(b.flipXAxis());
		assertEquals("(5,-2)", b.flipXAxis().toString());

		assertNotNull(c.flipXAxis());
		assertEquals("(-1,-4)", c.flipXAxis().toString());

		assertNotNull(d.flipXAxis());
		assertEquals("(7,3)", d.flipXAxis().toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(5) @Graded(description="Point:flipYAxis()", marks=3)
	public void testFlipYAxis() {
		assertNotNull(a.flipYAxis());
		assertEquals("(-2,5)", a.flipYAxis().toString());

		assertNotNull(b.flipYAxis());
		assertEquals("(-5,2)", b.flipYAxis().toString());

		assertNotNull(c.flipYAxis());
		assertEquals("(1,4)", c.flipYAxis().toString());

		assertNotNull(d.flipYAxis());
		assertEquals("(-7,-3)", d.flipYAxis().toString());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test @Order(6) @Graded(description="Point:liesOn()", marks=5)
	public void testLiesOn() {
		assertFalse(a.liesOn(b, c));
		assertFalse(a.liesOn(b, d));
		assertFalse(a.liesOn(c, d));

		assertFalse(b.liesOn(a, c));
		assertFalse(b.liesOn(c, d));
		assertFalse(b.liesOn(d, a));

		assertFalse(c.liesOn(a, b));
		assertFalse(c.liesOn(b, d));
		assertFalse(c.liesOn(d, a));

		assertFalse(d.liesOn(a, b));
		assertFalse(d.liesOn(b, c));
		assertFalse(d.liesOn(c, a));

		assertTrue(a.liesOn(a, b));
		assertTrue(a.liesOn(c, a));
		assertTrue(a.liesOn(a, d));

		assertTrue(b.liesOn(b, c));
		assertTrue(b.liesOn(c, b));
		assertTrue(b.liesOn(b, a));

		assertTrue(c.liesOn(c, a));
		assertTrue(c.liesOn(b, c));
		assertTrue(c.liesOn(c, d));

		assertTrue(d.liesOn(b, d));
		assertTrue(d.liesOn(d, a));
		assertTrue(d.liesOn(c, d));
		
		a = new Point(2, 3);
		b = new Point(1, 3);
		c = new Point(20000, 3);
		
		assertTrue(a.liesOn(b, c));
		assertFalse(b.liesOn(a, c));
		assertFalse(c.liesOn(a, b));
		
		
		a = new Point(10, 2);
		b = new Point(15, 3);
		c = new Point(40, 8);
		
		assertFalse(a.liesOn(b, c));
		assertTrue(b.liesOn(a, c));
		assertFalse(c.liesOn(a, b));
		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@AfterEach
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if (currentMethodName != null && !methodsPassed.contains(currentMethodName)) {
			methodsPassed.add(currentMethodName);
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score += graded.marks();
			result += graded.description() + " passed. Marks awarded: " + graded.marks() + "\n";
		}
	}

	@AfterAll
	public static void wrapUp() throws IOException {
		if (result.length() != 0) {
			result = result.substring(0, result.length() - 1); // remove the last "\n"
		}
		System.out.println(result);
		System.out.println("Indicative mark: " + score);
	}

}
