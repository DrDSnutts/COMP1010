package debuggingJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceTest {
/*
 * asserEquals(expected value, actual value(function call), tolerance;
 */
	@Test
	void testSquare() {
		assertEquals(25, Service.square(5), 0.001);
		assertEquals(2.25, Service.square(1.5), 0.001);
	}


	@Test
	void testAnySame() {
		int[] a = {10, 70, 20, 90};
		assertFalse(Service.anySame(a));
		int[] b = {10, 70, 20, 10};
		assertTrue(Service.anySame(b));
	}

}
