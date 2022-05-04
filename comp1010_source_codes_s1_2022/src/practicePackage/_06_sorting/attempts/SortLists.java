package practicePackage._06_sorting.attempts;

import java.util.ArrayList;

public class SortLists {
	

	public static ArrayList<Integer> insert(ArrayList<Integer> list, int value) {
		if(list == null) {
			return null;
		}
		
		list.add(value);
		
		for(int i = 0; i<list.size(); i++) {
			
			for(int j = i+1; j<list.size(); j++) {
				
				if(list.get(i) > list.get(j)) {
					
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
		}

		return list;
	}

	public static ArrayList<Integer> insertUnique(ArrayList<Integer> list, int value) {
		if(list == null) {
			return null;
		}
		
		int count = 0;
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i) != value) {
				count++;
			}
		}
		
		if(count >= list.size()) {
			list.add(value);
		}
		
		
		for(int i = 0; i<list.size(); i++) {
			
			for(int j = i+1; j<list.size(); j++) {
				
				if(list.get(i) > list.get(j)) {
					
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
		}

		return list;
	}

	/**
	 * 
	 * @param data - 2D array where every subarray contains a pair of numbers.
	 *             Assume there are no duplicates in the array.
	 * @param n    - The input array only contains the numbers 0 - (n-1).
	 * @return A list of size n. Every sublist should contain the sorted numbers
	 *         that is paired with the index. For example if the pairs were (1, 3),
	 *         (2,1), (2,0), the returned list would be [[2], [2, 3], [0, 1], [1]]
	 * 
	 */
	public static ArrayList<ArrayList<Integer>> sortInput(int[][] data, int n) {
		return null; //to be completed
	}
}
