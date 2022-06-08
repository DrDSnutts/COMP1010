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
public class Question9 { //begin class 
	/**
	* @param list
	* @return a list containing the longest repeating sublist inside the parameter.
	* return first of the sublists if there is a tie.
	*
	*/
	public static ArrayList<Integer> getLongestRepeatingSubList(ArrayList<Integer> list) {
		return null;
	}

	private static ArrayList<Integer> get(ArrayList<Integer> list, int start, int n) {
		if(list == null || list.size() <= start + n)
			return null;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=start; i < start + n; i++) {
			result.add(list.get(i));
		}
		return result;
	}

	private static int lastIndexOf(ArrayList<Integer> list, ArrayList<Integer> sub) {
		if(list == null || sub == null || list.size() < sub.size())
			return -1;
		for(int i=list.size()-sub.size(); i >= 0; i--) {
			if(list.subList(i, i+sub.size()).equals(sub))
				return i;
		}
		return -1;
	}
    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(marks=10, description="getLongestAscendingRun(List)")
	public void testGetLongestRepeatingSubList() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> list = null;
		assertNull(Question9.getLongestRepeatingSubList(list));
		list = new ArrayList<Integer>();
		assertNull(Question9.getLongestRepeatingSubList(list));
		list.add(10);
		assertNull(Question9.getLongestRepeatingSubList(list));
		list.add(10);
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10]", Question9.getLongestRepeatingSubList(list).toString());
		list.add(10);
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 10]", Question9.getLongestRepeatingSubList(list).toString());
		list.add(2, 20);
		list.add(10); //10,10,20,10,10
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 10]", Question9.getLongestRepeatingSubList(list).toString());
		list = new ArrayList<Integer>(Arrays.asList(10,70,20,90,30,80,20,90,30,10,70,20));
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[10, 70, 20]", Question9.getLongestRepeatingSubList(list).toString());
		list = new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,2,2,2,2,2));
		assertNotNull(Question9.getLongestRepeatingSubList(list));
		assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", Question9.getLongestRepeatingSubList(list).toString());		
	
	}
} //end class (do not delete this closing bracket)