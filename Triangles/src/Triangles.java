import java.util.Scanner;


public class Triangles {
	
	private static int total, s1, s2, s3;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter all input: ");
		
		total = in.nextInt();
		
		while (in.hasNextLine()) {
			s1 = in.nextInt();
			s2 = in.nextInt();
			s3 = in.nextInt();
			
			if (s1 + s2 >= s3 && s1 + s3 >= s2 && s2 + s3 >= s1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
		
		in.close();

	}

}
