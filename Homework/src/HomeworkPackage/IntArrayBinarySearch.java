package HomeworkPackage;

public class IntArrayBinarySearch {

	public static void main(String[] args) {
		int[] myArray = {1, 3, 5, 9, 12, 15, 18, 24};
		
		IntArrayBinarySearch mySearch = new IntArrayBinarySearch(myArray);
		
		System.out.println(mySearch.searchFor(9));
		System.out.println(mySearch.searchFor(-3));
		System.out.println(mySearch.searchFor(12));
		System.out.println(mySearch.searchFor(24));
		System.out.println(mySearch.searchFor(52));

	}
	
	private int[] array;
	private int recursions;
	
	public IntArrayBinarySearch(int[] array){
		this.array = new int[array.length];
		for(int i=0; i<array.length; i++){
			this.array[i] = array[i];
		}
		
		int range = array.length;
		while(range!=0){
			range = range/2;/*performs int devision; range is altered because after
							the random number is generated, range is no longer needed*/ 
			recursions++;
		}
	}
	
	public int searchFor(int number){
		int index, top = this.array.length, bottom = 0;
		
		for(int i=0; i<this.recursions; i++){
			index = bottom + (top-bottom)/2;
			if(this.array[index] == number){
				return index;
			}
			else if(this.array[index] > number) top = index;
			else bottom = index;
		}
		return -1;
	}

}
