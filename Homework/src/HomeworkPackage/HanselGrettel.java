package HomeworkPackage;

public class HanselGrettel {
	public static void main(String[] args){
		/*int[][] darkForrest = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
		}*/
		
		int[][] darkForrest = {
				{0,0,0,0,0,0,0,1,1,0},
				{1,0,0,0,0,1,0,1,1,0},
				{0,0,0,0,0,0,1,0,0,0},
				{0,0,0,0,0,1,0,1,0,0},
				{1,1,1,0,0,1,1,1,0,0},
				{0,1,0,0,0,1,0,1,1,0},
				{0,1,0,0,0,1,0,0,1,0},
				{0,1,0,1,1,1,0,0,0,0},
				{0,0,0,1,1,1,0,0,0,0},
				{0,0,0,1,1,1,0,0,0,0},
		};
		
		System.out.println("Original:");
		print(darkForrest);
		System.out.println("Solved with Diagonals:");
		print(solvePathWithDiagonals(darkForrest, 6, 8));
		System.out.println("Solved without Diagonals:");
		print(solvePathWithoutDiagonals(darkForrest, 6, 8));
	}
	
	public static int[][] solvePathWithDiagonals(int[][] board, int yPos, int xPos){
		board[yPos][xPos] = 0;
		
		for(int yOff=-1; yOff<2; yOff++){
			for(int xOff=-1; xOff<2; xOff++){
				if((yPos+yOff>0 && yPos+yOff<board.length)&&(xPos+xOff>0 && xPos+xOff<board[yPos+yOff].length)&&board[yPos+yOff][xPos+xOff] == 1){
					solvePathWithDiagonals(board, yPos+yOff, xPos+xOff);
				}
			}
		}
		
		return board;
	}
	
	public static int[][] solvePathWithoutDiagonals(int[][] board, int yPos, int xPos){
		board[yPos][xPos] = 0;
		
		for(int yOff=-1; yOff<2; yOff++){
			if((yPos+yOff>0 && yPos+yOff<board.length)&&(xPos>0 && xPos<board[yPos+yOff].length)&&board[xPos+yOff][xPos] == 1){
				solvePathWithoutDiagonals(board, yPos+yOff, xPos);
			}
		}
		for(int xOff=-1; xOff<2; xOff++){
			if((yPos>0 && yPos<board.length)&&(xPos+xOff>0 && xPos+xOff<board[yPos].length)&&board[yPos][xPos+xOff] == 1){
				solvePathWithoutDiagonals(board, yPos, xPos+xOff);
			}
		}
		
		return board;
	}
	
	public static void print(int[][] array){
		for(int y=0; y<array.length; y++){
			for(int x=0; x<array[y].length; x++){
				System.out.print(array[y][x] + " ");
			}
			System.out.println();
		}
	}
}