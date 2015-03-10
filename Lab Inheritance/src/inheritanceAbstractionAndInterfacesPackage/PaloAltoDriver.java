package inheritanceAbstractionAndInterfacesPackage;

public class PaloAltoDriver {
	public static void main (String args []){
		
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
	}
}
