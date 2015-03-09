package inheritanceAbstractionAndInterfacesPackage;

public abstract class Store {
	private int sqFootage, numDoors, numWindows;
	
	public Store(int sqFootage, int numDoors, int numWindows){
		this.sqFootage = sqFootage;
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}

	public int getSqFootage() {
		return sqFootage;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public int getNumWindows() {
		return numWindows;
	}
}
