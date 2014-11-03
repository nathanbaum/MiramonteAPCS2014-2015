/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Number Guess
 *Precond: user guesses mystery number
 *Postcond: user wins or loses
 ************************************/
package Lab6Package;

import java.util.Random;
import java.util.Scanner;

public class Lab6NumberGuess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int guessLimit = 7;
		int range = 100;
		int num, guess;
		String uIn;
		
		gameloop: //repeats as long as the player wants to play
		while(true){
			num = rand.nextInt(range);
			//System.out.println("num=" + num); - for diagnostic purposes
			
			for(int i=guessLimit; i>0; i--){ //repeats for number of guesses the player has
				System.out.println("You have " + i + " guesses left.");
				while(true){ //catches any invalid inputs
					try{
						System.out.println("Make a guess.");
						guess = scan.nextInt();
						break;//executes if scan.nextInt() throws no errors
					}
					catch(Exception e){
						System.out.println("Invalid Input");
						scan.next(); //prevents infinite throwing of errors
					}
				}
				
				if(guess>num) System.out.println("Your guess was too high."); //logic for determining whether or not user wins
				else if(guess<num) System.out.println("Your guess was too low.");
				else{
					System.out.println("You got it!");
					break;
				}
			}
			
			while(true){ //prevents invalid inputs
				System.out.println("Would you like to play again?");
				uIn = scan.next();
				
				uIn = uIn.substring(0,1); //formats input (gets only 1st letter)
				System.out.println(uIn);
				
				if(uIn.equalsIgnoreCase("y")) break; //breaks the inner loop, but not outer, leading to new game
				else if(uIn.equalsIgnoreCase("n")) break gameloop; //breaks outer loop, which ends the program
				else System.out.println("Invalid Input");
			}
		}
		
		System.out.println("Thanks for playing!");
		scan.close();

	}

}
