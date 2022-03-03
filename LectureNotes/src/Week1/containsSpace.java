package Week1;

public class containsSpace {

	public static void main(String[] args) {
		System.out.println(hasSpace("Hello World"));
	}
	
	public static boolean hasSpace(String s) {
		for (int i=0; i < s.length(); i++)
			if(s.charAt(i) == ' ') {
				return true;
			}
	return false;
	}
	
}
