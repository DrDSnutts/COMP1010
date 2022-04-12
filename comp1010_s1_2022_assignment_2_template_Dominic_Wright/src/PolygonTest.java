import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PolygonTest {
	public static int score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	ArrayList<String> methodsPassed = new ArrayList<String>();

	Polygon line, triangle, rectangle, square, quadrilateral, pentagon;

	@BeforeEach
	public void run() {
		currentMethodName = null;
		line = new Polygon(new int[] {2,5}, 
				new int[] {4,2});
		triangle = new Polygon(new int[] {2,5,3}, 
				new int[] {1,1,2});
		rectangle = new Polygon(new int[] {1,6,6,1}, 
				new int[] {4,4,6,6});
		square = new Polygon(new int[] {1,5,5,1}, 
				new int[] {5,5,10,10});
		quadrilateral = new Polygon(new int[] {1,8,6,4}, 
				new int[] {0,2,3,0});
		pentagon = new Polygon(new int[] {2,5,6,4,1}, 
				new int[] {0,0,3,5,3}); 
	}


	@Test @Order(1) @Graded(description="Polygon:Polygon(int[], int[])", marks=4)
	public void testPolygonConstructor1() {
		int[] x = null;
		int[] y = new int[10];
		Polygon p = new Polygon(x, y);
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(0, p.points.length);

		x = new int[10];
		y = null;
		p = new Polygon(x, y);
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(0, p.points.length);
		
		x = new int[5];
		y = new int[4];
		
		for(int i=0; i < y.length; i++) {
			x[i] = 2*i;
			y[i] = (i+5)/3;
		}
		
		p = new Polygon(x, y);
		
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(y.length, p.points.length);
		
		for(int i=0; i < y.length; i++) {
			assertEquals(x[i], p.points[i].x);
			assertEquals(y[i], p.points[i].y);
		}
		
		x = new int[7];
		y = new int[12];
		
		for(int i=0; i < x.length; i++) {
			x[i] = 2*i;
			y[i] = (i+5)/3;
		}
		
		p = new Polygon(x, y);
		
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(x.length, p.points.length);
		
		for(int i=0; i < x.length; i++) {
			assertEquals(x[i], p.points[i].x);
			assertEquals(y[i], p.points[i].y);
		}
		
		x = new int[1000];
		y = new int[1000];
		
		for(int i=0; i < x.length; i++) {
			x[i] = 2*i;
			y[i] = (i+5)/3;
		}
		
		p = new Polygon(x, y);
		
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(x.length, p.points.length);
		
		for(int i=0; i < x.length; i++) {
			assertEquals(x[i], p.points[i].x);
			assertEquals(y[i], p.points[i].y);
		}
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(2) @Graded(description="Polygon:Polygon(Point[])", marks=4)
	public void testPolygonConstructor2() {
		Point[] src = null;
		Polygon p = new Polygon(src);
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(0, p.points.length);

		src = new Point[5];
		for(int i=0; i < src.length; i++) {
			src[i] = new Point(2*i, (i+5)/3);
		}
		p = new Polygon(src);
		assertNotNull(p);
		assertNotNull(p.points);
		assertEquals(5, p.points.length);
		assertNotEquals(src, p.points); //no reference copies
		
		for(int i=0; i < src.length; i++) {
			assertNotNull(p.points[i]);
			assertNotEquals(src[i], p.points[i]); //no reference copies
			assertEquals(src[i].toString(), p.points[i].toString());
		}		
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}


	@Test @Order(3) @Graded(description="Polygon:firstPointWithSameXY", marks=1)
	public void testFirstPointWithSameXY() {
		assertEquals(-1, triangle.firstPointWithSameXY());
		assertEquals(2, rectangle.firstPointWithSameXY());
		assertEquals(1, square.firstPointWithSameXY());
		assertEquals(-1, quadrilateral.firstPointWithSameXY());
		assertEquals(-1, pentagon.firstPointWithSameXY());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(4) @Graded(description="Polygon:lastPointAtOrigin", marks=1)
	public void testLastPointAtOrigin() {
		assertEquals(-1, triangle.lastPointAtOrigin());
		assertEquals(-1, line.lastPointAtOrigin());
		assertEquals(-1, triangle.lastPointAtOrigin());
		assertEquals(-1, rectangle.lastPointAtOrigin());
		assertEquals(-1, square.lastPointAtOrigin());
		assertEquals(-1, quadrilateral.lastPointAtOrigin());
		assertEquals(-1, pentagon.lastPointAtOrigin());

		pentagon = new Polygon(new int[] {10,20,30,40,50}, new int[] {50,40,30,20,10});
		assertEquals(-1, pentagon.lastPointAtOrigin());

		pentagon = new Polygon(new int[] {0,20,0,40,0}, new int[] {0,40,0,0,10});
		assertEquals(2, pentagon.lastPointAtOrigin());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(5) @Graded(description="Polygon:goingFurtherFromOrigin", marks=2)
	public void testGoingFurtherFromOrigin() {
		fail("Students need to write their own tests");
		
		//DO NOT REMOVE THE FOLLOWING STATEMENT
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(6) @Graded(description="Polygon:circumference", marks=2)
	public void testCircumference() {
		fail("Students need to write their own tests");
		
		//DO NOT REMOVE THE FOLLOWING STATEMENT
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(7) @Graded(description="Polygon:firstPointOnOrigin", marks=2)
	public void testFirstPointOnOrigin() {
		assertEquals(-1, triangle.firstPointOnOrigin());
		assertEquals(-1, line.firstPointOnOrigin());
		assertEquals(-1, triangle.firstPointOnOrigin());
		assertEquals(-1, rectangle.firstPointOnOrigin());
		assertEquals(-1, square.firstPointOnOrigin());
		assertEquals(-1, quadrilateral.firstPointOnOrigin());
		assertEquals(-1, pentagon.firstPointOnOrigin());	

		square = new Polygon(new int[] {-4,0,0,-4}, new int[] {-6,-6,0,0});
		assertEquals(2, square.firstPointOnOrigin());

		pentagon = new Polygon(new int[] {1,0,3,0,0}, new int[] {1,2,0,0,0});
		assertEquals(3, pentagon.firstPointOnOrigin());

		pentagon = new Polygon(new int[] {1,0,3,0,0}, new int[] {1,2,0,5,0});
		assertEquals(4, pentagon.firstPointOnOrigin());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(10) @Graded(description="Polygon:lastPointWithSameXY", marks=4)
	public void testLastPointWithSameXY() {
		assertEquals(-1, triangle.lastPointWithSameXY());
		assertEquals(-1, line.lastPointWithSameXY());
		assertEquals(-1, triangle.lastPointWithSameXY());
		assertEquals(2, rectangle.lastPointWithSameXY());
		assertEquals(1, square.lastPointWithSameXY());
		assertEquals(-1, quadrilateral.lastPointWithSameXY());
		assertEquals(-1, pentagon.lastPointWithSameXY());

		pentagon = new Polygon(new int[] {10,20,30,40,50}, new int[] {50,40,30,20,10});
		assertEquals(2, pentagon.lastPointWithSameXY());

		pentagon = new Polygon(new int[] {10,20,30,40,10}, new int[] {50,40,30,20,10});
		assertEquals(4, pentagon.lastPointWithSameXY());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(11) @Graded(description="Polygon:longestEdge", marks=4)
	public void testLongestEdge() {
		assertEquals(3.0, triangle.longestEdge(),0.001);
		assertEquals(5.0, rectangle.longestEdge(),0.001);
		assertEquals(5.0, square.longestEdge(),0.001);
		assertEquals(7.2801, quadrilateral.longestEdge(),0.001);
		assertEquals(3.6055, pentagon.longestEdge(),0.001);	

		pentagon = new Polygon(new int[] {10,20,30,40,50}, new int[] {50,40,30,20,10});
		assertEquals(56.5685, pentagon.longestEdge(), 0.001);

		pentagon = new Polygon(new int[] {10,20,30,40,10}, new int[] {50,40,30,20,10});
		assertEquals(40.0, pentagon.longestEdge(), 0.001);

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(12) @Graded(description="Polygon:countEdgesBetween", marks=4)
	public void testCountEdgesBetween() {
		assertEquals(0, triangle.countEdgesBetween(10,20));
		assertEquals(0, line.countEdgesBetween(10,20));
		assertEquals(0, triangle.countEdgesBetween(10,20));
		assertEquals(0, rectangle.countEdgesBetween(10,20));
		assertEquals(0, square.countEdgesBetween(10,20));
		assertEquals(0, quadrilateral.countEdgesBetween(10,20));
		assertEquals(0, pentagon.countEdgesBetween(10,20));

		pentagon = new Polygon(new int[] {10,20,30,40,50}, new int[] {50,40,30,20,10});
		assertEquals(4, pentagon.countEdgesBetween(10,20));

		pentagon = new Polygon(new int[] {10,20,30,40,10}, new int[] {50,40,30,20,10});
		assertEquals(3, pentagon.countEdgesBetween(10,20));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(13) @Graded(description="Polygon:closestToOriginIndex", marks=4)
	public void testClosestToOriginIndex() {
		fail("Students need to write their own tests");
		
		//DO NOT REMOVE THE FOLLOWING STATEMENT
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(14) @Graded(description="Polygon:firstPointInQuadrant", marks=4)
	public void testFirstPointInQuadrant() {
		assertEquals(0, triangle.firstPointInQuadrant(1));
		assertEquals(0, line.firstPointInQuadrant(1));
		assertEquals(0, triangle.firstPointInQuadrant(1));
		assertEquals(0, rectangle.firstPointInQuadrant(1));
		assertEquals(0, square.firstPointInQuadrant(1));
		assertEquals(0, quadrilateral.firstPointInQuadrant(1));
		assertEquals(0, pentagon.firstPointInQuadrant(1));	

		square = new Polygon(new int[] {-4,0,0,-4}, new int[] {-6,-6,0,0});
		assertEquals(2, square.firstPointInQuadrant(1));
		assertEquals(3, square.firstPointInQuadrant(2));
		assertEquals(0, square.firstPointInQuadrant(3));
		assertEquals(1, square.firstPointInQuadrant(4));

		pentagon = new Polygon(new int[] {1,2,0,4,0}, new int[] {1,2,3,4,5});
		assertEquals(0, pentagon.firstPointInQuadrant(1));
		assertEquals(-1, pentagon.firstPointInQuadrant(2));
		assertEquals(-1, pentagon.firstPointInQuadrant(3));
		assertEquals(-1, pentagon.firstPointInQuadrant(4));

		pentagon = new Polygon(new int[] {1,2,3,-4,1}, new int[] {1,-2,-3,4,-5});
		assertEquals(0, pentagon.firstPointInQuadrant(1));
		assertEquals(3, pentagon.firstPointInQuadrant(2));
		assertEquals(-1, pentagon.firstPointInQuadrant(3));
		assertEquals(1, pentagon.firstPointInQuadrant(4));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(15) @Graded(description="Polygon:inSingleQuadrant", marks=4)
	public void testInSingleQuadrant() {
		assertTrue(triangle.inSingleQuadrant());
		assertTrue(line.inSingleQuadrant());
		assertTrue(triangle.inSingleQuadrant());
		assertTrue(rectangle.inSingleQuadrant());
		assertTrue(square.inSingleQuadrant());
		assertTrue(quadrilateral.inSingleQuadrant());
		assertTrue(pentagon.inSingleQuadrant());

		square = new Polygon(new int[] {4,0,0,-4}, new int[] {6,6,0,0});
		assertFalse(square.inSingleQuadrant());

		pentagon = new Polygon(new int[] {1,2, 0,4,0}, new int[] {1,2,-3,4,5});
		assertFalse(pentagon.inSingleQuadrant());
		
		pentagon = new Polygon(new int[] {1,2, 0,4,0}, new int[] {1,2,3,4,5});
		assertTrue(pentagon.inSingleQuadrant());

		pentagon = new Polygon(new int[5], new int[5]); //all zeroes
		assertTrue(pentagon.inSingleQuadrant());

		pentagon = new Polygon(new int[] {1,2,3,-4,1}, new int[] {1,-2,-3,4,-5});
		assertFalse(pentagon.inSingleQuadrant());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(16) @Graded(description="Polygon:countPointsFurtherThan", marks=4)
	public void testCountPointsFurtherThan() {
		assertEquals(2, triangle.countPointsFurtherThan(new Point(2,2)));
		assertEquals(4, rectangle.countPointsFurtherThan(new Point(2,2)));
		assertEquals(4, square.countPointsFurtherThan(new Point(2,2)));
		assertEquals(3, quadrilateral.countPointsFurtherThan(new Point(2,2)));
		assertEquals(4, pentagon.countPointsFurtherThan(new Point(2,2)));
		assertEquals(5, pentagon.countPointsFurtherThan(new Point(0,0)));
		assertEquals(0, pentagon.countPointsFurtherThan(new Point(20,0)));
		assertEquals(0, pentagon.countPointsFurtherThan(new Point(6,3)));
		assertEquals(1, pentagon.countPointsFurtherThan(new Point(4,5)));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(17) @Graded(description="Polygon:get2DArray", marks=4)
	public void testGet2DArray() {
		//Quadrilateral = new Polygon(new int[] {1,8,6,4}, new int[] {0,2,3,0});
		//pentagon = new Polygon(new int[] {2,5,6,4,1}, new int[] {0,0,3,5,3}); 
		int[][] q = quadrilateral.get2DArray();
		assertNotNull(q);
		assertEquals(4, q.length);
		assertEquals("[1, 0], [8, 2], [6, 3], [4, 0]", Arrays.toString(q[0])+", "+Arrays.toString(q[1])+", "+Arrays.toString(q[2])+", "+Arrays.toString(q[3]));
		int[][] p = pentagon.get2DArray();
		assertNotNull(p);
		assertEquals(5, p.length);
		assertEquals("[2, 0], [5, 0], [6, 3], [4, 5], [1, 3]", Arrays.toString(p[0])+", "+Arrays.toString(p[1])+", "+Arrays.toString(p[2])+", "+Arrays.toString(p[3])+", "+Arrays.toString(p[4]));

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(18) @Graded(description="Polygon:countEssentialPoints", marks=6)
	public void testCountEssentialPoints() {
		int[] x = {0,0,0,1,0,0,0,0};
		int[] y = {0,0,0,2,0,0,0,0};
		Polygon p = new Polygon(x, y);
		assertEquals(2, p.countEssentialPoints());

		x = new int[]{0,1,2,1,0,0,0};
		y = new int[]{0,0,0,1,2,1,0};
		p = new Polygon(x, y);
		assertEquals(3, p.countEssentialPoints());

		x = new int[]{1,1,1,1,1,1};
		y = new int[]{2,2,2,2,2,2};
		p = new Polygon(x, y);
		assertEquals(1, p.countEssentialPoints());

		x = new int[]{3,6,8,8,8,6,5,4,3,6,6};
		y = new int[]{4,4,4,4,6,4,3,2,4,6,2};
		p = new Polygon(x, y);
		assertEquals(7, p.countEssentialPoints());

		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(19) @Graded(description="Polygon:getOptimized", marks=6)
	public void testGetOptimized() {
		int[] x = {0,0,0,1,0,0,0,0};
		int[] y = {0,0,0,2,0,0,0,0};
		Polygon p = new Polygon(x, y);
		assertNotNull(p.getOptimized());
		assertEquals("(0, 0) -> (1, 2) -> (0, 0)", p.getOptimized().toString());

		x = new int[]{0,1,2,1,0,0,0};
		y = new int[]{0,0,0,1,2,1,0};
		p = new Polygon(x, y);
		assertNotNull(p.getOptimized());
		assertEquals("(0, 0) -> (2, 0) -> (0, 2) -> (0, 0)", p.getOptimized().toString());

		x = new int[]{1,1,1,1,1,1};
		y = new int[]{2,2,2,2,2,2};
		p = new Polygon(x, y);
		assertNotNull(p.getOptimized());
		assertEquals("(1, 2)", p.getOptimized().toString());

		x = new int[]{3,6,8,8,8,6,5,4,3,6,6};
		y = new int[]{4,4,4,4,6,4,3,2,4,6,2};
		p = new Polygon(x, y);
		assertNotNull(p.getOptimized());
		assertEquals("(3, 4) -> (8, 4) -> (8, 6) -> (4, 2) -> (3, 4) -> (6, 6) -> (6, 2) -> (3, 4)", p.getOptimized().toString());
		
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
