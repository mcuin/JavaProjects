import java.util.Scanner;


public class LoopSum {
	
	private static double a, sum = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your inputs: ");
		
		while(in.hasNext()) {
			a = in.nextDouble();
			sum = a + sum;
			System.out.println(sum);
		}
		
		

	}

}
