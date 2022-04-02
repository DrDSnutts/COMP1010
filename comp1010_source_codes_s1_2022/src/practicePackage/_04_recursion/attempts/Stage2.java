package practicePackage._04_recursion.attempts;

public class Stage2 {
	/**
	 * 
	 * @param n
	 * @return number of digits in n
	 * For example,
	 * 
	 * countDigits(1729) = 4
	 * countDigits(-1729) = 4
	 * countDigits(0) = 0 (That's the termination case)
	 * countDigits(3) = 1
	 * countDigits(8) = 1
	 * countDigits(-43) = 2
	 */
	public static int countDigits(int n) {
		n = Math.abs(n); //first step is to make it positive
		if(n <= 0) {
			return 0;
		}
		return 1+countDigits(n/10);
	}

	/**
	 * 
	 * @param n
	 * @return the sum of the even digits in n
	 */
	public static int sumEvenDigits(int n) {
		n = Math.abs(n);
		if(n <= 0) {
			return 0;
		}
		if(n%2 == 0) {
			return n%10+sumEvenDigits(n/10);
		}
		return sumEvenDigits(n/10);
	}


	/**
	 * 
	 * @param n
	 * @param d (a single digit number)
	 * @return the sum of the digits in n that are more than d
	 */
	public static int sumDigitsOver(int n, int d) {
		n = Math.abs(n);
		if(n <= 0) {
			return 0;
		}
		if(n%10 > d) {
			return n%10+sumDigitsOver(n/10, d);
		}
		return sumDigitsOver(n/10, d);
	}

	/**
	 * 
	 * @param n
	 * @param d: digit to count, d is between 0 and 9 (inclusive on both sides)
	 * @return the number of times digit d exists in integer n
	 * IMPORTANT countDigit(0, d) for any d should return 0
	 * 
	 * countDigit(10074, 0) = 2
	 * countDigit(38, 8) = 1
	 * countDigit(888, 8) = 3
	 * countDigit(12345, 6) = 0
	 * countDigit(0, 0) = 0 (NOT 1)
	 */
	public static int countDigit(int n, int d) {
		n = Math.abs(n);
		if(n <= 0) {
			return 0;
		}
		if(d <= n%10) {
			return 1+sumDigitsOver(n/10, d);
		}
		return sumDigitsOver(n/10, d);
	}

	/**
	 * 
	 * @param n
	 * @return the first digit of n (0 if n is 0)
	 */
	public static int firstDigit(int n) {
		n = Math.abs(n);
		if(n <= 0) {
			return 0;
		}
		if (n > 10) {
			return firstDigit(n/10);
		}
		return n%10;
	}

	/**
	 * 
	 * @param a
	 * @param b (assume b is more than or equal to 1)
	 * @return the product of a and b using ONLY addition operator (+).
	 * you cannot use the multiplication operator (*) 
	 * or the Math library
	 * HINT: multiplication is repeated addition
	 */
	public static int product(int a, int b) {
		if(a <= 0) {
			return 0;
		}
		return b+product(a-1, b);
	}

	/**
	 * fibonacci sequence is a sequence where the first two terms
	 * are 0 and 1 and every subsequent term is the sum of the two terms
	 * before it
	 * @param n
	 * @return term at index n in fibonacci sequence
	 * 
	 * FOR EXAMPLE,
	 * fibonacci(0) = 0
	 * fibonacci(1) = 1
	 * fibonacci(3) = 2
	 * fibonacci(6) = 8
	 * fibonacci(8) = 21
	 */
	public static int fibonacci(int n) {
		if (n > 1) {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		return n;
	}

	/**
	 * tribonacci sequence is a variation of fibonacci sequence where the first three terms
	 * are 0, 0 and 1 and every subsequent term is the sum of the THREE terms
	 * before it
	 * @param n
	 * @return term at index n in tribonacci sequence
	 * 
	 * FOR EXAMPLE,
	 * tribonacci(0) = 0
	 * tribonacci(1) = 0
	 * tribonacci(2) = 1
	 * tribonacci(3) = 1
	 * tribonacci(4) = 2
	 * tribonacci(5) = 4
	 * tribonacci(6) = 7
	 * tribonacci(7) = 13
	 */
	public static int tribonacci(int n) {
		if(n == 0 || n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		else {
			return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
		}
	}

	/**
	 * 
	 * @param n
	 * @param k
	 * @return n choose k, as explained here: https://en.wikipedia.org/wiki/Combination
	 */
	public static int combinations(int n, int k) {
		return 0;
	}

	//following functions might benefit from tail recursion

	/**
	 * 
	 * @param n
	 * @return the smallest digit in the value passed
	 */
	public static int smallestDigit(int n) {
		n = Math.abs(n);
		if(n == 0) {
			return 0;
		}
		if(n/10 == 0) {
			return n;
		}
		if ((n % 10)<(smallestDigit(n/10))) {
			return n % 10;
		}
		return smallestDigit(n/10);

	}

	/**
	 * 
	 * @param n
	 * @return the highest digit in the value passed
	 */
	public static int highestDigit(int n) {
		n = Math.abs(n);
		if(n == 0) {
			return 0;
		}
		if(n/10 == 0) {
			return n;
		}
		if ((n % 10)>(highestDigit(n/10))) {
			return n % 10;
		}
		return highestDigit(n/10);
	}

	/**
	 * 
	 * @param n
	 * @return the smallest even digit in the value passed
	 * return 0 if the number doesn't have any even digits
	 */
	public static int smallestEvenDigit(int n) {
		n = Math.abs(n);
		if(n == 0) {
			return 0;
		}
		if(n/10 == 0) {
			return n;
		}
		if(n%2 == 0) {
		if ((n % 10)<(smallestEvenDigit(n/10))) {
				return n % 10;
		}
		}
		else if (n%2 != 0) {
			return smallestEvenDigit(n/10);
		}
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return the highest even digit in the value passed
	 * return 0 if the number doesn't have any even digits
	 */
	public static int highestEvenDigit(int n) {
		return 0;	
	}

	/**
	 * 
	 * @param n
	 * @return the location of the highest even digit in the value passed.
	 * 1 if the highest even digit is the least significant digit,
	 * 2 if the highest even digit is the second-least significant digit, and so on, 
	 * return 0 if the number doesn't have any even digits
	 */
	public static int highestEvenDigitLocation(int n) {
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return the location of the highest digit in the value passed.
	 * 1 if the highest digit is the least significant digit,
	 * 2 if the highest digit is the second-least significant digit, and so on, 
	 * return 0 if the number is 0.
	 */
	public static int highestDigitLocation(int n) {
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return the location of the smallest digit in the value passed.
	 * 1 if the smallest digit is the least significant digit,
	 * 2 if the smallest digit is the second-least significant digit, and so on, 
	 * return 0 if the number is 0.
	 */
	public static int smallestDigitLocation(int n) {
		return 0;
	}
}
