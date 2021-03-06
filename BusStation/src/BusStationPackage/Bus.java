package BusStationPackage;

public class Bus {
	
	private int routeNo;
	private String destination;
	private String departureTime;
	
	//non parameterized constructor
	public Bus(){
		this.routeNo = -1;
		this.destination = "not set";
		this.departureTime = "not set";
	}
	
	// parameterized constructor
	public Bus(int routeNo, String destination, String departureTime){
		this.routeNo = routeNo;
		this.destination = destination;
		this.departureTime = departureTime;
	}
	
	//getters and setters for each of the 3 variables.
	public int getRouteNo() {
		return routeNo;
	}
	public String getDestination() {
		return destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}

	public void setRouteNo(int routeNo) {
		this.routeNo = routeNo;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public String info(){
		return "routeNo:\t" + routeNo + "\ndestination:\t" + destination + "\ndeparture time:\t" + departureTime;
	}
}
