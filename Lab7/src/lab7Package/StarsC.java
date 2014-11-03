/***************************************************************
 * @title StarsC
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/28/2014
 * 
 * Precondition: none
 * Postcondition: prints a bunch of stars
 **************************************************************/
package lab7Package;

public class StarsC {

	public static void main(String[] args) {
		final int MAX_ROWS = 10;
		
		for(int row=MAX_ROWS; row>=1; row--){
			for(int space=0; space<10-row; space++){
				System.out.print(" ");
			}
			for(int star=1; star<=row; star++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}