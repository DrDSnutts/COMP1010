package practicePackage._04_recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicePackage._04_recursion.attempts.*;

public class Stage3Test {
	@Test
	public void testReverse() {
		assertNull(Stage3.reverse(null));

		assertNotNull(Stage3.reverse(""));
		assertEquals("", Stage3.reverse(""));

		assertNotNull(Stage3.reverse("super"));
		assertEquals("repus", Stage3.reverse("super"));
	}
	
	@Test
	public void testRemoveDigit() {
		assertEquals(1729, Stage3.removeDigit(1729, -1));
		assertEquals(1729, Stage3.removeDigit(1729, 0));
		assertEquals(1729, Stage3.removeDigit(1729, 5));
		assertEquals(172, Stage3.removeDigit(1729, 1));
		assertEquals(729, Stage3.removeDigit(1729, 4));
		assertEquals(179, Stage3.removeDigit(1729, 2));
		assertEquals(129, Stage3.removeDigit(1729, 3));
		assertEquals(2, Stage3.removeDigit(1002, 4));
		assertEquals(-94825, Stage3.removeDigit(-94825,-1));
		assertEquals(-94825, Stage3.removeDigit(-94825,0));
		assertEquals(-94825, Stage3.removeDigit(-94825,6));
		assertEquals(-4825, Stage3.removeDigit(-94825,5));
	}
	
	@Test
	public void testIsPalindrome() {
		assertFalse(Stage3.isPalindrome(null));
		assertTrue(Stage3.isPalindrome(""));
		assertTrue(Stage3.isPalindrome("a"));
		assertTrue(Stage3.isPalindrome("aa"));
		assertTrue(Stage3.isPalindrome("!madam!"));

		assertFalse(Stage3.isPalindrome("ab"));
		assertFalse(Stage3.isPalindrome("!madam! !!madam!"));
	}

	@Test
	public void testPowerV2() {
		assertEquals(4, Stage3.powerV2(2, 2));	
		assertEquals(4, Stage3.powerV2(-2, 2));	
		assertEquals(8, Stage3.powerV2(2, 3));	
		assertEquals(-8, Stage3.powerV2(-2, 3));	
		assertEquals(1, Stage3.powerV2(4, 0));	
		assertEquals(6561, Stage3.powerV2(3, 8));	
		assertEquals(0.125, Stage3.powerV2(2, -3));
		assertEquals(-0.125, Stage3.powerV2(-2, -3));	
	}	

	@Test
	public void testSameFirstDigit() {
		assertTrue(Stage3.sameFirstDigit(5, 5));
		assertTrue(Stage3.sameFirstDigit(5, -5));
		assertTrue(Stage3.sameFirstDigit(-5, 5));
		assertTrue(Stage3.sameFirstDigit(-5, -5));
		assertTrue(Stage3.sameFirstDigit(0, 0));
		assertTrue(Stage3.sameFirstDigit(25, 28));
		assertTrue(Stage3.sameFirstDigit(-235, 28));
		assertTrue(Stage3.sameFirstDigit(25, -2813));
		assertTrue(Stage3.sameFirstDigit(-6325, 625458));
		assertFalse(Stage3.sameFirstDigit(5, 6));
		assertFalse(Stage3.sameFirstDigit(-5, 6));
		assertFalse(Stage3.sameFirstDigit(5, -6));
		assertFalse(Stage3.sameFirstDigit(-5, -6));
		assertFalse(Stage3.sameFirstDigit(25, 35));
		assertFalse(Stage3.sameFirstDigit(21325, 35122));
		assertFalse(Stage3.sameFirstDigit(91322335, 45535122));
	}
	
	@Test
	public void testConvertIntInt() {
		assertEquals("0", Stage3.convert(0, 2));
		assertEquals("4", Stage3.convert(4, 9));
		assertEquals("1101", Stage3.convert(13, 2));
		assertEquals("201", Stage3.convert(19, 3));
		assertEquals("3561", Stage3.convert(1905, 8));
	}

	@Test
	public void testReplaceAll() {
		assertNull(Stage3.replaceAll(null, "hi", "bye"));
		assertNotNull(Stage3.replaceAll("", "hi", "bye"));
		assertEquals("", Stage3.replaceAll("", "hi", "bye"));
		assertNotNull(Stage3.replaceAll("", "hi", "bye"));
		assertEquals("bye there, tbyes is byes bike", Stage3.replaceAll("hi there, this is his bike", "hi", "bye"));
		
		assertNotNull(Stage3.replaceAll("abchi", "hi",""));
		assertEquals("abc",Stage3.replaceAll("abchi", "hi",""));
	}

	@Test
	public void testCountWeighted() {
		assertEquals(5, Stage3.countWeighted(888, 8));
		assertEquals(3, Stage3.countWeighted(88, 8));
		assertEquals(2, Stage3.countWeighted(808, 8));
		assertEquals(1, Stage3.countWeighted(8, 8));

		assertEquals(5, Stage3.countWeighted(707070707, 7));
		assertEquals(4, Stage3.countWeighted(707070707, 0));
		assertEquals(17, Stage3.countWeighted(777777777, 7));
	}

	@Test
	public void testContainsStringString() {
		assertTrue(Stage3.contains("man", "nma"));
		assertTrue(Stage3.contains("superman", "amen"));
		assertTrue(Stage3.contains("superman", ""));
		assertTrue(Stage3.contains("", ""));
		assertFalse(Stage3.contains("environmentally prudent scheme", "pool"));
		assertTrue(Stage3.contains("environmentally prudent scheme", "pedestrian"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "xoxo"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "scheme!"));
		assertFalse(Stage3.contains("environmentally prudent scheme", "Scheme")); //uppercase 'S'
	}
	
	@Test
	public void testWithoutFirstDigit() {
		assertEquals(234567, Stage3.withoutFirstDigit(1234567));
		assertEquals(34567, Stage3.withoutFirstDigit(234567));
		assertEquals(4567, Stage3.withoutFirstDigit(34567));
		assertEquals(567, Stage3.withoutFirstDigit(4567));
		assertEquals(67, Stage3.withoutFirstDigit(567));
		assertEquals(7, Stage3.withoutFirstDigit(67));
		assertEquals(0, Stage3.withoutFirstDigit(7));
		assertEquals(-234567, Stage3.withoutFirstDigit(-1234567));
		assertEquals(-34567, Stage3.withoutFirstDigit(-234567));
		assertEquals(-4567, Stage3.withoutFirstDigit(-34567));
		assertEquals(-567, Stage3.withoutFirstDigit(-4567));
		assertEquals(-67, Stage3.withoutFirstDigit(-567));
		assertEquals(-7, Stage3.withoutFirstDigit(-67));
		assertEquals(0, Stage3.withoutFirstDigit(-7));
	}
	
	@Test
	public void testHighestNumber() {
		assertEquals(2100, Stage3.highestNumber(1002));
		assertEquals(9721, Stage3.highestNumber(1729));
		assertEquals(876543210, Stage3.highestNumber(102764583));
		assertEquals(0, Stage3.highestNumber(0));
		assertEquals(10000, Stage3.highestNumber(10000));
	}
	
	@Test
	public void testSmallestNumber() {
		assertEquals(12, Stage3.smallestNumber(1002));
		assertEquals(1279, Stage3.smallestNumber(1729));
		assertEquals(12345678, Stage3.smallestNumber(102764583));
		assertEquals(0, Stage3.smallestNumber(0));
		assertEquals(1, Stage3.smallestNumber(10000));
	}
	
	@Test
	public void testSmallestEvenNumber() {
		assertEquals(12, Stage3.smallestEvenNumber(1002));
		assertEquals(1792, Stage3.smallestEvenNumber(1729));
		assertEquals(12345678, Stage3.smallestEvenNumber(102764583));
		assertEquals(124796, Stage3.smallestEvenNumber(147692));
		assertEquals(0, Stage3.smallestEvenNumber(0));
		assertEquals(10, Stage3.smallestEvenNumber(10000));
	}
	
	@Test
	public void testAreAnagrams() {
		assertTrue(Stage3.areAnagrams("man", "nam"));
		assertTrue(Stage3.areAnagrams("superman", "erspunma"));
		assertTrue(Stage3.areAnagrams("splendid", "didlepsn"));
		assertFalse(Stage3.areAnagrams("splendid", "indeed!!")); 
		assertFalse(Stage3.areAnagrams("splendid", "")); 
		assertFalse(Stage3.areAnagrams("", "splendid")); 
		assertFalse(Stage3.areAnagrams("splendid", "didlepdsn")); //extra character in s2
		assertFalse(Stage3.areAnagrams("spldendid", "didlepsn")); //extra character in s1
		assertFalse(Stage3.areAnagrams("splendid", "diplepsn")); //one set of different characters between s1 and s2
	}

	@Test
	public void testGetMorse() {
		assertNull(Stage3.getMorse(null));

		assertNotNull(Stage3.getMorse(""));
		assertEquals("", Stage3.getMorse(""));

		assertNotNull(Stage3.getMorse("nice one"));
		assertEquals("-. .. -.-. . / --- -. . ", Stage3.getMorse("nice one"));

		assertNotNull(Stage3.getMorse("NICE ONE"));
		assertEquals("-. .. -.-. . / --- -. . ", Stage3.getMorse("NICE ONE"));
		
		assertNotNull(Stage3.getMorse("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"));
		assertEquals(".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. ", Stage3.getMorse("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"));
		
		assertNotNull(Stage3.getMorse(" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "));
		assertEquals("/ .- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. / ", Stage3.getMorse(" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "));
	}

	@Test
	public void testEvaluatePolynomial() {
		assertEquals(273, Stage3.evaluatePolynomial(new int[]{3, 5, -7, 0, 0, 9}, 5, 2));
		assertEquals(12, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 1));
		assertEquals(4095, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11, 2));
		assertEquals(13, Stage3.evaluatePolynomial(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 3, 2));
		assertEquals(1093, Stage3.evaluatePolynomial(new int[]{1, 1, 1, 1, 1, 1, 1}, 6, 3));
	}
}
