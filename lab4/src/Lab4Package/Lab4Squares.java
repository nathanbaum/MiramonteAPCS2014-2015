/**************************************
 * Title: Lab4Squares
 * Author: Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user must have name and number
 * Postcond: will print user's name and the square of their number
 **************************************/
package Lab4Package;
import java.util.Scanner;


public class Lab4Squares {

	public static void main(String[] args) {
		String name;
		int number;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		name = scan.next();
		
		System.out.println("Enter your Favorite Number:");
		number = scan.nextInt();
		
		scan.close();
		
		
		result = number * number;
		
		System.out.println("Hi " + name + ", the square of your favorite number is " + result + ".");

	}

}
