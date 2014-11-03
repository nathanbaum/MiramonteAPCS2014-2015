/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Factors
 *Precond: user inputs an int
 *Postcond: outputs factors of int
 ************************************/
package Lab6Package;

import java.util.Scanner;

public class Lab6Factors {

	public static void main(String[] args) {
		int uInput, newInt;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input integer:");
		uInput = scan.nextInt();
		
		System.out.print("Factors of " + uInput + ":\n1");
		
		newInt = uInput;
		for(int i=2; i<uInput/2; i++){
			while(newInt%i == 0){
				newInt = newInt/i;
				System.out.print("*" + i);
			}
		}
		
		scan.close();

	}

}

