package HomeworkPackage;

public class ClassArray {
	public static void main(String[] args){
		char[] myArray = new char[26];
	
		for(int i=0; i<myArray.length; i++){
			myArray[i] = (char) (i+97);
		}
		
		myArray[15] = 'g';
		myArray[18] = 'g';
		
		System.out.println("There are " + findIndices(myArray).length + " g's in the array. They are at indices:");
		for(int i=0; i<findIndices(myArray).length; i++){
			System.out.println(findIndices(myArray)[i]);
		}
	}
	
	public static int[] findIndices(char[] myArray){
		int index = 0;
		int newArrayIndex = 0;
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == 'g'){
				index++;
			}
		}
		int[] newArray = new int[index];
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == 'g'){
				newArray[newArrayIndex] = (i);
				newArrayIndex++;
			}
		}
		return newArray;
	}
}
