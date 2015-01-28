package HomeworkPackage;
import java.util.Random;

public class TokenPass {
	public static void main(String[] args) {
		TokenPass game = new TokenPass(4);
		
		game.distributeCurrentPlayerTokens();
	}
	
	private int[] board;
	private int currentPlayer;
	private Random rand = new Random();
	
	public TokenPass(int playerCount){
		board = new int[playerCount];
		currentPlayer = rand.nextInt(playerCount-1);
		for(int i=0; i<board.length; i++){
			board[i] = rand.nextInt(11);
		}
		printBoard();
	}
	
	public void distributeCurrentPlayerTokens(){
		int tokens = new Integer(board[currentPlayer]);
		
		board[currentPlayer] = 0;
		int tempPlayer = currentPlayer + 1;
		printBoard();
		System.out.println("Tokens: " + tokens);
		
		while(tokens>0){
			if(tempPlayer>=board.length){
				tempPlayer = 0;
			}
			board[tempPlayer]++;
			tempPlayer++;
			tokens--;
			printBoard();
			System.out.println("Tokens: " + tokens);
		}
	}
	
	public void printBoard(){
		System.out.print("Board: ");
		for(int i=0; i<board.length-1; i++) System.out.print(board[i] + ", ");
		System.out.println(board[board.length-1]);
	}
}
