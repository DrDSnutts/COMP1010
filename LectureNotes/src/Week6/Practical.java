package Week6;

public class Practical {
	
		public static int steep(String a) {
	   		if(a == null || a.isEmpty()) {
				return 0;
			}
			if(a.charAt(0) == ' ') {
				return 1 + steep(a.substring(1));
			}
			return steep(a.substring(1));
		}
		
		public static void main(String[] args) {
			String s = "is it on?";
			int b = steep(s);
			System.out.println(b);
		
	}
}
