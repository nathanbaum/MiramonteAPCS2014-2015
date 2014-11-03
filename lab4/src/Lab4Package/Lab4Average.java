/**************************************
 * Title: Lab4Average
 * Author: Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user must have two words
 * Postcond: will print user's word lens', first letters, and combined words
 **************************************/

package Lab4Package;
import java.util.Scanner;

public class Lab4Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test1;
		int test2;
		int test3;
		int exam;
		double total;
		
		System.out.println("Enter Points /20");
		test1 = scan.nextInt();
		System.out.println("Enter Points /50");
		test2 = scan.nextInt();
		System.out.println("Enter Points /40");
		test3 = scan.nextInt();
		System.out.println("Enter Points /100\n");
		exam = scan.nextInt();
		
		total = test1 + test2 + test3 + exam;
				
		System.out.println("Test1:" + test1 + "/20");
		System.out.println("Test2:" + test2 + "/50");
		System.out.println("Test3:" + test3 + "/40");
		System.out.println("Exam:" + exam + "/100");
		System.out.println("Total:" + total + "/210");
		
		System.out.println("Average: " + (total/210*100) + "%");
		
		
		scan.close();
	}

}
