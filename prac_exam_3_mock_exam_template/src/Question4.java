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
public class Question4 { //begin class 
	/**
	 * @param str: assume it's not null
	 * @return the string with all spaces removed
	 * for example,
	 * if str = "voila", return voila"
	 * if str = "abcd.", return " a      b c      d  .     "
	 * if str = "", return ""
 	 */
	public static String withoutSpacesRecursive(String str) {
		return "";
	}

    //IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="withoutSpacesRecursive(String)", marks=10)
	public void testWithoutSpacesRecursiveString() throws NoSuchMethodException, SecurityException {
		assertEquals("voila", Question4.withoutSpacesRecursive("voila"));
		assertEquals("abcd.", Question4.withoutSpacesRecursive(" a      b c      d  .     "));
		assertEquals("", Question4.withoutSpacesRecursive(""));
		assertEquals("", Question4.withoutSpacesRecursive("                 "));

		
	}
} //end class (do not delete this closing bracket)