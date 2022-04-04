package Week7;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("myList size is: " + myList.size());
		
		myList.add(20);
		myList.add(30);
		myList.add(70);
		myList.add(-30);
		myList.add(130);
		
		System.out.println("myList size is:" + myList.size());
		System.out.println("myList: "+ myList);
		
		myList.add(2,130);
		myList.add(myList.size(),140);
		System.out.println("myList: " +myList);
		
		myList.remove((Integer)130); //first element
		myList.remove((Integer)130);
		System.out.println("myList: " +myList);
		
		System.out.println("How many 30: " + count(myList, 30));
	}
	
	public static int count(ArrayList<Integer> list, int key) {
		int counter = 0;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) == key) {
				counter++;
			}
		}
		return counter;
	}

	

}
