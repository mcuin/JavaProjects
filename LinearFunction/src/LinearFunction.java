import java.util.Scanner;


public class LinearFunction {
	
	private static int total, x1, y1, x2, y2;
	private static int a, b;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the input: ");
		
		total = in.nextInt();
		
		while (in.hasNextLine()) {
			x1 = in.nextInt();
			y1 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt();
			
			a = (y1 - y2) / (x1 - x2);
			b = (y1) - (a * x1);
			
			System.out.println("(" + a + " " + b + ")");
			
			a = 0;
			b = 0;
		}

	}

}
