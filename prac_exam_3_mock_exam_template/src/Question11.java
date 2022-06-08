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
public class Question11 { //begin class 
	/**
	 *
	 * @param list: list of items
	 * @param start: starting index
	 * @param target: value to construct
	 * @return list containing **indices** (from lower to higher) of items that add up to the given target.
	 * all combinations with a given item must be considered before rejecting it.
	 * return false if there is no combination of items adding up to target
	 * if list = [30,80,-20,200,10], start = 0, target = 10, return list [0, 2] as list.get(0) + list.get(2) = 10
	 * if list = [30,80,-20,200,10], start = 0, target = 50, return null
	 */
	public static ArrayList<Integer> indicesAddingUpto(ArrayList<Integer> list, int start, int target) {
		return null;
	}

	//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="indicesAddingUpto(ArrayList<Integer>, int, int)", marks=5)
	public void testIndicesAddingUpto() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2,5,10,4));
		assertNotNull(Question11.indicesAddingUpto(a, 0, 11));
		assertEquals("[0, 1, 3]", Question11.indicesAddingUpto(a, 0, 11).toString());
		assertNull(Question11.indicesAddingUpto(a, 0, 8));

		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		assertNotNull(Question11.indicesAddingUpto(b, 0, 50));
		assertEquals("[0, 1, 2, 3, 5, 6, 7, 8, 9]", Question11.indicesAddingUpto(b, 0, 50).toString());
		assertNull(Question11.indicesAddingUpto(b, 0, 56));

		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 10, 2, 30, 3, 50, 4, 70, 5, 90, 6, 100));
		assertNotNull(Question11.indicesAddingUpto(c, 0, 21));
		assertEquals("[0, 1, 2, 4, 8]", Question11.indicesAddingUpto(c, 0, 21).toString());

		ArrayList<Integer> empty = new ArrayList<Integer>();
		assertNotNull(Question11.indicesAddingUpto(empty, 0, 0));
		assertEquals("[]", Question11.indicesAddingUpto(empty, 0, 0).toString());
		assertNull(Question11.indicesAddingUpto(empty, 0, 1));


	}
} //end class (do not delete this closing bracket)