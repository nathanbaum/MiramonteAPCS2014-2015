package BlackJackPack;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private final int CLUBS = 0, DIAMONDS = 1, HEARTS = 2, SPADES = 3;
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){
		for(int i=2; i<11; i++){
			for(int h=0; h<4; h++){
				deck.add(new Card(Integer.toString(i), suitToString(h), i));
			}
		}
		for(int i=0; i<4; i++){
			deck.add(new Card("Ace", suitToString(i), 1));
		}
		for(int i=0; i<4; i++){
			deck.add(new Card("Jack", suitToString(i), 10));
		}
		for(int i=0; i<4; i++){
			deck.add(new Card("Queen", suitToString(i), 10));
		}
		for(int i=0; i<4; i++){
			deck.add(new Card("King", suitToString(i), 10));
		}
	}
	
	public String toString(){
		String str = "";
		
		for(int i=0; i<deck.size(); i++){
			str = str + "\n" + deck.get(i).toString();
		}
		return str;
	}
	
	public Card draw(){
		Random rand = new Random();
		Card card;
		int index = rand.nextInt(deck.size());
		
		card = deck.get(index);
		deck.remove(index);
		return card;
	}
	
	private String suitToString(int h){
		if(h == CLUBS) return "Clubs";
		else if(h == DIAMONDS) return "Diamonds";
		else if(h == HEARTS) return "Hearts";
		else if (h == SPADES) return "Spades";
		else return "null";
	}

}
