package Week3;

public class Client {

	public static void main(String[] args) {		
		Rectangle r; //r is a rectangle "object"
		
		r = new Rectangle(10, 70);
		
		System.out.println(r.length);
		System.out.println(r.breadth);
		
		System.out.println("Done");

		Rectangle sq = new Rectangle (50,50);
		
		System.out.println(sq.length);
		System.out.println(sq.breadth);
		
		System.out.println(r.length);
		System.out.println(r.breadth);
		System.out.println(r.area());
		System.out.println(r.getShortSide());
		System.out.println(r.isSquare());
		
	}

}
