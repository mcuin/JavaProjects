import java.util.Scanner;


public class Progression {
	
	private static int total, a, b, times, i = 0, sum;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter how many sequnces there are: ");
		
		total = in.nextInt();
		
		while (in.hasNextLine()) {
			a = in.nextInt();
			b = in.nextInt();
			times = in.nextInt();
			for (int j = 0; j < times; j++) {
				sum += (a + (j * b));
			}
			System.out.println(sum);
			sum = 0;
			i++;
		}
		
		in.close();

	}

}
