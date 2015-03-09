package inheritanceAbstractionAndInterfacesPackage;

public class ElectronicsStore extends Store {
	public boolean sellsAppleProducts;
	public boolean sellsPhones;
	
	public ElectronicsStore(int sqFootage, int numDoors, int numWindows, boolean sellsAppleProducts, boolean sellsPhones){
		super(sqFootage, numDoors, numWindows);
		
		this.sellsAppleProducts = sellsAppleProducts;
		this.sellsPhones = sellsPhones;
	}

	
	public boolean isSellsAppleProducts() {
		return sellsAppleProducts;
	}

	public boolean isSellsPhones() {
		return sellsPhones;
	}
}
