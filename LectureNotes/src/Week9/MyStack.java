package Week9;

import java.util.ArrayList;

public class MyStack {

	public ArrayList<String> items;
	
	public MyStack() {
		items = new ArrayList<String>();
	}
	
	public void push(String item) {
		items.add(0,item); // stick to the logic
	}
	
	public String pop() {
		if (isEmpty()){
			return null;
		}
		else {
			return items.remove(0);
		}
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
}
