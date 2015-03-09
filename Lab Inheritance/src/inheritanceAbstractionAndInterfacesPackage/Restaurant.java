package inheritanceAbstractionAndInterfacesPackage;

public class Restaurant extends Store {
	private int numTables;
	private String cuisineType;
	private boolean delivers;
	
	public Restaurant(int sqFootage, int numDoors, int numWindows, int numTables, String cuisineType, boolean delivers){
		super(sqFootage, numDoors, numWindows);
		
		this.numTables = numTables;
		this.cuisineType = cuisineType;
		this.delivers = delivers;
	}
	

	public int getNumTables() {
		return numTables;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public boolean isDelivers() {
		return delivers;
	}
}
