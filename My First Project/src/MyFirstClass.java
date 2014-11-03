
/***************************************************
 * Name: First Class
 * Author: Nathan Baum (nbaum510@gmail.com)
 * 
 * Does something... I'm not sure what it does yet.
 ***************************************************/
import java.util.Scanner;
public class MyFirstClass {
	public static void main (String[] args)
	{
	int uInput;
	Scanner scan = new Scanner (System.in);

	System.out.println ("Enter a number of seconds:");

	uInput = scan.nextInt();

	int hours = uInput/3600;
	int minutes = (uInput%3600)/60;
	int seconds = uInput%60;

	System.out.println (uInput + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
	
	scan.close();
	}

}
