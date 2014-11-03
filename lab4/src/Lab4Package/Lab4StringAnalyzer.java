/**************************************
 * Title: Lab4StringAnalyzer
 * Author: Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user must have two words
 * Postcond: will print user's word lens', first letters, and combined words
 **************************************/
package Lab4Package;
import java.util.Scanner;

public class Lab4StringAnalyzer {

	public static void main(String[] args) {
		String word1;
		String word2;
		String combinedWords;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input word one:");
		word1 = scan.next();
				
		System.out.println("Input word two:");
		word2 = scan.next();
		
		combinedWords = word1 + word2;
		
		System.out.println("\tLength\tFirst Letter\t\nWord1\t" + word1.length() + "\t" + word1.substring(0,1) + "\nWord2" + "\t" + word2.length() + "\t" + word2.substring(0,1));
		System.out.println("Combined word: " + combinedWords);
		
		scan.close();

	}

}
