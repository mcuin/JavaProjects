import java.util.Scanner;


public class FotC {

	private static int total, a, c;
	private static double dec;
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		
		total = in.nextInt();
		
		for (int i = 0; i <= total; i++) {
			a = in.nextInt();
			dec = ((a - 32) / (1.8));
			c = (int) Math.round(dec);
			System.out.println(c);
		}
		
		in.close();
		
	}

}
