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
public class Question8 { //begin class 
	//add an item to the end of the list
	public Node add(int item, Node head) {
		Node temp = new Node(item, null);
		if (head == null) {
			return temp;
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = temp;
			return head;
		}
	}

	public int size(Node cur) {
		int count = 0;
		while (cur != null) {
			count++;
			cur = cur.next;
		}
		return count;
	}

	private Integer get(int idx, Node cur) {
		for (int i = 0; i < idx && cur != null; i++) {
			cur = cur.next;
		}
		if (cur == null) {
			return null;
		}
		return cur.data;
	}

	/**
	 * 10 marks
	 * @param start
	 * @return first node, starting at start, that occurs more than once
	 */
	public Node firstDuplicate(Node start) {
		return null;
	}

	//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="MyLinkedList:firstDuplicate()", marks=5)
	public void testMyLinkedListFirstDuplicate() throws NoSuchMethodException, SecurityException {
		Question8 obj = new Question8();
		Node head = new Node(5, null);
		obj.add(6, head);
		obj.add(3, head);
		obj.add(7, head); //[5, 6, 3, 7]

		Node result = obj.firstDuplicate(head); //should become [7, 3, 6, 5]
		assertNull(result);

		obj.add(3, head); //[5, 6, 3, 7, 3]
		result = obj.firstDuplicate(head);
		assertNotNull(result);
		assertEquals(3, result.data);
	}
} //end class (do not delete this closing bracket)