/*************************************
 * @author Nathan (nbaum510@gmail.com)
 *Title: Number Guess Extension
 *Precond: user guesses mystery number
 *Postcond: user wins or loses
 ************************************/
package Lab6Package;

import java.util.Random;
import java.util.Scanner;

public class Lab6NumberGuessExtension {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int num, guess, lower, upper, range, guessLimit;
		String uIn;
		
		
		gameloop: //repeats as long as the player wants to play
		while(true){
			
			while(true){ //gets lower limit; catches any invalid inputs
				try{
					System.out.println("Input lower limit:");
					lower = scan.nextInt();
					break;//executes if scan.nextInt() throws no errors
				}
				catch(Exception e){
					System.out.println("Invalid Input");
					scan.next(); //prevents infinite throwing of errors
				}
			}
			
			while(true){ //gets upper limit; catches any invalid inputs
				try{
					System.out.println("Input upper limit:");
					upper = scan.nextInt();
					if(upper>lower){
						break;//executes if scan.nextInt() throws no errors
					}
					else{
						System.out.println("Limit Error");
					}
				}
				catch(Exception e){
					System.out.println("Invalid Input");
					scan.next(); //prevents infinite throwing of errors
				}
			}
			
			range = upper - lower; //calculates range
			num = rand.nextInt(range)+lower;/*generates a random number within
											range assuming that it starts at
											0 and then adds the lower limit
											to make it start at the real lower
											limit */
			guessLimit=0;//resets guessLimit in preparation for loop
			while(range!=0){//calculates number of guesses necessary
				range = range/2;/*performs int devision; range is altered because after
								the random number is generated, range is no longer needed*/ 
				guessLimit++;
			}
			
			
			/*System.out.println("lower=" + lower);//for diagnostic purposes
			System.out.println("upper=" + upper);
			System.out.println("range=" + range);
			System.out.println("num=" + num);*/
			
			for(int i=guessLimit; i>0; i--){ //repeats for number of guesses that player has
				System.out.println("You have " + i + " guesses left.");
				while(true){ //catches any invalid inputs
					try{
						System.out.println("Make a guess between " + lower + " and " + upper + ":");
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
				
				if(i==1){ //handles loss message
					System.out.println("You lose! The number was " + num + ". Better luck next time!");
				}
			}
			
			while(true){ //prevents invalid inputs
				System.out.println("Would you like to play again?");
				uIn = scan.next();
				
				uIn = uIn.substring(0,1); //formats input (gets only 1st letter)
				/*System.out.println(uIn); //for diagnostic purposes*/
				
				if(uIn.equalsIgnoreCase("y")) break; //breaks the inner loop, but not outer, leading to new game
				else if(uIn.equalsIgnoreCase("n")) break gameloop; //breaks outer loop, which ends the program
				else System.out.println("Invalid Input");
			}
		}	
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
