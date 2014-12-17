package bogglePackage;
import java.util.Scanner;

public class Boggle {
	private int count, score;
	private boolean go;
	private Board board;
	private Words words;
	private Scanner scan;
	
	public Boggle(String[] dictionary){
		this.count = 0;
		this.score = 0;
		this.scan = new Scanner(System.in);
		this.words = new Words(dictionary);
		this.board = new Board();
		board.generate();
	}
	
	public void run(){
		String uIn;
		board.print();
		while(go){
			System.out.println("Please enter a word or type \"-1\" to indicate that you are done.");
			uIn = scan.next();
			if(uIn.equals("-1")) go = false;
			else if(board.usesLetters(uIn) && words.isWord(uIn)){
				score++;
				count++;
			}
			else score--;
		}
		System.out.println("Your score is " + this.score + ", with a total of " + count + " correct words.");
	}
}
