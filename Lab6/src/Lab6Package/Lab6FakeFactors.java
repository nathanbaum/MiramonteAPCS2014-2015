/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Factors
 *Precond: user inputs an int
 *Postcond: outputs factors of int
 ************************************/
package Lab6Package;

import java.util.Scanner;

public class Lab6FakeFactors {

	public static void main(String[] args) {
		int uInput;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input integer:");
		uInput = scan.nextInt();
		
		System.out.println("Factors of " + uInput + ":");
		
		for(int i=uInput; i>0; i--){
			if(i == 1){
				System.out.print(i);
			}
			else if(uInput%i == 0){
				System.out.print(i + ", ");
			}
		}
		
		scan.close();

	}

}
