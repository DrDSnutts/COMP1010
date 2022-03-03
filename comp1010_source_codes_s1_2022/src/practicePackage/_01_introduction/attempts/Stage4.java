// Cannot use Math library functions for any task

package practicePackage._01_introduction.attempts;

public class Stage4 {
	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the first index at which target exists in data, -1 if it doesn't exist
	 */
	public static int indexOf(int[] data, int target) {
		for(int i=0; i<=data.length-1; i++) {
			if(target == data[i])
				return i;
		}
		return -1;
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the LAST index at which target exists in data, -1 if it doesn't exist
	 */
	public static int lastIndexOf(int[] data, int target) {
		for(int i=data.length-1; i>=0; i--) {
			if(target == data[i])
				return i;
		}
		return -1;
	}

	/**
	 * fibonacci sequence begins with a 0 and 1
	 * and each term is the sum of previous two terms.
	 * so 
	 * fibonacci(0) = 0,
	 * fibonacci(1) = 1,
	 * fibonacci(2) = 1,
	 * fibonacci(3) = 2,
	 * fibonacci(4) = 3,
	 * fibonacci(5) = 5,
	 * fibonacci(6) = 8,
	 * fibonacci(7) = 13,
	 * 
	 * @param n (assume n is more than or equal to 0)
	 * @return fibonacci(n)
	 */
	public static int fibonacci(int n) {
		if (n > 1) {
		return fibonacci(n-1) + fibonacci(n-2);
		}
		return n;
	}

	/**
	 * @param a
	 * @param b
	 * @return the highest integer that divides both a and b.
	 * for example, 
	 * gcd(70, 40) = 10
	 * gcd(-70, 40) = 10
	 * gcd(15, 32) = 1
	 * gcd(-51, 153) = 51
	 */
	public static int gcd(int a, int b) {
		if(a > b) {
			for(int i = a; i>0; i--) {
				if(a%i == 0 && b%i == 0)
					return i;
			}
		}
		else {
			for(int y = b; y>0; y--) {
				if(a%y == 0 && b%y == 0)
					return y;
			}
		}
		return 0;
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the highest perfect square (square of an integer) that is less than or equal to n
	 * for example, 
	 * highestPerfectSquare(20) = 16
	 * highestPerfectSquare(1) = 1
	 * highestPerfectSquare(278) = 256
	 * highestPerfectSquare(10000) = 10000
	 */
	public static int highestPerfectSquare(int n) {
		return 0;
	}
	
	/**
	 * 
	 * @param n
	 * @return true if n is a perfect square (square of an integer), false otherwise
	 */
	public static boolean isSquare(int n) {
		return false;
	}

	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the median of the three integers passed 
	 * (the value that is in the middle when the three are arranged in ascending order) 
	 */
	public static int median(int a, int b, int c) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (val could be positive or zero or negative)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOffAdvanced(double val) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (can be positive or zero or negative)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floorAdvanced(4.2) = 4, floorAdvanced(7.0) = 7,
	 * floorAdvanced(5.9999) = 5, floorAdvanced(-3.7) = -4
	 */
	public static int floorAdvanced(double val) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (val can be positive or zero or negative)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceilingAdvanced(double val) {
		return 0; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @param idx: index that must be removed
	 * @return the String with the character at index idx (if any) removed
	 */
	public static String getWithout(String str, int idx) {
		return ""; //to be completed
	}	
	
	/**
	 * 
	 * @param str
	 * @return true if every character in str is a digit ('0' to '9'), false otherwise.
	 * also, return false if str is empty.
	 */
	public static boolean isNumeric(String str) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return the string with all leading zero (0') characters removed.
	 */
	public static String withoutLeadingZeroes(String str) {
		return ""; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @return the reverse of the String passed
	 */
	public static String reverse(String str) {
		return ""; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @return true if String remains unchanged when reversed, false otherwise
	 */
	public static boolean isPalindrome(String str) {
		return false; //to be completed
	}
	
	/**
	 * 
	 * @param n
	 * @return true if the passed integer is a concatenation of two
	 * squares. For example, if n = 164, return true since it's a 
	 * concatenation of 1 and 64, both of which are squares. 
	 * If n = 86, return false.
	 * If n = 25, return false, since although the number itself
	 * is a square, it cannot be split along a line into two integers,
	 * each of which is a square.
	 */
	public static boolean isConcatTwoSquares(int n) {
		return false;
	}
}
