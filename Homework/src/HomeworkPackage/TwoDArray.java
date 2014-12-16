package HomeworkPackage;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] plane = new int[10][10];
		
		int counter = 1;
		for(int row=0; row<plane.length; row++){
			for(int column=0; column<plane[row].length; column++){
				plane[row][column] = counter;
				counter++;
				System.out.print(plane[row][column] + "\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println();
		
		for(int row=0; row<plane.length; row++){
			for(int column=0; column<plane[row].length; column++){
				plane[row][column] = (row)*10+(column+1);
				System.out.print(plane[row][column] + "\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println();
		
		for(int row=0; row<plane.length; row++){
			for(int column=0; column<plane[row].length; column++){
				plane[row][column] = (row+1)*(column+1);
				System.out.print(plane[row][column] + "\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}