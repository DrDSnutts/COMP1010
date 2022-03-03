package Week1;

public class negativeNumbers {

	public static void main(String[] args) {
		int [] temperature = {-9, 5, -3, -4, 6, -3, -1};
		int sum = negative(temperature);
		System.out.println(sum);
	}
	
	public static int negative (int[] a) {
		int sum = 0;
		for (int i = 0; i<a.length/2; i++) {
			if (a[i] < 0)
				sum+=a[i];
		}
		return sum;
	}
}
