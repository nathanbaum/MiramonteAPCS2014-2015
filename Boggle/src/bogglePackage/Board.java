package bogglePackage;
import java.util.Random;
import java.util.ArrayList;

public class Board {
	private final char[] vowels = {'a','e','i','o','u'}, consonants = {'b','c','d','f','g','h','i','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	private char[] letters;
	private Random rand;
	
	public Board(){
		rand = new Random();
		letters = new char[10];
	}
	
	public void generate(){
		for (int i=0; i<4;i++){ 
			letters[i] = vowels[rand.nextInt(5)];
		}
		for (int i=4;i<10; i++){
			letters[i] = consonants[rand.nextInt(21)];
		}
	}
	
	public boolean usesLetters(String word){
		ArrayList tempLetters = new ArrayList();
		for(char i:this.letters){
			tempLetters.add(i);
		}//fills a new arraylist with the letters from letters
		
		ArrayList wordArray = new ArrayList();
		for(int i=0; i<word.length(); i++){
			wordArray.add(word.charAt(i));
		}
		
		while(wordArray.size()>0){
			for(int i=0; i<wordArray.size(); i++){
				if(wordArray.)
			}
		}
	}
	
	public void print(){
		
	}
}
