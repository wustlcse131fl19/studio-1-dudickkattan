package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Name of first person?");
		String s1 = ap.nextString("Name of second person?");
		String s2 = ap.nextString("Name of third person?");
		String s3 = ap.nextString("Name of fourth person?");
		//
		// Say hello to the names in s0 through s3.
		//
System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");
	}
}
