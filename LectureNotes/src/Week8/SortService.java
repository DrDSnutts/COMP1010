package Week8;

public class SortService {
	
	/**
	 * @param a: array of Integers to sort in ASCENDING order
	 */
	
	public static void insertionSort(int[] a){
		 if (a == null || a.length == 1) {
			 return;
		 }
		 
		 for(int i = 1; i<a.length; i++) {
			 int backup = a[i]; //keep a copy of element to insert
			 
			 int k = i-1; //pointer to previous position to possibly shift
			 while (k>=0 && a[k] > backup) {
				 a[k+1] = a[k]; //shift of the element to the right
				 k--;
			 }
			 
			 a[k+1] = backup; //positioning smallest element to correct position
			 display(a,a.length);
		 }
	}
	
	public static void display(int[] a, int l) {
		for (int i = 0; i<l; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] a) {
		if(a == null || a.length == 1) {
			return;
		}
		
		for(int i = 0; i<a.length-1; i++) {
			int minIndex = i; //position of smallest element in remaining array
			
			for (int k=i+1; k<a.length; k++) {
				if (a[k] < a[minIndex]) { //we found a lower value
					minIndex = k; //update the position of the smallest value
				}
			}
			
			int temp = a[i]; //copy of value at correct location
			a[i] = a[minIndex]; //move smallest value to correct location
			a[minIndex] = temp; //copy the non-minimum value to the free position
		}
	}
}
