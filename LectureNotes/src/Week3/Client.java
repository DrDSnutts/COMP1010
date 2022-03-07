package Week3;

public class Client {

	public static void main(String[] args) {
		int x = 0;
		
		Rectangle r = null; //r is a rectangle "object"
		
		r = new Rectangle();
		
		System.out.println(r.length);
		System.out.println(r.breadth);
		
		r.length = 10;
		r.breadth = 70;
		
		System.out.println(r.length);
		System.out.println(r.breadth);
		
		System.out.println("Done");

	}

}
