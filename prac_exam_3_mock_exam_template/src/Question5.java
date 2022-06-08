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
public class Question5 { //begin class 
	/**
	 * @param list1
	 * @param list2
	 * @return true if the two lists are mutually reverse of each other, false otherwise
	*/
	public static boolean areMutuallyReverse(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		return false;
	}

    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="areMutuallyReverse(ArrayList<Integer>)", marks=5)
	public void testAreMutuallyReverse() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(90,20,70,10));
		assertTrue(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(70,20,90));
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,10));
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = null;
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90,10));
		b = null;
		assertFalse(Question5.areMutuallyReverse(a,b));
		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();
		for(int i=0; i < 20; i++) {
			a.add(i);
			b.add(0,i);
		}
		assertTrue(Question5.areMutuallyReverse(a,b));	
	
	}
} //end class (do not delete this closing bracket)