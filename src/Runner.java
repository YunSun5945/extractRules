import java.io.IOException;


public class Runner {
		public static void main(String[] args) throws IOException {
			String filename = ""; // input csv file
			double min_sup	= 0;
			double min_conf	= 0;
			
			if(args.length <= 2)
				System.out.println("Not Enough Input!");
			else {
				filename = args[0];
				min_sup = Double.parseDouble(args[1]);
				min_conf = Double.parseDouble(args[2]);
			}
			
		}	
			
}
