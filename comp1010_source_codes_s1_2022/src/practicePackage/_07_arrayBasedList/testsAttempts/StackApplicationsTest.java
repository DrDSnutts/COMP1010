package practicePackage._07_arrayBasedList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._07_arrayBasedList.attempts.StackApplications;

class StackApplicationsTest {
	@Test
	void testEvaluateRPN() {
		assertNull(StackApplications.evaluateRPN("3 5 + 7 2 8 - *"));
		assertNull(StackApplications.evaluateRPN("3 5 + 7 - *"));
		assertNotNull(StackApplications.evaluateRPN("3 5 + 7 2 - *"));
		assertEquals(40, StackApplications.evaluateRPN("3 5 + 7 2 - *"), 0.001);
		assertNotNull(StackApplications.evaluateRPN("3 5 + 7 4 - *"));
		assertEquals(2.667, StackApplications.evaluateRPN("3 5 + 7 4 - /"), 0.001);
	}
}
