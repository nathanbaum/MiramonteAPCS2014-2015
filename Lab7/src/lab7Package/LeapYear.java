/***************************************************************
 * @title Leap Year
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/29/2014
 * 
 * Precondition: User inputs a year.
 * Postcondition: Prints whether the year is a leap year.
 **************************************************************/
package lab7Package;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		boolean isLeap;
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("Please input a year:");
			try{
				year = scan.nextInt();
				break;
			}
			catch(Exception e){
				scan.next();
				System.out.println("Error: input not a year");
			}
		}
		
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0) isLeap = true;
				else isLeap = false;
			}
			else isLeap = true;
		}
		else isLeap = false;
		
		if(year < 1582) System.out.println("Error: " + year + " cannot be a leap year because\nthe Gregorian calendar on which this program\nis based was adopted in 1582.");
		else if(isLeap) System.out.println(year + " is a leap year.");
		else System.out.println(year + " is not a leap year.");
		
		scan.close();
	}

}
