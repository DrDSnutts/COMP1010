/**
 * Do not remove or modify this comment as it will interfere with the auto-marking of your submission.
 * Penalty for removing this comment: 20% \of the total mark for this exam. So if you get 80% \\but remove
 * the comment, your marks will reduce to 60%
 * uuid: 0ac49c4c-6dbe-40e8-a16c-c45a32f868e4
 */
//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;


//10 marks
class Box {
	public int depth, height, width;

	/**
	 * DO NOT MODIFY
	 */
	public Box() {
		depth = 0;
		height = 0;
		width = 0;
	}

	/**
	 * 
	 * @param depth: to be copied into instance variable depth
	 * @param height: to be copied into instance variable height
	 * @param width: to be copied into instance variable width
	 */
	public Box(int depth, int height, int width) {
		//to be completed
	}

	/**
	 * DO NOT MODIFY
	 * 
	 * @return volume of the box as defined by the product of the three sides
	 */
	public int volume() {
		return depth * height * width;
	}

	/**
	 * 
	 * @return true if the box is a Cube (all three sides are equal), false otherwise
	 */
	public boolean isCube() {
		return false;
	}

	/**
	 * 
	 * @param other
	 * @return 1 if calling object has greater volume than parameter object
	 *         -1 if calling object has lesser volume than parameter object
	 *         0 if calling object has the same volume as parameter object
	 */
	public int compareTo(Box other) {
		return 0;
	}
}

//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
public class Question12 { //begin TEST class 

	public static String currentMethodName = null;
	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="Box:Box(int,int,int)", marks=5)
	public void testBoxIntIntInt() throws NoSuchMethodException, SecurityException {
		Box c = new Box(10, 5, 2);
		assertEquals(10, c.depth);
		assertEquals(5, c.height);
		assertEquals(2, c.width);

	}

	@Test @Graded(description="Box:compareTo(Box)", marks=5)
	public void testBoxCompareTo() throws NoSuchMethodException, SecurityException {
		Box c = new Box();
		c.depth = 10;
		c.height = 5;
		c.width = 4;

		Box d = new Box();
		d.depth = 2;
		d.height = 20;
		d.width = 5;

		assertEquals(0, c.compareTo(d));
		assertEquals(0, d.compareTo(c));

		d.depth++;

		assertEquals(-1, c.compareTo(d));
		assertEquals(1, d.compareTo(c));

	}

	@Test @Graded(description="Box:isCube()", marks=5)
	public void testBoxIsCube() throws NoSuchMethodException, SecurityException {
		Box c = new Box();
		c.depth = 10;
		c.height = 5;
		c.width = 10;

		Box d = new Box();
		d.depth = 2;
		d.height = 2;
		d.width = 5;

		assertFalse(c.isCube());
		assertFalse(d.isCube());

		d.depth = 2;
		d.height = 2;
		d.width = 2;

		assertTrue(d.isCube());

	}
} //end TEST class Question12 (do not delete this closing bracket)