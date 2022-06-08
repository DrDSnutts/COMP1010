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
public class Question3 { //begin class 
	/**
	 * @param list
	 * @return the sum of differences between even and odd indices.
	 * return 0 if list is null
	 * for example,
	 * if list = [20, 50, 80, 60, 30], return -30+20+30=20
	 * if list = [20, 30], return -10
	 * if list = [40], return 40
	 */
	public static int differenceEvenOddIndices(ArrayList<Integer> list) {
		return 0;
	}

    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="differenceEvenOddIndices(ArrayList<Integer>)", marks=10)
	public void testDifferenceEvenOddIndicesArrayList() throws NoSuchMethodException, SecurityException {
		assertEquals(0, Question3.differenceEvenOddIndices(null)); //null list check
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Question3.differenceEvenOddIndices(list)); //empty list check

		list.add(20); //list is [20]
		assertEquals(20, Question3.differenceEvenOddIndices(list));
		list.add(30); //list is [20, 30]
		assertEquals(-10, Question3.differenceEvenOddIndices(list));

		list.add(60); //list is [20, 30, 60]
		assertEquals(50, Question3.differenceEvenOddIndices(list));

		list.add(10); //list is [20, 30, 60, 10]
		list.add(50); //list is [20, 30, 60, 10, 50]
		list.add(30); //list is [20, 30, 60, 10, 50, 30]
		assertEquals(60, Question3.differenceEvenOddIndices(list));

		
	}
} //end class (do not delete this closing bracket)