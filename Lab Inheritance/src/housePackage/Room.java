package housePackage;

public class Room {
	private int size;
	private String color;
	private String floorType;
	private int windows;
	private int doors;
	
	public Room(int eSize, String eColor, String eFloorType, int eWindows, int eDoors){
		size = eSize;
		color = eColor;
		floorType = eFloorType;
		windows = eWindows;
		doors = eDoors;
	}
}
