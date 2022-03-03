package practicePackage._07_arrayBasedList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage._07_arrayBasedList.attempts.Queue;

class QueueTest {
	Queue q1, q2, q3;
	@BeforeEach
	public void run() {
		q1 = new Queue();
		q2 = new Queue();
		q3 = new Queue();
		
		for(int i=0; i < 100; i++) {
			q2.insert((i+1)+"");
		}
		
		for(int i=0; i < 1000; i++) {
			q3.insert((i+1)*2+"");
		}
	}
	
	@Test
	public void testQueue() {
		q1 = new Queue();
		assertNotNull(q1.items);
		assertEquals(0, q1.size);
	}

	@Test
	public void testIsEmpty() {
		q1 = new Queue();
		assertTrue(q1.isEmpty());
		q1.items = new String[5];
		q1.items[0] = "hello";
		q1.size = 1;
		assertFalse(q1.isEmpty());
	}

	@Test
	public void testIsFull() {
		q1 = new Queue();
		assertTrue(q1.isFull());
		q1.items = new String[5];
		q1.items[0] = "hello";
		q1.size = 1;
		assertFalse(q1.isFull());
		
		q1.items = new String[2];
		q1.items[0] = "hello";
		q1.items[1] = "world";
		q1.size = 2;
		assertTrue(q1.isFull());
		
		q1.items = new String[1000];
		for(int i=0; i < 999; i++) {
			q1.items[i] = i+"";
		}
		q1.size = 999;
		assertFalse(q1.isFull());
		
		q1.items[999] = "Done";
		q1.size = 1000;
		assertTrue(q1.isFull());
	}

	@Test
	public void testGrow() {
		for(int i=0; i < 100; i++) {
			assertEquals(0, q1.size);
			assertNotNull(q1.items);
			assertEquals(5*i, q1.items.length);
			q1.grow();
		}
	}

	@Test
	public void testInsert() {
		for(int i=0; i < 100; i++) {
			q1.insert(i+"");
			assertEquals(i+1, q1.size);
		}
		
		for(int i=0; i < 100; i++) {
			q1.insert(null);
			assertEquals(100, q1.size);
		}
	}

	@Test
	public void testRemove() {
		assertNull(q1.remove());
		for(int i=0; i < 100; i++) {
			String str = q2.remove();
			assertNotNull(str);
			assertEquals((i+1)+"", str);
		}
		assertNull(q2.remove());
		
		for(int i=0; i < 1000; i++) {
			String str = q3.remove();
			assertNotNull(str);
			assertEquals((i+1)*2+"", str);
		}
		assertNull(q3.remove());
	}
	
	@Test
	public void testFront() {
		assertNull(q1.front());
		assertNotNull(q2.front());
		assertEquals("100", q2.front());
		assertEquals("100", q2.front()); //to ensure not removed
		assertNotNull(q3.front());
		assertEquals("2000", q3.front());
		assertEquals("2000", q3.front()); //to ensure not removed
	}
	
	@Test
	public void testGetInt() {
		for(int i=0; i < 100; i++) {
			assertNull(q1.get(i));
			assertNotNull(q2.get(i));
			assertEquals((i+1)+"", q2.get(i));
		}
		
		for(int i=0; i < 1000; i++) {
			if(i >= 100) {
				assertNull(q2.get(i));
			}
			assertNotNull(q3.get(i));
			assertEquals((i+1)*2+"", q3.get(i));
		}
	}

	@Test
	public void testToString() {
		assertNotNull(q1.toString());
		assertEquals("", q1.toString());
		assertNotNull(q2.toString());
		String expected = "";
		for(int i=100; i>0; i--) {
			expected+=i;
		}
		assertEquals(expected, q2.toString().trim().replaceAll("\n",""));
	}

}
