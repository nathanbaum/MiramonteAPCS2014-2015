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
	
	public int checkWinner(){
		for(int y=0; y<board.length; y++){//loop for y values
			for(int x=0; x<board[y].length; x++){//loop for x values
				if(board[y][x] > 0){//if it finds a player token
					for(int yOff=-1; yOff<=1; yOff++){//loop for y value offsets in search for adjacent pieces
						for(int xOff=-1; xOff<=1; xOff++){//loop for x value offsets in search for adjacent pieces
							if(yOff+xOff != 0 && inBounds(y,yOff,x,xOff)){//if the point is not the original point found and the point is not out of bounds
								if(board[y][x] == board[y+yOff][x+xOff] && inBounds(y,yOff,x,xOff)){//if the point with offset added is the same as original point (and not out of bounds)
									x += xOff;
									y += yOff;//add the offset to continue in the same direction
									if(board[y][x] == board[y+yOff][x+xOff] && inBounds(y,yOff,x,xOff)){//continue with the 3rd point
										x += xOff;
										y += yOff;
										if(board[y][x] == board[y+yOff][x+xOff] && inBounds(y,yOff,x,xOff)){//continue with the fourth point
											return board[y][x];//return the type of token originally found
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return 0;
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
		int y=0;
		while(y!=board.length-1 && board[y+1][x]==0){
			y++;
		}
		board[y][x] = player;
	}
	
	private boolean inBounds(int y, int yOff, int x, int xOff){
		return ((y+yOff>-1 && y+yOff<board.length) && (x+xOff>-1 && x+xOff<board[y].length));
	}
	
	/*private boolean has4Adjacent(int x, int y, int xOff, int yOff){
		if(board[y][x] == board[y+yOff][x+xOff]){
			x += xOff;
			y += yOff;
			if(board[y][x] == board[y+yOff][x+xOff]){
				x += xOff;
				y += yOff;
				if(board[y][x] == board[y+yOff][x+xOff]){
					return true;
				}
			}
		}
		return false;
	}*/
}
