package Week10;

public class Node {

	public String data; //storage
	public Node next; //accessing the rest
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node (String s) {
		data = s;
		next = null;
	}
	
	public Node (String s, Node n) {
		data = s;
		next = n;
	}
	
	public String toString() {
		if(next == null) {
			return data;
		}
		else {
			return data + " -> " + next.toString();
		}
	}
	
}
