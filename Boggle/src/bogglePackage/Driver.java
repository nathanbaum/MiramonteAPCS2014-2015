package bogglePackage;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String[] dictionary = {"apple, baseball, cat, dad,  eat, fish, get, hi, ice, jew, kale, lime, my, nathan, open, place, quiet, run, sit, tab, under, with, xylophone, you, zen"};
		boolean gameIsOn = true;
		Scanner scan = new Scanner(System.in);
		
		while(gameIsOn){
			Boggle Boggle = new Boggle(dictionary);
			Boggle.run(scan);
		}
		
		scan.close();
	}

}
