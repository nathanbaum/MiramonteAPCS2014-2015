package HomeworkPackage;

import java.util.ArrayList;
import java.util.Random;
public class MostPopular {
    public static void main(String[] args) {
        
        int [] aNew = new int [10];
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++)
        {
            aNew[i] = rand.nextInt(10)+ 1;
            System.out.print(aNew[i] + "   ");
        }
        System.out.println ("\nMost popular is: " + getMostPopular(aNew));
        
    }
    
    public static int getMostPopular(int[] nums){
		ArrayList<ArrayList<Integer>> items = new ArrayList<ArrayList<Integer>>();
		//instantiates one element of the 2d arraylist so the loops have something to loop through
		items.add(new ArrayList<Integer>());
		items.get(0).add(0);
		
		//loops through all stores
		for(int num:nums){
			for(int i=0; i<items.size(); i++){
				if(num == (items.get(i).get(0))){
					items.get(i).add(num);
					break;
				}
				//if it finds no matches by the end...
				else if(i>=items.size()-1){
					//it will add a new arraylist of those Strings to the end of the arraylist arraylist (the outer one holding ArrayList<String>s)
					items.add(new ArrayList<Integer>());
					items.get(items.size()-1).add(num);
				} 
			}
		}
		
		int maxNumber = 0, maxNumPop = 0;
		
		for(ArrayList<Integer> num:items){
			if(num.size()>maxNumPop){
				maxNumPop = num.size();
				maxNumber = num.get(0);
			}
		}
		
		return maxNumber;
	}
}