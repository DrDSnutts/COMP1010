package practicePackage._05_arrayList.attempts;
import java.util.ArrayList;

import serviceClasses.Rectangle;

public class Stage1 {
	/**
	 * 
	 * @param list
	 * @return the last item in the list.
	 * return null if list is null or empty
	 */
	public static Integer getLastItem(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return null;
		}
		
		return list.get(list.size()-1);
	}

	/**
	 * 
	 * @param list
	 * @return the sum of the first and last items
	 * return null if list is null or empty
	 * return the only value if list contains a single item
	 */
	public static Integer getSumFirstLastItems(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return null;
		}
		
		if(list.size() == 1) {
			return list.get(0);
		}
		
		return list.get(0) + list.get(list.size()-1);
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains an even number of items (0, 2, 4 ....), false otherwise
	 * return false if list is null
	 */
	public static boolean containsEvenNumberOfItems(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		
		if(list.size()%2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the two lists are of the same size, false otherwise
	 * return false if EITHER list is null
	 */
	public static boolean sameSize(ArrayList<Integer> a, ArrayList<Integer> b) {
		if(a == null || b == null) {
			return false;
		}
		
		if(a.size() == b.size()) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param list
	 * @return the median value in the list (the item in the middle).
	 * if the list has an odd number of items, it's a clear choice.
	 * if the list has an even number of items, return the number just to the left of the dividing line.
	 * if the list is null or empty, return null
	 * 
	 * Some parameter-return value examples:
	 * list = [10,70,20,90,30], return 20
	 * list = [50,80,90,70], return 80
	 * list = [], return null
	 * list = null, return null
	 * 
	 */
	public static Integer median(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return null;
		}
		if(list.size() == 1) {
			return list.get(0);
		}
		
		if(list.size()%2 == 0) {
			return list.get(((list.size())/2)-1);
		}
		return list.get(list.size()/2);
	}
	
	/**
	 * 
	 * @param list - an arraylist of Rectangle objects
	 * @return the first item in the list.
	 * return null if list is null or empty
	 */
	public static Rectangle getFirstItem(ArrayList<Rectangle> list) {
		if(list == null || list.size() == 0) {
			return null;
		}
		
		return list.get(0);
	}
}
