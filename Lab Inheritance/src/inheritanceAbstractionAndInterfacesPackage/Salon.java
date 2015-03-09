package inheritanceAbstractionAndInterfacesPackage;

public class Salon extends Store{
	private int numSeats;
	private String salonType;
	
	public Salon(int sqFootage, int numDoors, int numWindows, int numSeats, String salonType){
		super(sqFootage, numDoors, numWindows);
		
		this.numSeats = numSeats;
		this.salonType = salonType;
	}

	
	public int getNumSeats() {
		return numSeats;
	}

	public String getSalonType() {
		return salonType;
	}
}
