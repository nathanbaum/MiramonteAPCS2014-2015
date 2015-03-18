package HomeworkPackage;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(mult(0, 7));
		System.out.println(fibonacci(6));
		System.out.println(strCopies("catcowcat", "cat", 2));

	}
	
	public static boolean groupSum6(int start, int[] nums, int target){
		if(nums.length>0){
			if(nums[start]==6 && target>6){
				return true && groupSum6(start+1, nums, target-6);
			}
			else{
				if(target>nums[start]){
					return true && groupSum6(start+1, nums, target-nums[start]);
				}
				else if(target==nums[start]){
					return true;
				}
				else return false;
			}
		}
		else if(target==0){
			return true;
		}
		else return false;
	}
	
	public static boolean strCopies(String str, String sub, int n) {
		//System.out.println("str: " + str + "  sub: " + sub + "  n: " + n);
		for(int i=0; i<str.length()-(sub.length()-1); i++){
		  //System.out.print(" i:" + i);
		  if(str.length()>=sub.length() && str.substring(i, i+sub.length()).equals(sub)){
		    if(n>1){
		      return true && strCopies(str.substring(i+1), sub, n-1);
		    }
		    else if(n==1) return true;
		  }
		}
		if(n>0) return false;
		else return true;
	}
	
	public static int mult(int factor1, int factor2){
        if(factor2>0){
        	return factor1 + mult(factor1, factor2-1);
        }
        else if(factor2<0){
        	return -factor1 + mult(factor1, factor2+1);
        }
        else return 0;
    }
	
	public static int factorial(int num){
		if(num!=0){
			return num * factorial(num-1);
		}
		else return 1;
	}
	
	/*public static int fibonacci(int num){
		int[] nums = {0, 1, 1};
		int swap;
		if(num>3){
			for(int i=0; i<num-3; i++){
				swap = nums[2];
				nums[2] = nums[0]+nums[1];
				nums[0] = nums[1];
				nums[1] = swap;
			}
			return nums[2];
		}
		else{
			return nums[num-1];
		}
	}*/
	
	public static int fibonacci(int num){
		if(num == 0) return 0;
		else if(num == 1) return 1;
		else return fibonacci(num-1) + fibonacci(num-2);
	}
}
