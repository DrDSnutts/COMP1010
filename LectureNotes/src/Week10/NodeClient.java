package Week10;

public class NodeClient {

	public static void main(String[] args) {

		Node a = new Node("Bernard");
		Node b = new Node("Guarav", a);
		Node c = new Node("Nataly",b);
				
		System.out.println(c);
	}

}
