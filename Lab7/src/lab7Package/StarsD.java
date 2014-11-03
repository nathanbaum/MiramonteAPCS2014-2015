/***************************************************************
 * @title StarsD
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/28/2014
 * 
 * Precondition: none
 * Postcondition: prints a bunch of stars
 **************************************************************/
package lab7Package;

public class StarsD {

	public static void main(String[] args) {
		final int MAX_ROWS = 10;
		
		for(int row=MAX_ROWS-1; row>=1; row-=2){
			for(int space=0; space<row/2; space++){
				System.out.print(" ");
			}
			for(int star=0; star<MAX_ROWS-row; star++){
				System.out.print("*");
			}
			for(int space=0; space<row/2; space++){
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int row=1; row<=MAX_ROWS-1; row+=2){
			for(int space=0; space<row/2; space++){
				System.out.print(" ");
			}
			for(int star=0; star<MAX_ROWS-row; star++){
				System.out.print("*");
			}
			for(int space=0; space<row/2; space++){
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}