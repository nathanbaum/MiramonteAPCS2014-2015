package HomeworkPackage;

public class ClassArray {
	public static void main(String[] args){
		int index = 0;
		char[] myArray = new char[26];
	
		for(int i=0; i<myArray.length; i++){
			myArray[i] = (char) (i+97);
		}
		
		myArray[15] = 'g';
		
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == 'g'){
				System.out.println(i);
				index++;
			}
		}
		System.out.println(index);
	}
}