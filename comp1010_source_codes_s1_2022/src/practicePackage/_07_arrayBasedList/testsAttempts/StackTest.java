package practicePackage._07_arrayBasedList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._07_arrayBasedList.attempts.Stack;

class StackTest {
	Stack s1, s2, s3;
	@BeforeEach
	public void run() {
		s1 = new Stack();
		s2 = new Stack();
		s3 = new Stack();
		
		for(int i=0; i < 100; i++) {
			s2.push((i+1)+"");
		}
		
		for(int i=0; i < 1000; i++) {
			s3.push((i+1)*2+"");
		}
	}
	
	@Test
	public void testStack() {
		s1 = new Stack();
		assertNotNull(s1.items);
		assertEquals(0, s1.size);
	}

	@Test
	public void testIsEmpty() {
		s1 = new Stack();
		assertTrue(s1.isEmpty());
		s1.items = new String[5];
		s1.items[0] = "hello";
		s1.size = 1;
		assertFalse(s1.isEmpty());
	}

	@Test
	public void testIsFull() {
		s1 = new Stack();
		assertTrue(s1.isFull());
		s1.items = new String[5];
		s1.items[0] = "hello";
		s1.size = 1;
		assertFalse(s1.isFull());
		
		s1.items = new String[2];
		s1.items[0] = "hello";
		s1.items[1] = "world";
		s1.size = 2;
		assertTrue(s1.isFull());
		
		s1.items = new String[1000];
		for(int i=0; i < 999; i++) {
			s1.items[i] = i+"";
		}
		s1.size = 999;
		assertFalse(s1.isFull());
		
		s1.items[999] = "Done";
		s1.size = 1000;
		assertTrue(s1.isFull());
	}

	@Test
	public void testGrow() {
		for(int i=0; i < 100; i++) {
			assertEquals(0, s1.size);
			assertNotNull(s1.items);
			assertEquals(5*i, s1.items.length);
			s1.grow();
		}
	}

	@Test
	public void testPush() {
		for(int i=0; i < 100; i++) {
			s1.push(i+"");
			assertEquals(i+1, s1.size);
		}
		
		for(int i=0; i < 100; i++) {
			s1.push(null);
			assertEquals(100, s1.size);
		}
	}

	@Test
	public void testTop() {
		assertNull(s1.top());
		assertNotNull(s2.top());
		assertEquals("100", s2.top());
		assertEquals("100", s2.top()); //to ensure not popped
		assertNotNull(s3.top());
		assertEquals("2000", s3.top());
		assertEquals("2000", s3.top()); //to ensure not popped
	}
	
	@Test
	public void testGetInt() {
		for(int i=0; i < 100; i++) {
			assertNull(s1.get(i));
			assertNotNull(s2.get(i));
			assertEquals((i+1)+"", s2.get(i));
		}
		
		for(int i=0; i < 1000; i++) {
			if(i >= 100) {
				assertNull(s2.get(i));
			}
			assertNotNull(s3.get(i));
			assertEquals((i+1)*2+"", s3.get(i));
		}
	}

	@Test
	public void testToString() {
		assertNotNull(s1.toString());
		assertEquals("", s1.toString());
		assertNotNull(s2.toString());
		String expected = "";
		for(int i=100; i>0; i--) {
			expected+=i;
		}
		assertEquals(expected, s2.toString().trim().replaceAll("\n",""));
	}

}
