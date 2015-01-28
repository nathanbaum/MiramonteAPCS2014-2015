package HomeworkPackage;
import java.util.Random;

public class TokenPass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int[] board;
	private int currentPlayer;
	private Random rand = new Random();
	
	public TokenPass(int playerCount){
		board = new int[playerCount];
		for(int i=0; i<board.length; i++){
			board[i] = rand.nextInt(11);
		}
	}
	
	public void distributeCurrentPlayerTokens(){
		int tokens = new Integer(board[currentPlayer]);
		
		board[currentPlayer] = 0;
		int tempPlayer = currentPlayer + 1;
		
		for(int i=tokens; i>0; i--){
			if(tempPlayer>=board.length){
				tempPlayer = 0;
			}
			board[tempPlayer]++;
			tempPlayer++;
		}
	}
}
