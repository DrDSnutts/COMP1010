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
public class Question6 { //begin class 


	/**
	 * @param list
	 * @return reverse of the list
	 */
	public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
		return null;
	}

	public static String currentMethodName = null;
	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="reverse(ArrayList<Integer>)", marks=5)
	public void testReverse() throws NoSuchMethodException, SecurityException {
		ArrayList<Integer> a = null;
		assertNull(Question6.reverse(a));

		a = new ArrayList<Integer>();
		assertNotNull(Question6.reverse(a));
		assertEquals("[]", Question6.reverse(a).toString());

		a = new ArrayList<Integer>(Arrays.asList(10,70,20,90));
		assertNotNull(Question6.reverse(a));
		assertEquals("[90, 20, 70, 10]", Question6.reverse(a).toString());

	}
} //end TEST class Question6 (do not delete this closing bracket)