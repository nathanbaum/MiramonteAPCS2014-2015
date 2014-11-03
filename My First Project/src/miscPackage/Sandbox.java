package miscPackage;
import java.util.Scanner;
public class Sandbox {

	public static void main(String[] args) {
		int uIn;

		Scanner scan = new Scanner(System.in);

		for(int i=0; i<3; i++){
			System.out.print("uIn:");
			uIn = scan.nextInt();
			System.out.println(uIn + ": dividesSelf? " + dividesSelf(uIn));
		}
		scan.close();

	}
	
	private static boolean dividesSelf(int n) {
		  int digit;
		  String number = Integer.toString(n);
		  
		  for(int i=0; i<number.length(); i++){
		    digit = Character.getNumericValue(number.charAt(i));
		    try{if(n%digit != 0) return false;}
		    catch(Exception e){ return false;}
		  }
		    
		  return true;
		  }
	
		}


