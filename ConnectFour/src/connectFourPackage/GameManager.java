package connectFourPackage;
import java.util.Scanner;

public class GameManager {
	private Scanner scan;
	private final int HEIGHT = 6, WIDTH = 7;
	private Board board;
	public boolean isWin = false;
	
	public GameManager(Scanner scan){
		this.scan = scan;
		board = new Board(HEIGHT, WIDTH);
		board.printBoard();
	}
	
	public void turn(int player){
		int uIn;
		int winner;
		while(true){
			try{
				System.out.print("Player " + player + ", pick column:");
				uIn = scan.nextInt();
				if(uIn>=0 && uIn<WIDTH) break;
			}
			catch(Exception e){
				scan.next();
			}
			System.out.println("Invalid Input");
		}
		board.dropPiece(player, uIn);
		board.printBoard();
		winner = board.checkWinner();
		//System.out.println(winner);
		if(winner != 0){
			System.out.println("Player " + winner + " wins!");
			isWin = true;
		}
	}
}
