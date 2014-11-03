/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Palindromes
 *Precond: user inputs a word
 *Postcond: outputs whether or not the word is a palindrome
 ************************************/

package Lab6Package;

import java.util.Scanner;

public class Lab6Palindromes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word;
		String newWord1 = "";
		String newWord2 = "";
		
		System.out.println("Input Word:");
		word = scan.next();
		
		
		for(int i=0; i<word.length()/2; i++){
			newWord1 = newWord1+word.charAt(i);
		}
		
		if(word.length()%2 == 0)//executes if even # of letters in word
			for(int i=word.length()-1; i>=word.length()/2; i--){/*i>=word.length()/2 because
			 													if the word has an even # of
			 													letters the loops needs to 
			 													scan exactly half of them*/ 
				newWord2 = newWord2+word.charAt(i);
			}
		else{//executes if odd
			for(int i=word.length()-1; i>word.length()/2; i--){/*i>word.length()/2 because
			 													if the word has an even number
			 													of letters, the loops needs
			 													to ignore the middle letter*/
				newWord2 = newWord2+word.charAt(i);
			}
		}//it's messy and unnecessary, I know, but I couldn't think of a better way to do it
		
		/*System.out.println("word length /2 = " + (word.length()/2));
		System.out.println("newWord1: " + newWord1);
		System.out.println("newWord2: " + newWord2);*/ //for diagnostic purposes
		
		if(newWord1.equalsIgnoreCase(newWord2)) System.out.println("\"" + word + "\" is a palindrome!");
		else System.out.println("\"" + word + "\" is not a palindrome.");
		
		scan.close();

	}

}
