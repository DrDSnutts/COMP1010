package Week1;

public class arraySum {

	public static void main(String[] args) {
		int[] cars = {2, 4, 7, 5};
		int myTotal = total(cars);
		System.out.println(myTotal);
	}
	
	public static int total(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		return result;
	}
}
