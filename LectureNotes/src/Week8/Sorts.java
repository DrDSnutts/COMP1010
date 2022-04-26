package Week8;

public class Sorts {

	public static void main(String[] args) {

		int[] a = {7, 5, 9, 6, 3};
		SortService.display(a, a.length);

		System.out.println("Insertion Sort:");
		SortService.insertionSort(a);
		SortService.display(a, a.length);
		System.out.println();
		
		System.out.println("Selection Sort:");
		SortService.selectionSort(a);
		SortService.display(a, a.length);
	}
}
