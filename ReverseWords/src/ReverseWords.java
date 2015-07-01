/* Sample code to read in test cases: */
import java.io.*;
public class ReverseWords {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] words = line.split(" ");
            int size = words.length;
            for (int i = 0; i < size; i++) {
            	System.out.print(" " + words[(size - 1) - i]);
            }
            
            System.out.print("\n");
        }
    }
}