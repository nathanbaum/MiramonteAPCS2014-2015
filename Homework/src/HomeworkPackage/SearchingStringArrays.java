package HomeworkPackage;

public class SearchingStringArrays {

	public static void main(String[] args) {
		//test space

	}
	
	public static int linearSearch(String[] myArray, String itemToFind){
		for(int i=0; i<myArray.length; i++){
			if(myArray[i].equals(itemToFind)) return i;
		}
		return -1;
	}
	
	public static int binarySearch(String[] myArray, String itemToFind){
		int index, top=myArray.length, bottom=0, recursions=0;
		
		while(top!=0){
			top = top/2;/*performs int devision; range is altered because after
							the random number is generated, range is no longer needed*/ 
			recursions++;
		}
		top=myArray.length;
		
		for(int i=0; i<recursions; i++){
			index = bottom + (top-bottom)/2;
			if(myArray[index].compareToIgnoreCase(itemToFind) == 0){
				return index;
			}
			else if(myArray[index].compareToIgnoreCase(itemToFind) < 0) top = index;
			else bottom = index;
		}
		return -1;
	}
}
