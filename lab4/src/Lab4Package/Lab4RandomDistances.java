/**************************************
 * Title: Lab4RandomDistances
 * Author: Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user must have a range
 * Postcond: will print two random points, the distance, and slope between them
 **************************************/
package Lab4Package;
import java.util.*;

public class Lab4RandomDistances {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int lowerLimit;
		int upperLimit;
		
		int x1;
		int x2;
		
		int y1;
		int y2;
		
		double distance;
		double slope;
		
		
		System.out.println("Input Lower Limit:");
		lowerLimit = scan.nextInt();
		
		System.out.println("Input Upper Limit:");
		upperLimit = scan.nextInt();
		
		x1 = rand.nextInt((upperLimit-lowerLimit)+1)+lowerLimit;
		x2 = rand.nextInt((upperLimit-lowerLimit)+1)+lowerLimit;
		
		y1 = rand.nextInt((upperLimit-lowerLimit)+1)+lowerLimit;
		y2 = rand.nextInt((upperLimit-lowerLimit)+1)+lowerLimit;

		
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		slope = ((double)y2-y1)/(x2-x1);
		
		
		System.out.println("Coordinates: (" + x1 + "," + y1 + ") and " + "(" + x2 + "," + y2 + ")");
		System.out.println("Distance: " + distance);
		System.out.println("Slope: " + slope + "\n(infinity means undefined)");
		
		
		scan.close();
	}

}
