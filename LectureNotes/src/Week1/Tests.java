package Week1;

public class Tests {
	
public static void main(String[] args) {
	System.out.println(power(2,4));
}

public static int power(int x, int n) {
	for(int i = 0; i<=n; i++)
		x*=n/10;
	return x;
}
}
