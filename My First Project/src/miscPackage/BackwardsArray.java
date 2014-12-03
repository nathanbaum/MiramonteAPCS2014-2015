package miscPackage;
import java.util.Scanner;

public class BackwardsArray {

	public static void main(String[] args) {
		int[] nums;
		int arrayLength;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Length of array of numbers:");
		arrayLength = scanInt(scan);
		
		nums = new int[arrayLength];
		for(int i=0; i<nums.length; i++){
			System.out.print("Integer " + (i+1) + ":");
			nums[i] = scanInt(scan);
		}
		
		nums = reverseArray(nums);
		
		System.out.print("\nYour numbers backwards: ");
		
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]);
		}
		
		scan.close();
	}
	
	public static int[] reverseArray(int[] array){
		int holder;
	}
	
	public static int scanInt(Scanner scan){
		int num;
		while(true){
			try{
				num = scan.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("\nerror: Invalid Input");
				scan.next();
			}
		}
		return num;
	}
}
