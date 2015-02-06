package connectFourPackage;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			GameManager game = new GameManager(scan);
			int counter = 0;
			String uIn;
			while(!game.isWin){
				uIn = "";
				System.out.println("Guns! Fireworks! Football! Women! Men! And Everything in between! Cars! Alcohol! Node.js! Exclamation Points!!!!!!!!");
				if(counter==0){
					game.turn(1);
					counter++;
				}
				else{
					game.turn(2);
					counter--;
				}
			}
			System.out.println("Would you like to play again? (y/n)");
			uIn = scan.nextLine();
			if(uIn.equals("y")) break;
		}
	}
}
