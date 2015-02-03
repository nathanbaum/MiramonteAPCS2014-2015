package connectFourPackage;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameManager game = new GameManager(scan);
		
		for(int i=0; i<2; i++){
			game.turn(1);
			game.turn(2);
		}
		
	}

}
