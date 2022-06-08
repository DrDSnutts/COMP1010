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
public class Question10 { //begin class 
	/**
	 *
	 * @param start: starting index
	 * @param nums: array
	 * @param target
	 * @return true if it is possible (and false if not)
	 * to choose a group of some of the ints (starting at index start),
	 * such that the groups product is the
	 * given target with these additional constraints:
	 * all multiples of 5 in the array must be included
	 * in the group. If the value immediately following
	 * a multiple of 5 is 1, the 1 must not be chosen.
	 * (Solution must be recursive AND should not contain any loop)
	 */
	public static boolean productRecursive(int start, int[] nums, int target) {
		return false;
	}

	//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="productRecursive(int, int[], int)", marks=10)
	public void testProductRecursive() throws NoSuchMethodException, SecurityException {
		int[] a = {2,5,10,4};
		assertTrue(Question10.productRecursive(0, a, 50));
		assertFalse(Question10.productRecursive(0, a, 60));

		int[] b = {3,5,2};
		assertFalse(Question10.productRecursive(0, b, 6));
		assertTrue(Question10.productRecursive(0, b, 30));
		assertFalse(Question10.productRecursive(0, b, 8));

		int[] c = {1,2,3,4,5,6,7,8,9,10};
		assertTrue(Question10.productRecursive(0, c, 3628800));
		assertFalse(Question10.productRecursive(2, c, 3628800));

	}
} //end class (do not delete this closing bracket)