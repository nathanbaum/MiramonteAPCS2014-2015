package miscPackage;
import java.util.Scanner;

public class whosAwesome {

	public static void main(String[] args) {
		String uIn;
		Scanner scan = new Scanner(System.in);
		
		uIn = scan.next();
		//System.out.println(uIn.substring(0, 3).toLowerCase());
		
		if(uIn.substring(0, 3).toLowerCase().equals("who")){
			System.out.println("You're awesome.");
		}
		
		scan.close();

	}

}
