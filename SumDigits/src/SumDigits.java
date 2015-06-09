import java.util.ArrayList;
import java.util.Scanner;


public class SumDigits {
	
	private static int total, a, b, c, sum1, sum2;
	private static ArrayList<Integer> digits;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the input: ");
		
		total = in.nextInt();
		
		while(in.hasNextLine()) {
			digits = new ArrayList<Integer>();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			
			sum1 = (a * b) + c;
			
			while (sum1 > 0) {
				digits.add(sum1 % 10);
				sum1 /= 10;
			}
			
			for (int i = 0; i < digits.size(); i++) {
				sum2 += digits.get(i);
			}
			
			System.out.println(sum2);
			
			sum2 = 0;
		}
		
		in.close();

	}

}
