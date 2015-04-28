import java.util.Scanner;


public class Sum {
	
	private static double a, b;
	
	private static double sum(double a, double b) {
		double c;
		c = a + b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Please enter your first number\n");
		Scanner read = new Scanner(System.in);
		a = read.nextDouble();
		System.out.println("Please enter your second number\n");
		b = read.nextDouble();
		read.close();
		System.out.println(sum(a, b));
	}

}
