package bogglePackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Boggle {
	private int count, score;
	private boolean go;
	private Board board;
	private Words wordChecker;
	private ArrayList words;
	
	public Boggle(String[] dictionary){
		this.count = 0;
		this.score = 0;
		this.go = true;
		this.wordChecker = new Words(dictionary);
		this.board = new Board();
		this.words = new ArrayList();
		board.generate();
	}
	
	public void run(Scanner scan){
		String uIn;
		board.print();
		while(go){
			System.out.println("Please enter a word or type \"-1\" to indicate that you are done.");
			uIn = scan.next();
			if(uIn.equals("-1")) go = false;
			else if(board.usesLetters(uIn) && wordChecker.isWord(uIn) && wordChecker.notAlreadyIn(uIn, (String[]) words.toArray())){
				words.add(uIn);
				score++;
				count++;
			}
			else score--;
		}
		System.out.println("Your score is " + this.score + ", with a total of " + count + " correct words.");
	}
}
