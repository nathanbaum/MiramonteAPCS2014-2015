package housePackage;

public class Bedroom extends Room{
	private int beds;
	private String closetType;
	private boolean hasAttachedBath;
	
	public Bedroom(int[] eSize, String eColor, String eFloorType, int eWindows, int eDoors, int eBeds, String eClosetType, boolean eHasAttachedBath){
		super(eSize, eColor, eFloorType, eWindows, eDoors);
		beds = eBeds;
		closetType = eClosetType;
		hasAttachedBath = eHasAttachedBath;
	}
}
