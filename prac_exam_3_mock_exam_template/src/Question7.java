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
public class Question7 { //begin class 
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
	 * @param low
	 * @param high
	 * @param cur
	 * @return number of nodes, starting at cur, that hold a value in the range
	 * [low, high] (inclusive)
	 */
	public int sumInRange(int low, int high, Node cur) {
		return 0;
	}

	//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));
	@Test @Graded(description="MyLinkedList:sumInRange(int)", marks=5)
	public void testMyLinkedListSumInRange() throws NoSuchMethodException, SecurityException {
		Question7 obj = new Question7();
		assertEquals(0, obj.sumInRange(10, 50, null));

		Node head = new Node(50, null);
		head = obj.add(60, head);
		head = obj.add(-30, head);
		head = obj.add(70, head);
		head = obj.add(40, head); //[50, 60, -30, 70, 40]
		assertEquals(0, obj.sumInRange(10, 20, head));
		assertEquals(90, obj.sumInRange(10, 50, head));
		assertEquals(40, obj.sumInRange(10, 50, head.next.next));
		assertEquals(0, obj.sumInRange(10, 50, head.next.next.next.next.next));
	}
} //end class (do not delete this closing bracket)