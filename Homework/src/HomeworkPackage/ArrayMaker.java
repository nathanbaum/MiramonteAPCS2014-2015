package HomeworkPackage;

import java.util.Arrays;

public class ArrayMaker {

	public static void main(String[] args) {
		int[] myArray;
		
		myArray = new int[50];
		
		for(int i=0; i<myArray.length; i++) myArray[i] = (i+1)*100;
		
		System.out.print(Arrays.toString(myArray));
	}

}
