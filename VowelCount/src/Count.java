import java.util.Scanner;


public class Count {

	private static int total, vowelCount = 0;
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//total = in.nextInt();
		
		for (int i = 0; i <= 19; i++) {
			if (in.hasNextLine() == false) {
				if (in.next().equals("a") || in.next().equals("e") || in.next().equals("i") || 
						in.next().equals("o") || in.next().equals("u") || in.next().equals("y")) {
					vowelCount = vowelCount + 1;
					System.out.println(vowelCount);
				} else {
					System.out.println(vowelCount);
				}
			}
		}
	}

}