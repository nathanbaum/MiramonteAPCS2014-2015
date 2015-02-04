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
							if(!(yOff==0 && xOff==0)){//if the point is not the original point found
								if(inBounds(y,yOff,x,xOff) && board[y][x] == board[y+yOff][x+xOff]){//if the point with offset added is the same as original point (and not out of bounds)
									if(inBounds(y,yOff*2,x,xOff*2) && board[y][x] == board[y+yOff*2][x+xOff*2]){//again with 3rd point
										if(inBounds(y,yOff*3,x,xOff*3) && board[y][x] == board[y+yOff*3][x+xOff*3]){//continue with the 4rth point
											return board[y][x];//return the type of token originally found
										}//WTF INDENTATION!!!
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
