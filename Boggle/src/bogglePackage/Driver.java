package bogglePackage;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String[] dictionary = {"hi", "bye", "bug", "big"};
		boolean gameIsOn = true;
		Scanner scan = new Scanner(System.in);
		
		while(gameIsOn){
			Boggle Boggle = new Boggle(dictionary);
			Boggle.run(scan);
		}
		
		scan.close();
	}

}
