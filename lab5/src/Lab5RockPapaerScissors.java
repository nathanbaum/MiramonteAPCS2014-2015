/**************************************
 * Title: Rock Paper Scissors
 * @author Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user inputs a play of rock, paper, or scissors
 * Postcond: user will win or lose
 **************************************/
import java.util.Scanner;
import java.util.Random;

public class Lab5RockPapaerScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		char uInp;
		int compPlay, uPlay, z;
		String temp, result;
		
		while(true){
			System.out.println("Input Rock(r), Paper(p), or Scissors(s):");
			temp = scan.next();
			temp = temp.toLowerCase();
			uInp = temp.substring(0, 1).charAt(0);
		
			if(uInp == 'r'){
				uPlay = 0;
				System.out.println("You choose Rock.");
				break;
			}
			else if(uInp == 'p'){
				uPlay = 1;
				System.out.println("You choose Paper.");
				break;
			}
			else if(uInp == 's'){
				uPlay = 2;
				System.out.println("You chose Scissors.");
				break;
			}
			else{
				System.out.println("Invalid Input: \"" + temp + "\" is not a valid responce. Please try again.");
			}
		}
		
		compPlay = rand.nextInt(3);
		
		if(compPlay == 0)System.out.println("Computer chooses Rock.");
		else if(compPlay == 1)System.out.println("Computer chooses Paper.");
		else System.out.println("Computer chooses Scissors.");
		
		//logic subtracts and then compares
		z = uPlay-compPlay;
		//System.out.println(z);
		
		if(z == 1||z==-2)result = "win";
		else if(z == 2||z==-1)result = "lose";
		else if(z == 0)result = "tie";
		else result = "*error*";
		
		System.out.println("You " + result + ".");
		
		scan.close();

	}

}
