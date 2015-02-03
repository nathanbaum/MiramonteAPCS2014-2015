package connectFourPackage;

public class Board {
	private int[][] board;
	
	public Board(int height, int length){
		board = new int[height][length];
		for(int y=0; y<board.length; y++){
			for(int x=0; x<board[y].length; x++){
				board[y][x] = 0;
			}
		}
	}
	
	public int getPoint(int y, int x){
		return board[y][x];
	}
	
	public void printBoard(){
		for(int y=0; y<board.length; y++){
			System.out.print("|");
			for(int x=0; x<board[y].length; x++){
				if(board[y][x] == 1) System.out.print("X|");
				else if(board[y][x] == 0) System.out.print(" |");
				else if(board[y][x] == 2) System.out.print("O|");
				else System.out.print("?|");
			}
			System.out.println();
		}
		System.out.print(" ");
		for(int i=0; i<board[1].length; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void dropPiece(int player, int x){
		for(int y=0; y<board.length; y++){
			if(board[y][x] != 0){
				board[y-1][x] = player;
				break;
			}
			if(y==board.length-1 && board[y][x]==0){
				board[board.length-1][x] = player;
			}
		}
	}
}
