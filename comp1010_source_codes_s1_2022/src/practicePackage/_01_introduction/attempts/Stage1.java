package practicePackage._01_introduction.attempts;



public class Stage1 {
	/**
	 * 
	 * @param n
	 * @return square of n
	 */
	public static int square(int n) {
		return n*n; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return the cube of n
	 */
	public static int cube(int n) {
		return n*n*n; //to be completed
	}
	
	public static double average(double a, double b) {
		return (a+b)/2; //to be completed
	}
	
	/**
	 * 
	 * @param n (assume n >= 0)
	 * @return the last digit of the number n
	 */
	public static int lastDigit(int n) {
		return n%10;
	}

	/**
	 * 
	 * @param n
	 * @return true if n is positive (more than 0), false otherwise
	 */
	public static boolean isPositive(int n) {
		if (n>0) {
			return true;
		}
		else {
		return false; //to be completed
		}
	}	

	/**
	 * 
	 * @param n
	 * @return true if n is even (divisible by 2), false otherwise
	 */
	public static boolean isEven(int n) {
		if (n%2 == 0) {
			return true;
		}
		else {
		return false;
		}//to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return higher of the two integers passed
	 */
	public static int higher(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
		return b;
		}//to be completed
	}
	
	/**
	 * assumption: one of the two values passed is even, other is odd
	 * 
	 * @param a
	 * @param b
	 * @return the value that is even
	 */
	public static int evenOne(int a, int b) {
		if (a%2 == 0) {
		return a;
		}
		else{
			return b;//to be completed
		}
	}

	/**
	 * 
	 * @param n
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return true if n is in the range [low...high], false otherwise
	 */
	public static boolean isInRange(int n, int low, int high) {
		if (n>= low && n<= high) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the highest of the three integers passed
	 */
	public static int highest(int a, int b, int c) {
		if (a>=b && a>=c) {
			return a;
		}
		else if (b>=a && b>=c) {
			return b;
		}
		else {
			return c;
		}
	}
}
