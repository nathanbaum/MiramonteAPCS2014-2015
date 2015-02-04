package connectFourPackage;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameManager game = new GameManager(scan);
		int counter = 0;
		
		while(!game.isWin){
			if(counter==0){
				game.turn(1);
				counter++;
			}
			else{
				game.turn(2);
				counter--;
			}
		}
		
	}

}
