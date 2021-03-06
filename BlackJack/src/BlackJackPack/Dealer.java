package BlackJackPack;
import java.util.Scanner;

public class Dealer {
	
	private Hand[] playerHands;
	private Hand dealerHand;
	private Deck deck;
	private Scanner scan = new Scanner(System.in);
	
	private int getPlayers(){
		int players;
		while(true){
			System.out.println("How many players are there?");
			try{
				players = scan.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("Invalid Input");
				scan.next();
			}
		}
		return players;
	}
	
	public Dealer(){
		int players = getPlayers();
		this.playerHands = new Hand[players];
		for(int i=0; i<players; i++){
			playerHands[i] = new Hand();
		}
		this.dealerHand = new Hand();
		this.deck = new Deck();
		
	}
	
	public void deal(){
		Card burn;
		System.out.println("\nFirst, I'll burn the top card.");
		try {Thread.sleep(2000);} catch (InterruptedException e){}
		burn = deck.draw();
		//System.out.println(burn.toString());
		//System.out.println(deck.toString());
		System.out.println("Then, I'll deal out the cards.");
     		for(int i=0; i<2; i++){
			for(int h=0; h<playerHands.length; h++){
				try {Thread.sleep(1000);} catch (InterruptedException e){}
				System.out.println("One for player " + (h+1) + ".");
				playerHands[h].addCard(deck.draw());
			}
			try {Thread.sleep(1000);} catch (InterruptedException e){}
			System.out.println("One for me.");
			dealerHand.addCard(deck.draw());
		}
		System.out.println("\nOne of my cards is: " + dealerHand.bleed(0) + ".");
	}
	
	public void printHands(){
		for(int i=0; i<playerHands.length; i++){
			System.out.print("\nPlayer " + (i+1) + "'s hand is:\n" + playerHands[i].toString());
		}
	}
	
	public void playersHit(){
		String uIn;
		for(int i=0; i<playerHands.length; i++){
			while(true){
				while(true){
					System.out.println("\nPlayer " + (i+1) + ", would you like to hit?");
					uIn = this.scan.next();
					uIn = Character.toString(uIn.toLowerCase().charAt(0));
					if(uIn.equals("y") || uIn.equals("n")) break;
					System.out.println("It was a yes or no question.");
				}
				if(uIn.equals("y")){//operator for whether the player hits or stands
					System.out.println("Player " + (i+1) + " hits.");
					playerHands[i].addCard(deck.draw());
					try {Thread.sleep(1000);} catch (InterruptedException e){}
					System.out.println("Player " + (i+1) + " draws " + playerHands[i].bleed(playerHands[i].getSize()-1));
					try {Thread.sleep(1000);} catch (InterruptedException e){}
					System.out.print("Player " + (i+1) + "'s hand is: \n" + playerHands[i].toString());
				}
				else{
					System.out.println("Player " + (i+1) + " stands.");
					break;
				}
				try {Thread.sleep(2000);} catch (InterruptedException e){}
				if(playerHands[i].getValue()>21){//checks if the player loses
					System.out.println("Player " + (i+1) + " busts.");
					break;
				}
			}
		}
	}
	
	public void dealerHit(){
		System.out.println();
		while(dealerHand.getValue()<17){
			try {Thread.sleep(1000);} catch (InterruptedException e){}
			System.out.println("I hit.");
			dealerHand.addCard(deck.draw());
		}
		try {Thread.sleep(1000);} catch (InterruptedException e){}
		System.out.println("I stand.");
	}
	
	public boolean hasBlackJack(){
		if(dealerHand.getValue() == 21) return true;
		return false;
	}
	
	public void getWinners(){
		try {Thread.sleep(1000);} catch (InterruptedException e){}
		if(dealerHand.getValue()>21) System.out.println("\nHouse busts. Everybody wins.");
		else{
			if(hasBlackJack()) System.out.println("House gets blackjack.");
			System.out.println("\nI have:\n" + dealerHand.toString());
			for(int i=0; i<playerHands.length; i++){
				if(dealerHand.getValue()>playerHands[i].getValue()||playerHands[i].getValue()>21) System.out.println("Player " + (i+1) + " loses.");
				else if(dealerHand.getValue()<playerHands[i].getValue()&&playerHands[i].getValue()<=21) System.out.println("Player " + (i+1) + " wins.");
				else System.out.println("Player " + (i+1) + " pushes.");
			}
		}
	}
	
	public boolean anotherRound(){
		String uIn;
		while(true){
			System.out.println("\nAnother round?");
			uIn = scan.next();
			uIn = Character.toString(uIn.toLowerCase().charAt(0));
			if(uIn.equals("y") || uIn.equals("n")) break;
			System.out.println("It was a yes or no question.");
		}
		if(uIn.equals("y")) return true;
		this.scan.close();
		return false;
		
	}
}
