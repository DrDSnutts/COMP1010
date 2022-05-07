package practicePackage._06_sorting.attempts;

public class Stage3 {
	/**
	 * 
	 * @param a - assume a is sorted in ascending order
	 * @param b - assume b is sorted in ascending order
	 * @return a sorted array containing all the items in a and b. Return null if
	 *         either array is invalid (Null).
	 */
	public static int[] merge(int[] a, int[] b) {
		if (a == null || b == null) {
			return null;
		}
		
		int arr[] = new int[a.length+b.length];
		
		for(int i = 0; i<a.length; i++) {
			arr[i] = a[i];
		}
		
		for(int i = 0; i<b.length; i++) {
			arr[a.length + i] = b[i];
		}
		
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
	 *         the array.
	 */
	public static Unit[] sort(Unit[] data) {
		return null;
		
	}

	/**
	 * 
	 * @param data
	 * @param weight
	 * @return the array data that is sorted after their weights. Do not modify the
	 *         array weight. If data = {20, 70, 10} and weight = {1, 4, 2} return
	 *         {20, 10, 70} (20 has a weight of 1, 70 has a weight of 4, 10 has
	 *         weight of 2). Return null if the two arrays are not of the same size.
	 *         If the values have the same weight, they should be sorted is
	 *         ascending order.
	 */
	public static int[] sortTwoArrays(int[] data, int[] weight) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the array after it has been sorted so that all the non-negative
	 *         numbers are sorted before the negative numbers. The two groups should
	 *         be sorted in ascending order.
	 */
	public static int[] sortPositiveNegative(int[] data) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the array after it has been sorted so that all the odd numbers are
	 *         sorted after the even numbers. The two groups should be sorted in
	 *         ascending order.
	 */
	public static int[] sortOddEven(int[] data) {
		return null; //to be completed
	}

	/**
	 * @param data Given a 2D array, return a 1D array containing the sorted values.
	 */
	public static int[] sort2Dinto1D(int[][] data) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param data - assume none of the subarrays are null
	 * @return the same array but with the subarrays sorted in ascending order after
	 *         the first value. If the first values are the same, continue and check
	 *         the following values. For example [10, 70, 20] > [5, 70, 20] (10 >5),
	 *         [10, 70, 20] > [10, 70, 5] and [10, 70, 20] > [10, 70]. IMPORTANT: do
	 *         not create new subarrays.
	 */
	public static int[][] sortFirstValue(int[][] data) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param data - assume none of the subarrays are null
	 * @return a 2D array containing the sorted values of data. For example [[20,
	 *         70], [10], [15, 90, 40]] should be sorted as [[10, 15], [20], [40,
	 *         70, 90]]
	 */
	public static int[][] sortAscending(int[][] data) {
		return null; //to be completed
	}
}
