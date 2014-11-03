/***************************************************
 * CountFlips.java
 * @author: Lewis/Loftus/Cocking
 * 
 * Demonstrates the use of a programmer-defined class.
 **************************************************/
package miscPackage;

public class CountFlips {
	/************************************
	 * Flips a coin multiple times and counts the number of
	 * heads and tails that result.
	 ***********************************/
	public static void main(String[] args) {
		final int NUM_FLIPS = 1000;
		int heads = 0, tails = 0;
		
		Coin myCoin = new Coin(); //instantiates the coin object
		
		for(int i=0; i<NUM_FLIPS; i++){
			myCoin.flip();
			
			if(myCoin.isHeads()) heads++;
			else tails++;
		}
		
		System.out.println("The number of flips: " + NUM_FLIPS);
		System.out.println("The number of heads: " + heads);
		System.out.println("The number of tails: " + tails);

	}

}
