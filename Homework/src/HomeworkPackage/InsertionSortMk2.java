package HomeworkPackage;
import java.util.Random;

public class InsertionSortMk2 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		int minValue, mindex, swap;
		
		System.out.println("Unsorted Array:");
		for(int i=0; i<array.length; i++){
			array[i] = rand.nextInt(201)-100;
			System.out.print(array[i] + " ");
		}
		System.out.println("\nArray Being Sorted:");
		
		for(int i=0; i<array.length; i++){
			minValue = array[i];
			mindex = i;
			for(int j=i; j<array.length; j++){
				if(array[j]<minValue){
					mindex = j;
					minValue = array[j];
				}
			}
			swap = array[mindex];
			for(int j=mindex; j>i; j--){
				array[j] = array[j-1];
			}
			array[i] = swap;
			
			for(int j=0; j<array.length; j++){
				System.out.print(array[j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Sorted Array:");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}