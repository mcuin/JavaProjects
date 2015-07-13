import joptsimple.OptionParser;
import joptsimple.OptionSet;


public class Main{

	public static void main(String[] args) {
		OptionParser parse = new OptionParser("kkeyword");
		
		OptionSet options = parse.parse("-k", "-keyword");
		
		if (args[1] == null) {
			
		}
	}

}
