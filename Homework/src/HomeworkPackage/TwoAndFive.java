/***************************************************************
 * @title TwoAndFive
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/13/2014
 * 
 * Precondition: User inputs number.
 * Postcondition: Prints what combination of 5s and 2s is
 * 				required to make the number.
 **************************************************************/
package HomeworkPackage;

import java.util.Scanner;


public class TwoAndFive {
	

	public static void main(String[] args) {
		int num, extra, fives = 0, twos = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			try{
				System.out.print("Enter an integer:");
				num = scan.nextInt();
				System.out.println("To make " + num + ", you need:");
				break;
			}
			catch(Exception e){
				System.out.println("Error: invalid input");
				scan.next();
			}
		}
		extra = num-fives*5;
		
		while(extra%2!=0 && extra>=5){
			fives++;
			extra = num-fives*5;
		}
		twos = extra/2;
		extra = num-(fives*5+twos*2);
		
		if(extra == 0){
			System.out.println(fives + " fives, and " + twos + " twos.");
		}
		else{
			System.out.println("No combination of twos and fives can make that int.");
		}
		
		scan.close();
	}

}
