package Week6;

public class RecursionStringService {
	
	public static String reverse(String str) {
		if(str == null) {
			return null;
		}
		
		if(str.isEmpty()) {
			return "";
		}
		//guaranteed: at least on character
		
		char first = str.charAt(0);
		String allButFirst = str.substring(1);
		String reverseAllButFirst = reverse(allButFirst);
		String result = reverseAllButFirst + first;
		return result;
	}
	
	public static boolean isPalindrome(String str) {
		if(str == null) {
			return false;
		}
		return str.equalsIgnoreCase(reverse(str));
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("hello world"));
		System.out.println(isPalindrome("racecar"));
	}

}
