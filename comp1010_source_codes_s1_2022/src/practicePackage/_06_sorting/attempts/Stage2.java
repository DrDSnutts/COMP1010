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
		
		
		for(int i = idx; i<data.length; i++) {
			int backup = data[i];
			
			if(data[i] < data[idx]) {
				data[i] = data[idx];
				data[idx] = backup;
			}
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
		if (data == null || data.length == 0) {
			 return -1;
		 }
		
		int maxCount = 1, res = data[0];
        int currCount = 1;
 
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1])
                currCount++;
            else
                currCount = 1;
 
            if (currCount > maxCount) {
                maxCount = currCount;
                res = data[i - 1];
            }
        }
        return res;
	}

	/**
	 * 
	 * @param data
	 * @return true if data is sorted in either ascending or descending order, false
	 *         otherwise.
	 */
	public static boolean isSorted(int[] data) {
		if (data == null || data.length == 0) {
			 return false;
		 }
		if(data.length == 1) {
			return true;
		}
		
		int ascCount = 0;
		int descCount = 0;
		
		for(int i = 0; i<data.length-1; i++) {
			if(data[i] <= data[i+1]) {
				ascCount++;
			}
			if(data[i] >= data[i+1]) {
				descCount++;
			}
		}
		
		if(ascCount >= data.length-1) {
			return true;
		}
		if(descCount >= data.length-1) {
			return true;
		}
		return false;
	}

	/**
	 * @param data
	 * @param val
	 * @return the array after val is inserted at the correct position. Assume data
	 *         is sorted is ascending order. If the array is invalid, return null.
	 */
	public static int[] insertAtRightPlace(int[] data, int val) {
		if (data == null || data.length == 0) {
			 return null;
		 }
		
		int arr[] = new int[data.length + 1];
		
		for(int i = 0; i<data.length; i++) {
			arr[i] = data[i];
		}
		arr[arr.length-1] = val;
		
		for(int i = 0; i<arr.length-1; i++) {
			int minIndex = i; 
			
			for (int k=i+1; k<arr.length; k++) {
				if (arr[k] < arr[minIndex]) {
					minIndex = k; 
				}
			}
			
			int temp = arr[i]; 
			arr[i] = arr[minIndex]; 
			arr[minIndex] = temp; 
		}
		
		return arr;
	}

	/**
	 * 
	 * @param data
	 * @return the sorted array. Use one of the algorithms learned in class to sort
	 *         the data.
	 */
	public static int[] sort(int[] data) {
		for(int i = 0; i<data.length-1; i++) {
			int minIndex = i; 
			
			for (int k=i+1; k<data.length; k++) {
				if (data[k] < data[minIndex]) { 
					minIndex = k; 
				}
			}
			
			int temp = data[i]; 
			data[i] = data[minIndex];
			data[minIndex] = temp; 
		}
		return data;
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
