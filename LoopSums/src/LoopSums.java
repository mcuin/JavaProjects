import java.util.Scanner;


public class LoopSums {
	
	private static double pairs, sum, a, b;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the total pairs: ");
		
		pairs = in.nextDouble();
		
		System.out.println("Please enter your inputs: ");
		
		for(int i = 0; i <= pairs; i++) {
			a = in.nextDouble();
			b = in.nextDouble();
			sum = a + b;
			System.out.println(sum);
			sum = 0;
		}
		
		in.close();

	}

}