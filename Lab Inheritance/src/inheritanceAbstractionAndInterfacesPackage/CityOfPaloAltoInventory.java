package inheritanceAbstractionAndInterfacesPackage;

public class CityOfPaloAltoInventory {

	public static void main(String[] args) {
		Store[] stores = new Store[3];
		
		stores[0] = new ElectronicsStore(200, 1, 4, true, false);
		stores[1] = new Restaurant(3000, 2, 5, 30, "Asian Fusion", false);
		stores[2] = new Salon(600, 1, 2, 5, "Old-Timey");
		
		System.out.print(((Restaurant) stores[1]).getCuisineType());
	}

}
