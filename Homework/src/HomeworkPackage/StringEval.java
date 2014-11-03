 /***************************************************************
 * @title String Evaluator
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/18/2014
 * 
 * Precondition: User inputs string.
 * Postcondition: Prints number of: a's, e's, i's, o's, u's, 
 * 				vowelic y's, consonants, spaces, and punctuation
 * 				marks.
 **************************************************************/
package HomeworkPackage;
import java.util.Scanner;

public class StringEval {

	public static void main(String[] args) {
		int a=0, e=0, i=0, o=0, u=0, y=0, consonants=0, punctuation=0, spaces=0/*, x=0, topVal=0, compVal=0*/;
		boolean yIsVowel=false;
		char letter;
		String uIn/*, word="", topWord*/;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string:");
		uIn = scan.nextLine();
		
		for(int z=0; z<uIn.length(); z++){ //cycles through the string
			letter = uIn.toLowerCase().charAt(z); /*sets letter to character that the for
									loop is looking at for convenient referencing
									and so that the program can evaluate it as an
									int in ascii*/
			
			if(letter == 'a'){
				a++;
				yIsVowel=false;
			}
			else if(letter == 'e'){
				e++;
				yIsVowel=false;
			}
			else if(letter == 'i'){
				i++;
				yIsVowel=false;
			}
			else if(letter == 'o'){
				o++;
				yIsVowel=false;
			}
			else if(letter == 'u'){
				u++;
				yIsVowel=false;
			}
			else if(letter == 'y'){
				if(yIsVowel == true){//if the preceding letter is a consonant, y is a vowel
					y++;
					yIsVowel = false;
				}
				else{ //if it is not, y is a consonant
					consonants++;
					yIsVowel=true;
				}
			}
			else if(letter>=97 && letter<=122){ //a-z				
				consonants++;
				yIsVowel=true;
			}
			else if(letter == ' '){ //if the letter is a space
				spaces++;
				yIsVowel=false;
			}
			else if(!(letter>=48 && letter<=57)){ //not a number
				punctuation++;
				yIsVowel=true;
			}
			else{ //if a number
				yIsVowel=true;
			}
		}
		
		/*letter = uIn.toLowerCase().charAt(0);
		for(int z=0; z<=spaces; z++){
			compVal=0;
			while(letter>=97 && letter<=122){
				letter = uIn.toLowerCase().charAt(x);
				word = word + letter;
				x++;
			}
			
			for(int x)
		}*/
		
		System.out.println("Your string has " + a + " a's, " + e + " e's, " + i + " i's, " + o + " o's, " + u + " u's, " + y + " vowelic y's, " + consonants + " consonants, " + spaces + " spaces, and " + punctuation + " punctuation marks.");
		
		scan.close();
	}

}