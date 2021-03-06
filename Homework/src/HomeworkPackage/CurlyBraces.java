/***************************************************************
 * @title CurlyBraces
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/13/2014
 * 
 * Precondition: User inputs string.
 * Postcondition: Prints whether curly braces match up.
 **************************************************************/
package HomeworkPackage;
import java.util.Scanner;

public class CurlyBraces {

	public static void main(String[] args) {
		String uIn;
		int braceSum=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a string: ");
		uIn = scan.next();
		
		for(int i=0; i<uIn.length(); i++){
			if(uIn.charAt(i) == '{') braceSum++;
			else if(uIn.charAt(i) == '}') braceSum--;
			if(braceSum<0) break;
		}
		
		if(braceSum == 0) System.out.println("Baces match up.");
		else System.out.println("Braces do not match up.");
		
		scan.close();
	}

}
