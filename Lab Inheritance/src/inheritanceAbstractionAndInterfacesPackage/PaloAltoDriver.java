package inheritanceAbstractionAndInterfacesPackage;
import java.text.NumberFormat;

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
			System.out.println("___________________________________________________________________");
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
		}
		System.out.println("___________________________________________________________________");
		System.out.println("Total Office Billings to Insurance:\t" + nf.format(grandTotalBilled));
		System.out.println("Total Office Cost of Services:\t" + nf.format(grandTotalCost));
		System.out.println("___________________________________________________________________");
		
		

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
		
		int totalSqFoot = 0, counter = 0;
		System.out.println("\n\nSTORES");
		//for restaurants
		System.out.println("___________________________________________________________________");
		System.out.println("Restaurant\tNumber of Tables\tSquare Footage\tCuisine\t\t\tDelivers");
		for(Store rest:stores){
			if(rest.getClass().getSimpleName().equals("Restaurant")){
				counter++;
				System.out.println(counter + "\t\t" + ((Restaurant) rest).getNumTables() + "\t\t\t" + rest.getSqFootage() + "\t\t" + ((Restaurant) rest).getCuisineType() + "\t" + ((Restaurant) rest).isDelivers());
				totalSqFoot += rest.getSqFootage();
			}
		}
		//for salons
		//for elecronicsStores
	}
	
	public static String findPopularCuisine(Store[] stores){
		String popular;
		for(Store store:stores){
			if(store.getClass() == Restaurant.class){
				
			}
		}
	}
}
