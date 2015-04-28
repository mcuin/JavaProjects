import java.util.Scanner;


public class MinimumOfTwo {
	
	private static int pairs, a, b;
	
	private static void compare(int a, int b) {
		if (a < b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the number of pairs: ");
		
		pairs = in.nextInt();
		
		System.out.println("Please enter your input: ");
		
		for (int i = 0; i <= pairs; i++) {
			a = in.nextInt();
			b = in.nextInt();
			
			compare(a, b);
			
			a = 0;
			b = 0;
		}

	}

}
