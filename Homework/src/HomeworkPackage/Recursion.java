package HomeworkPackage;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(2));

	}
	
	public static int factorial(int num){
		if(num!=0){
			return num * factorial(num-1);
		}
		else return 1;
	}
	
	public static int fibonacci(int num){
		
	}
}
