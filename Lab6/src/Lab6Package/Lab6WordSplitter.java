/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Word Splitter
 *Precond: user inputs a word
 *Postcond: split word is output
 ************************************/
package Lab6Package;

import java.util.Scanner;

public class Lab6WordSplitter {

	public static void main(String[] args) {
		String uInput;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input word:");
		uInput = scan.next();
		
		for(int i=0; i<uInput.length(); i++){
			System.out.println(uInput.substring(i, i+1));
		}
		
		scan.close();

	}

}
