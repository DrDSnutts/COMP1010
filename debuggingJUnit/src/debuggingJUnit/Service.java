package debuggingJUnit;

public class Service {
	public static double square(double val) {
		double result = val*val;
		return result;
	}

	public static boolean anySame(int a, int b, int c, int d) {
		if (a==b || a==c || a==d) {
			return true;
		}
		if (b==c || b==d) {
			return true;
		}
		return c==d;
	}

	/*
	 * check if any values in array occur more than once.
	 * return true if so,
	 * false otherwise
	 */
	public static boolean anySame(int[] data) {
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data.length; i++) {
				if (data[j] == data[i]) {
					return true;
				}
			}
		}
		return false;
	}

	
}
