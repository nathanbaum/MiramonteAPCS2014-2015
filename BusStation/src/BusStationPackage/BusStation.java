package BusStationPackage;

public class BusStation {

	private String Address;
	private Bus bus1 = new Bus();
	private Bus bus2 = new Bus();
	
	//non-parameterized constructor

	
	//getter and setter for Address
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		this.Address = address;
	}
	
	//getBus(int busNumber) - if bus number is 1, send the info for bus 1, otherwise send the info for bus 2
	public String getBus(int busNum) {
		if(busNum == 1) return bus1.info();
		return bus2.info();
	}
	
	//setBus(int busNumber) - if bus number is 1, set the info for bus 1, otherwise set the info for bus 2
	public void setBus(int busNum, int routeNo, String destination, String departureTime) {
		if(busNum == 1){
			bus1.setRouteNo(routeNo);
			bus1.setDestination(destination);
			bus1.setDepartureTime(departureTime);
		}
		else{
			bus2.setRouteNo(routeNo);
			bus2.setDestination(destination);
			bus2.setDepartureTime(departureTime);
		}
	}
	
}
