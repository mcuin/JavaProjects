import java.util.Scanner;


public class MinMaxArray {
	
	private static int min, max, a;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the list: ");
		
		while (in.hasNext()) {
			a = in.nextInt();
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
			
			System.out.println(max);
			System.out.println(min);
		}
		
	}

}
