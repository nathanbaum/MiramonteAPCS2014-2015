package BlackJackPack;
import java.util.Scanner;

public class Dealer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean gameIsOn = true, playerHit = true;
		Hand playerHand, dealerHand;
		Deck deck;
		String uIn;
		
		while(gameIsOn){

			deck = new Deck();
			playerHand = new Hand();
			dealerHand = new Hand();
			uIn = "";
			playerHit = true;
			
			System.out.println("I'm dealing the cards.");
			for(int i=0; i<2; i++){
				System.out.println("one for you...");
				playerHand.addCard(deck.draw());
				System.out.println("one for me...");
				dealerHand.addCard(deck.draw());
			}
			System.out.println("\nYour hand is: \n" + playerHand.toString());
			
			System.out.println("One of my cards is: " + dealerHand.bleed(0));
			
			while(playerHit){
				while(true){
					System.out.println("\nWould you like to hit?(y/n)");
					uIn = scan.next();
					uIn = Character.toString(uIn.toLowerCase().charAt(0));
					if(uIn.equals("y") || uIn.equals("n")) break;
					System.out.println("It was a yes or no question.");
				}
				if(uIn.equals("y")){//operator for whether the player hits or stands
					System.out.println("You hit.");
					playerHand.addCard(deck.draw());
					System.out.println("You draw " + playerHand.bleed(playerHand.getSize()-1));
					System.out.print("\nYour hand is: \n" + playerHand.toString());
				}
				else{
					System.out.println("You stand.");
					playerHit = false;
				}
				if(playerHand.getValue()>21){//checks if the player loses
					System.out.println("\nYou bust. House wins.");
					gameIsOn = false;
					break;
				}
			}
			
			while(dealerHit(dealerHand.getValue()) && gameIsOn){
				System.out.println("\nI hit.");
				dealerHand.addCard(deck.draw());
				if(dealerHand.getValue()>21){
					System.out.println("\nI bust. You win.");
					gameIsOn = false;
				}
			}
			if(gameIsOn) System.out.println("I stand.");

			
			if(gameIsOn){
				System.out.print("\nI have:\n" + dealerHand.toString());
				if(dealerHand.getValue()>playerHand.getValue()) System.out.println("\nHouse wins.");
				else if(dealerHand.getValue()<playerHand.getValue()) System.out.println("\nYou win.");
				else System.out.println("\nWe tied.");
			}
			
			gameIsOn = true;
			while(true){
				System.out.println("\nWould you like to play again?(y/n)");
				uIn = scan.next();
				uIn = Character.toString(uIn.toLowerCase().charAt(0));
				if(uIn.equals("y") || uIn.equals("n")) break;
				System.out.println("It was a yes or no question.");
			}
			if(uIn.equals("n")) gameIsOn = false;
		}
		
		scan.close();
	}
	
	private static boolean dealerHit(int total){
		if(total >= 17) return false;
		return true;
	}

}
