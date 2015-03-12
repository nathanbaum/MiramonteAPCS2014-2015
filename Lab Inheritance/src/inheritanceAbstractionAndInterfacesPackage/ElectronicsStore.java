package inheritanceAbstractionAndInterfacesPackage;

public class ElectronicsStore extends Store {
	private boolean sellsAppleProducts;
	private boolean sellsPhones;
	
	public ElectronicsStore(int sqFootage, int numDoors, int numWindows, boolean sellsAppleProducts, boolean sellsPhones){
		super(sqFootage, numDoors, numWindows);
		
		this.sellsAppleProducts = sellsAppleProducts;
		this.sellsPhones = sellsPhones;
	}

	
	public boolean sellsAppleProducts() {
		return sellsAppleProducts;
	}

	public boolean sellsPhones() {
		return sellsPhones;
	}
}
