package connectFourPackage;

public class Driver {

	public static void main(String[] args) {
		Board gameBoard = new Board(6,7);
		
		gameBoard.dropPiece(1, 3);
		gameBoard.dropPiece(-1, 3);
		
		gameBoard.printBoard();
	}

}
