import java.util.Scanner;


public class Rounding {
	
	private static double a, b, c;
	private static int equal;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i <= 11; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = a / b;
			equal = (int) Math.round(c);
			System.out.println(equal);
		}
		
		in.close();

	}

}
