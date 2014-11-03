/**************************************
 * Title: Lab5GradeAssigner
 * @author Nathan Baum (nbaum510@gmail.com)
 * Date: 9/24/2014
 * Precond: user must have name and number
 * Postcond: will print user's name and the square of their number
 **************************************/
import java.util.Scanner;
public class Lab5GradeAssigner {

	public static void main(String[] args) {
		char grade = 'A';
		double percent;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your grade as a percent without the \"%\" symbol:");
		percent = scan.nextDouble();

		for(int i=100; i>60; i=i-10){
			if(percent<i-10){
				grade = (char)(grade+1);
			}
			else break;
		}
		if(percent<60) grade = 'F';
		
		System.out.println("Your grade is " + grade);
		
		scan.close();

	}

}
