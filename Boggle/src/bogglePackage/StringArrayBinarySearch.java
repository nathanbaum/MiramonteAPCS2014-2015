package bogglePackage;

public class StringArrayBinarySearch {
	private String[] array;
	private int recursions;
	
	public StringArrayBinarySearch(String[] array){
		this.array = new String[array.length];
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
	
	public int searchFor(String word){
		int index, top = this.array.length, bottom = 0;
		
		for(int i=0; i<this.recursions; i++){
			index = bottom + (top-bottom)/2;
			if(this.array[index].compareToIgnoreCase(word) == 0){
				return index;
			}
			else if(this.array[index].compareToIgnoreCase(word) < 0) top = index;
			else bottom = index;
		}
		return -1;
	}

}
