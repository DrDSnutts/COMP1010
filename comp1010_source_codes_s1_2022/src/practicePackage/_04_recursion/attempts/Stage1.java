package practicePackage._04_recursion.attempts;

public class Stage1 {
	/**
	 * 
	 * @param n 
	 * @return sum of the first n positive integers (1+2+...+n)
	 * return 0 if n is less than or equal to 0
	 */
	public static int sum(int n) {
		if(n<=0) {
			return 0;
		}
		return sum(n-1) + n;
	}

	/**
	 * 
	 * @param start
	 * @param stop
	 * @return sum of all integers from start to stop (inclusive)
	 * return 0 if start is more than stop
	 */
	public static int sumRange(int start, int stop) {
		if(start > stop) {
			return 0;
		}
		return sumRange(start+1,stop) + start;
	}

	/**
	 * 
	 * @param n 
	 * @return product of the first n positive integers (1*2*...*n)
	 * return 1 if n is less than or equal to 0
	 */
	public static int product(int n) {
		if(n <= 0) {
			return 1;
		}

		return product(n-1)*n;
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of the first n positive integers 
	 * (1*1 + 2*2 + ... + n*n)
	 * return 0 if n is less than or equal to 0
	 */
	public static int sumSquares(int n) {
		if(n <= 0) {
			return 0;
		}
		return sumSquares(n-1)+n*n;
	}

	/**
	 * 
	 * @param n 
	 * @return sum of all positive even numbers till n (including n)
	 * (2 + 4 + 6 + ... (n or n-1))
	 * For example,
	 * if n = 8, return 2+4+6+8=20
	 * if n = 5, return 2+4=6
	 * return 0 if n is less than or equal to 1
	 * 
	 * HINT: if the number is odd, ignore it and return sumEven(n-1)
	 */
	public static int sumEven(int n) {
		if(n <= 1) {
			return 0;
		}
		if(n%2 != 0) {
			return sumEven(n-1);
		}
		return sumEven(n-1)+n;

	}

	/**
	 * 
	 * @param n 
	 * @return sum of all positive odd numbers till n (including n)
	 * (1 + 3 + 5+ ... (n or n-1))
	 * For example,
	 * if n = 8, return 1+3+5+7=16 
	 * if n = 5, return 1+3+5=9
	 * return 0 if n is less than or equal to 0
	 * 
	 * HINT: if the number is even, ignore it and return sumOdd(n-1)
	 */
	public static int sumOdd(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n%2 == 0) {
			return sumOdd(n-1);
		}
		return sumOdd(n-1)+n;
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of all positive even numbers up to n.
	 * (note, n itself may or may not be an even number)
	 * return 0 if n is less than or equal to 0
	 * For example:
	 * n = 6, return 6*6 + 4*4 + 2*2
	 * n = 9, return 8*8 + 6*6 + 4*4 + 2*2
	 * 
	 * HINT: If n is odd, ignore it and return sumEvenSquares(n-1)
	 */
	public static int sumEvenSquares(int n) {
		if(n<=0) {
			return 0;
		}
		if(n%2 != 0) {
			return sumEvenSquares(n-1);
		}
		return sumEvenSquares(n-1)+n*n;
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of all positive odd numbers up to n.
	 * (note, n itself may or may not be an odd number)
	 * return 0 if n is less than or equal to 0
	 * For example:
	 * n = 6, return 5*5 + 3*3 + 1*1
	 * n = 7, return 7*7 + 5*5 + 3*3 + 1*1
	 * 
	 * HINT: If n is even, ignore it and return sumOddSquares(n-1)
	 */
	public static int sumOddSquares(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n%2 == 0) {
			return sumOddSquares(n-1);
		}
		return sumOddSquares(n-1)+n*n;
	}

	/**
	 * 
	 * @param str
	 * @return true if str contains an y digit ('0' to '9'), false otherwise.
	 * return false if str is null.
	 * 
	 * HINT: you can check that a char ch is a digit using Character.isDigit(ch)
	 */
	public static boolean containsDigit(String str) {
		if(str == null || str.isEmpty()) {
			return false;
		}
		if(Character.isDigit(str.charAt(0))){
			return true;
		}
		return containsDigit(str.substring(1));
	}

	/**
	 * 
	 * @param str
	 * @return true if str contains ONLY digits ('0' to '9'), false otherwise.
	 * 
	 * !!!!!!IMPORTANT!!!!!! return true if str is empty
	 * 
	 * return false if str is null.
	 * 
	 * HINT: you can check that a char ch is a digit using Character.isDigit(ch)
	 */
	public static boolean isNumeric(String str) {
		if(str == null) {
			return false;
		}
		if(str.isEmpty()) {
			return true;
		}
		if(Character.isDigit(str.charAt(0))) {
			return isNumeric(str.substring(1));
		}
		return false;
	}

	/**
	 * 
	 * @param str
	 * @param target
	 * @return true if String str contains character target, false otherwise.
	 * return false if str is null
	 * IMPORTANT: You may not call the methods indexOf or lastIndexOf or contains from String class
	 */
	public static boolean contains(String str, char target) {
		if(str == null || str.isEmpty()) {
			return false;
		}
		if(str.charAt(0) == target) {
			return true;
		}
		return contains(str.substring(1), target); //testing
	}

	/**
	 * 
	 * @param str
	 * @param target
	 * @return true if String str contains String target, false otherwise.
	 * return false if str is null or target is null
	 * IMPORTANT: You may not call the methods indexOf or lastIndexOf or contains from String class
	 */
	public static boolean contains(String str, String target) {
		return false;
	}

	/**
	 * 
	 * @param x
	 * @param n: assume n is more than or equal to 0
	 * @return x to the power of n
	 * IMPORTANT: for any integer x, x to the power of 0 is 1 
	 */
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		return (x*power(x,n-1));

	}
}
