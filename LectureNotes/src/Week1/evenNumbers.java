package Week1;

public class evenNumbers {

	public static void main (String[] args) {
		int[] bikes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int evenTotal = even(bikes);
		System.out.println(evenTotal);
	}
	
	public static int even (int[] a) {
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			if (a[i]%2 == 0)
				sum+= a[i];
		}
		return sum;
	}
}
