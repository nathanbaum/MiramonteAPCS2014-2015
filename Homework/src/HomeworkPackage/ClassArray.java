package HomeworkPackage;

public class ClassArray {
	public static void main(String[] args){
		char[] myArray = new char[26];
	
		for(int i=0; i<myArray.length; i++){
			myArray[i] = (char) (i+97);
		}
		
		myArray[15] = 'g';
		
		System.out.println(findIndices(myArray));//It won't work this way
	}
	
	public static int[] findIndices(char[] myArray){
		int index = 0;
		int whatever = 0;
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == 'g'){
				index++;
			}
		}
		int[] newArray = new int[index];
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == 'g'){
				newArray[whatever] = (i);
			}
			whatever++;
		}
		return newArray;
	}
}
