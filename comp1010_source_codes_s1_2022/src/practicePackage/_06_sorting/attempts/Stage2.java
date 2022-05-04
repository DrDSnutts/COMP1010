package practicePackage._06_sorting.attempts;

public class Stage2 {
	/**
	 * @param data - assume data is sorted in ascending order up to idx
	 * @param idx
	 * @return the array after the value at index idx is shifted to the correct
	 *         sorted position.
	 */
	public static int[] shiftToRightPlace(int[] data, int idx) {
		if (data == null || data.length == 1) {
			 return data;
		 }
		 
		for(int i = 0; i<idx; i++) {
			int backup = data[i];
			
			if(data[i] > data[idx]) {
				data[i] = data[idx];
				data[idx] = backup;
			}
		}
		return data;
	}

	/**
	 * @param data - assume data is sorted up to idx and all numbers in the sorted
	 *             part is smaller than in the unsorted part.
	 * @param idx
	 * @return the array after the next swap has occurred. For example [20, 70, 40,
	 *         90, 30, 80, 20] would swap 70 and 20.
	 */
	public static int[] swapToRightPlace(int[] data, int idx) {
		if (data == null || data.length == 1) {
			 return data;
		 }
		
		for(int i = 0; i<data.length; i++) {
			int minIndex = i;
			
			for(int j = i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					minIndex = j;
				}
			}
			int temp = data[i];
			data[i]= data[minIndex];
			data[minIndex] = temp;
		}
		return data;
	}

	/**
	 * Given a sorted array with an even length, pair up all the values so that the
	 * max number in the pairs is minimal. If data is invalid, return null.
	 */
	public static int[] pair(int[] data) {
		if (data == null || data.length == 10) {
			 return null;
		 }
		return null;
	}

	/**
	 * 
	 * @param data
	 * @return the most common number in the sorted array. If there is a tie, select
	 *         the number that occurs first. If data is invalid or empty, return -1.
	 */
	public static int mostCommon(int[] data) {
		return -1; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if data is sorted in either ascending or descending order, false
	 *         otherwise.
	 */
	public static boolean isSorted(int[] data) {
		return false; //to be completed
	}

	/**
	 * @param data
	 * @param val
	 * @return the array after val is inserted at the correct position. Assume data
	 *         is sorted is ascending order. If the array is invalid, return null.
	 */
	public static int[] insertAtRightPlace(int[] data, int val) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the sorted array. Use one of the algorithms learned in class to sort
	 *         the data.
	 */
	public static int[] sort(int[] data) {
		return null; //to be completed
	}

	/**
	 * ADVANCED: there exists an O(nlogn) solution using merge sort (which will be
	 * covered in 2010)
	 * 
	 * @param data
	 * @return the number of swaps needed to sort the array using bubble sort.
	 *         Return -1 if data is invalid.
	 */
	public static int bubbleSortCount(int[] data) {
		return -1; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the number of items you need to shift to sort the array using
	 *         insertion sort. Return -1 if data is invalid.
	 */
	public static int insertionSortCount(int[] data) {
		return -1; //to be completed
	}

	
}
