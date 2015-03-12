package inheritanceAbstractionAndInterfacesPackage;
import java.text.NumberFormat;
import java.util.ArrayList;

public class PaloAltoDriver {
	public static void main (String args []){
		NumberFormat nf = NumberFormat.getInstance();
		
		
		DoctorsOffice[] doctorsOfficeTypes = new DoctorsOffice[3];
		doctorsOfficeTypes[0] = new Optician();
		doctorsOfficeTypes[1] = new Chiropractor();
		doctorsOfficeTypes[2] = new Dentist();
		
		
		DoctorsOffice chiro1 = new Chiropractor(123, 79.43, 12, 80300);
		DoctorsOffice chiro2 = new Chiropractor(106, 129.90, 8, 120000);
		DoctorsOffice chiro3 = new Chiropractor(12, 95.40, 10, 87500);
		DoctorsOffice opt1 = new Optician(212, 157.69, 12, 2000.50);
		DoctorsOffice opt2 = new Optician(12.64, 79.43, 12, 11200);
		DoctorsOffice opt3 = new Optician(246.97, 385.02, 84, 9999.99);
		DoctorsOffice dent1 = new Dentist(56, 212.45);
		DoctorsOffice dent2 = new Dentist(1089, 197.98);
		DoctorsOffice dent3 = new Dentist(600, 200.34);
			
		DoctorsOffice [] office = {chiro1, opt1, dent1, chiro2, opt2, dent2, chiro3, opt3, dent3};
		
		System.out.println("OFFICES IN PALO ALTO");
		double totalBilled, totalCost, grandTotalBilled = 0, grandTotalCost = 0;
		for(DoctorsOffice type:doctorsOfficeTypes){
			totalBilled = 0;
			totalCost = 0;
			System.out.println("_______________________________________________________________________________________________");
			System.out.println(type.getClass().getSimpleName() + " Offices\tAmount Billed to Insurance\tCost of Services");
			int counter = 1;
			for(DoctorsOffice drOff:office){
				if(drOff.getClass() == type.getClass()){
					System.out.println("\t" + counter + "\t\t$" + nf.format(drOff.totalAmountBilledToInsurance()) + "\t\t\t$" + nf.format(drOff.costOfServices()));
					totalBilled += drOff.totalAmountBilledToInsurance();
					totalCost += drOff.costOfServices();
					counter++;
				}
			}
			System.out.println("\tTotals\t\tAmount Billed to Insurance\tCost of Services");
			System.out.println("\t\t\t" + nf.format(totalBilled) + "\t\t\t$" + nf.format(totalCost));
			grandTotalBilled += totalBilled;
			grandTotalCost += totalCost;
			System.out.println("_______________________________________________________________________________________________");
		}
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("Total Office Billings to Insurance:\t" + nf.format(grandTotalBilled));
		System.out.println("Total Office Cost of Services:\t" + nf.format(grandTotalCost));
		System.out.println("_______________________________________________________________________________________________");
		
		

		Store rest1 = new Restaurant(2000, 4, 12, 90, "Southern Comfort", true);
		Store rest2 = new Restaurant(1960, 3, 10, 62, "Califonia Fusion", false);
		Store rest3 = new Restaurant(4500, 6, 16, 200, "Southern Comfort", false);
		Store salon1 = new Salon(1230, 3, 4, 8,"Full Beauty Spa");
		Store salon2 = new Salon(650, 2, 2, 2,"Barbershop");
		Store salon3 = new Salon(2200, 4, 10, 10,"Full Beauty Spa");
		Store ec1 = new ElectronicsStore(10200, 10, 28, true, true);
		Store ec2 = new ElectronicsStore(450, 2, 2, false, true);
		Store ec3 = new ElectronicsStore(6000, 4, 10, true, false);
		
		Store [] stores = {rest1, salon1, ec1, rest2, salon2, ec2, rest3, salon3, ec3};
		
		int grandTotalSqFoot = 0;
		System.out.println("\n\nSTORES");
		
		
		//for restaurants
		int totalSqFoot = 0, counter = 0, totalNumTables = 0;
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("Restaurant\tNumber of Tables\tSquare Footage\tCuisine\t\t\tDelivers");
		for(Store rest:stores){
			if(rest.getClass().getSimpleName().equals("Restaurant")){
				counter++;
				System.out.println(counter + "\t\t" + ((Restaurant) rest).getNumTables() + "\t\t\t" + rest.getSqFootage() + "\t\t" + ((Restaurant) rest).getCuisineType() + "\t" + ((Restaurant) rest).isDelivers());
				totalSqFoot += rest.getSqFootage();
				grandTotalSqFoot += rest.getSqFootage();
				totalNumTables += ((Restaurant) rest).getNumTables();
			}
		}
		System.out.println("Totals\t\tTables\t\t\tSquare Footage\tMost Popular Cuisine");
		System.out.println("\t\t" + totalNumTables + "\t\t\t" + totalSqFoot + "\t\t" + findPopularCuisine(stores));
		System.out.println("_______________________________________________________________________________________________");
		
		
		//for salons
		totalSqFoot = 0;
		counter = 0;
		int totalNumSeats = 0;
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("Salon\t\tNumber of Seats\t\tSquare Footage\tSalon Type");
		for(Store sal:stores){
			if(sal.getClass().getSimpleName().equals("Salon")){
				counter++;
				System.out.println(counter + "\t\t" + ((Salon) sal).getNumSeats() + "\t\t\t" + sal.getSqFootage() + "\t\t" + ((Salon) sal).getSalonType());
				totalSqFoot += sal.getSqFootage();
				grandTotalSqFoot += sal.getSqFootage();
				totalNumSeats += ((Salon) sal).getNumSeats();
			}
		}
		System.out.println("Totals\t\tSeats\t\t\tSquare Footage\tMost Popular Salon Type");
		System.out.println("\t\t" + totalNumSeats + "\t\t\t" + totalSqFoot + "\t\t" + findPopularSalonType(stores));
		System.out.println("_______________________________________________________________________________________________");
		
		
		//for elecronicsStores
		totalSqFoot = 0;
		counter = 0;
		int totalSellingPhones = 0, totalSellingAppleProducts = 0;
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("Electronics Store\tSells Phones\t\tSquare Footage\tSells Apple Products");
		for(Store es:stores){
			if(es.getClass().getSimpleName().equals("ElectronicsStore")){
				counter++;
				System.out.println(counter + "\t\t\t" + ((ElectronicsStore) es).sellsPhones() + "\t\t\t" + es.getSqFootage() + "\t\t" + ((ElectronicsStore) es).sellsAppleProducts());
				totalSqFoot += es.getSqFootage();
				grandTotalSqFoot += es.getSqFootage();
				if(((ElectronicsStore) es).sellsPhones()) totalSellingPhones++;
				if(((ElectronicsStore) es).sellsAppleProducts()) totalSellingAppleProducts++;
			}
		}
		System.out.println("Totals\t\t\tSelling Phones\t\tSquare Footage\tSelling Apple Products");
		System.out.println("\t\t\t" + totalSellingPhones + "\t\t\t" + totalSqFoot + "\t\t" + totalSellingAppleProducts);
		System.out.println("_______________________________________________________________________________________________");
		
		
		//grand totals
		System.out.println("_______________________________________________________________________________________________");
		System.out.println("Total Store Square Footage:\t" + grandTotalSqFoot);
		System.out.println("_______________________________________________________________________________________________");
	}
	
	public static String findPopularCuisine(Store[] stores){
		/*creates 2d arraylist of Strings that will hold all of the cuisine types: the arraylist holds arraylists that hold
		 * identical strings. At the end, it will loop through the outer arraylist to see which element is the biggest, and
		 * that will be the most popular type*/
		ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
		//instantiates one element of the 2d arraylist so the loops have something to loop through
		items.add(new ArrayList<String>());
		items.get(0).add(null);
		
		//loops through all stores
		for(Store store:stores){
			//if it finds a correct class
			if(store.getClass() == Restaurant.class){
				//loops through outer arraylist
				for(int i=0; i<items.size(); i++){
					//if it finds a String matching one already in the arraylist...
					if(((Restaurant) store).getCuisineType().equals(items.get(i).get(0))){
						//it will simply add the String to the list of its clones
						items.get(i).add(((Restaurant) store).getCuisineType());
						//and it will move on to the next store
						break;
					}
					//if it finds no matches by the end...
					else if(i>=items.size()-1){
						//it will add a new arraylist of those Strings to the end of the arraylist arraylist (the outer one holding ArrayList<String>s)
						items.add(new ArrayList<String>());
						items.get(items.size()-1).add(((Restaurant) store).getCuisineType());
					} 
				}
			}
		}
		
		int maxNumber = 0;
		String maxString = null;
		
		for(ArrayList<String> string:items){
			if(string.size()>maxNumber){
				maxNumber = string.size();
				maxString = string.get(0);
			}
		}
		
		return maxString;
	}
	
	public static String findPopularSalonType(Store[] stores){
		/*creates 2d arraylist of Strings that will hold all of the cuisine types: the arraylist holds arraylists that hold
		 * identical strings. At the end, it will loop through the outer arraylist to see which element is the biggest, and
		 * that will be the most popular type*/
		ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
		//instantiates one element of the 2d arraylist so the loops have something to loop through
		items.add(new ArrayList<String>());
		items.get(0).add(null);
		
		//loops through all stores
		for(Store store:stores){
			//if it finds a correct class
			if(store.getClass() == Salon.class){
				//loops through outer arraylist
				for(int i=0; i<items.size(); i++){
					//if it finds a String matching one already in the arraylist...
					if(((Salon) store).getSalonType().equals(items.get(i).get(0))){
						//it will simply add the String to the list of its clones
						items.get(i).add(((Salon) store).getSalonType());
						//and it will move on to the next store
						break;
					}
					//if it finds no matches by the end...
					else if(i>=items.size()-1){
						//it will add a new arraylist of those Strings to the end of the arraylist arraylist (the outer one holding ArrayList<String>s)
						items.add(new ArrayList<String>());
						items.get(items.size()-1).add(((Salon) store).getSalonType());
					} 
				}
			}
		}
		
		int maxNumber = 0;
		String maxString = null;
		
		for(ArrayList<String> string:items){
			if(string.size()>maxNumber){
				maxNumber = string.size();
				maxString = string.get(0);
			}
		}
		
		return maxString;
	}
}
