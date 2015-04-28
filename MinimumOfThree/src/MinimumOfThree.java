import java.util.Scanner;


public class MinimumOfThree {

	
	private static int pairs, a, b, c;
	
	private static void compare(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println(a);	
		} else if (c < a && c < b){
			System.out.println(c);
		} else if (b < a && b < c){
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the number of triples: ");
		
		pairs = in.nextInt();
		
		System.out.println("Please enter your input: ");
		
		for (int i = 0; i <= pairs; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			
			compare(a, b, c);
			
			a = 0;
			b = 0;
			c = 0;
		}

	}

}
