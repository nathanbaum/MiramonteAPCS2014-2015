/***************************************************************
 * @title String Numbers
 * @author Nathan Baum (nbaum510@gmail.com)
 * @date 10/24/2014
 * 
 * Precondition: User inputs string with numbers separated by a space.
 * Postcondition: Prints the numbers in ascending order by value.
 **************************************************************/
package lab7Package;
import java.util.Scanner;

public class stringNums {

	public static void main(String[] args) {
		String uIn;
		int[] numArray;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string of ints with the format:\n\"1 2 3 4\"");
		uIn = scan.nextLine();
		
		numArray = stringToArray(uIn);
		/*for(int i=0; i<numArray.length; i++){
			System.out.print(numArray[i] + " ");
		}*/
		numArray = sortAscend(numArray);
		
		System.out.println("Your numbers sorted in ascending order:");
		for(int i=0; i<numArray.length; i++){
			System.out.print(numArray[i] + " ");
		}
		
		scan.close();
	}
	
	private static int[] stringToArray(String str){
		int spaces=0, tenMod=0, num=0, index=0;
		int[] nums;
		/*
		 * spaces counts how many numbers there are, tenMod allows me to turn them
		 * into ints, num holds the temporary value of the number being read, and
		 * index keeps track of what spot in the array the number goes into
		 */
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ') spaces++;
		}
		nums = new int[spaces+1];
		
		for(int i=str.length()-1; i>=0; i--){//add one to spaces because there is no space after last number
			if(str.charAt(i)>=48 && str.charAt(i)<=57){//if the char is a number
				//System.out.println(str.charAt(i)-48);
				num = num + (str.charAt(i)-48)*(int)Math.pow(10,tenMod);
				/*
				 * the number is the number plus the currently scanned number 
				 * times 10 to the power of whatever
				 */
				tenMod++;
			}
			if(str.charAt(i) == ' '){//checks if the number is over
				nums[index] = num;//sets number to it's place in the array
				num=0;//readies num for a new number
				tenMod=0;//readies tenMod for a new number
				index++;//moves to the next spot in the array
			}
		}
		nums[index] = num;
		
		return nums;
	}

	private static int[] sortAscend(int[] nums){
		int temp;
		
		for(int x=1; x<nums.length; x++){
			for(int i=1; i<nums.length; i++){
				if(nums[i]<nums[i-1]){
					temp = nums[i-1];
					nums[i-1] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}
}


/*
in 57 3 72 24 9 55

3 57 72 24 9 55
3 57 72 24 9 55
3 57 24 72 9 55
3 57 24 9 72 55
3 57 24 9 55 72

3 57 24 9 55 72
3 24 57 9 55 72
3 24 9 57 55 72
3 24 9 55 57 72
3 24 9 55 57 72

3 24 9 55 57 72
3 9 24 55 57 72
3 9 24 55 57 72
3 9 24 55 57 72


in 6 5 4 3 2 1
5 6 4 3 2 1
5 4 6 3 2 1
5 4 3 6 2 1
5 4 3 2 6 1
5 4 3 2 1 6

4 5 3 2 1 6
4 3 5 2 1 6
4 3 2 5 1 6
4 3 2 1 5 6
4 3 2 1 5 6

3 4 2 1 5 6
3 2 4 1 5 6
3 2 1 4 5 6
3 2 1 4 5 6
3 2 1 4 5 6

2 3 1 4 5 6
2 1 3 4 5 6
2 1 3 4 5 6
2 1 3 4 5 6
2 1 3 4 5 6

1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6


in 20 56 4
20 56 4
20 4 56

4 20 56
4 20 56

in 3 2 1
2 3 1
2 1 3

1 2 3
1 2 3
*/