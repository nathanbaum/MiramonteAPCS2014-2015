package HomeworkPackage;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(mult(0, 7));
		System.out.println(fibonacci(6));

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
