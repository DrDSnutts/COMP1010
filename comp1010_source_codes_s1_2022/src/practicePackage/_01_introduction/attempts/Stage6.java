// Cannot use any library functions for any task

package practicePackage._01_introduction.attempts;

public class Stage6 {
	public static String add(String a, String b) {
		return "";
	}

	public static String subtract(String a, String b) {
		return "";
	}

	public static String multiply(String a, String b) {
		return "";
	}

	public static String divide(String a, String b) {
		return "";
	}

	public static String remainder(String a, String b) {
		return "";
	}

	public static String getRandomInteger(int minDigits, int maxDigits) {
		int n = (int)(Math.random()*(maxDigits - minDigits + 1)) + minDigits;
		String result = "";
		for(int i=0; i < n; i++) {
			result = result + (int)(Math.random()*10);
		}
		return result;
	}
}
