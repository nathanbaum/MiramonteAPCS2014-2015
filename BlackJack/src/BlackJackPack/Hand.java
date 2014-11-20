package BlackJackPack;
import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public int getValue() {
		int value = 0, aces = 0;
		
		for(int i=0; i<hand.size(); i++){
			if(hand.get(i).getName() != "Ace"){
				value = value + hand.get(i).getValue();
			}
			else aces++;
		}
		for(int i=0; i<aces; i++){
			if(value+11 > 21) value = value+1;
			else value = value+11;
		}
		return value;
	}
	
	public String toString(){
		String str = "";
		
		for(int i=0; i<hand.size(); i++){
			str = str + hand.get(i).toString() + "\n";
		}
		return str;
	}
	
	public String bleed(){
		return hand.get(0).toString();
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
}
