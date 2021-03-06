package miscPackage;
import java.util.Scanner;

public class BackwardsArray {

	public static void main(String[] args) {
		int[] nums;
		int arrayLength;
		
		Scanner scan = new Scanner(System.in);
		
		arrayLength = scanInt(scan, "Input number of numbers:");
		
		nums = new int[arrayLength];
		for(int i=0; i<nums.length; i++){
			nums[i] = scanInt(scan, ("Input integer " + (i+1) + ":"));
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
		
		for(int i=array.length-1; i>=array.length/2; i--){
			holder = array[(array.length-1)-i];
			array[(array.length-1)-i] = array[i];
			array[i] = holder;
		}
		return array;
	}
	
	public static int scanInt(Scanner scan, String prompt){
		int num;
		while(true){
			try{
				System.out.print("\n" + prompt);
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

