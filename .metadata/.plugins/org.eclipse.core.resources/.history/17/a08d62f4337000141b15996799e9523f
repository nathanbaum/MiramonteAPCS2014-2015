package BusStationPackage;

public class BusStation {

	private String Address;
	private Bus bus1;
	private Bus bus2;
	
	//non-parameterized constructor

	
	//getter and setter for Adress
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	//getBus(int busNumber) - if bus number is 1, send the info for bus 1, otherwise send the info for bus 2
	public Bus getBus(int busNum) {
		if(busNum == 1) return bus1.info();
		return bus2.info();
	}
	
	//setBus(int busNumber) - if bus number is 1, set the info for bus 1, otherwise set the info for bus 2
	public void setBus(int busNum, int routeNo, String destination, String departureTime) {
		if(busNum == 1){
			this.bus1.setRouteNo(routeNo);
			this.bus1.setDestination(destination);
			this.bus1.setDepartureTime(departureTime);
		}
		else{
			this.bus2.setRouteNo(routeNo);
			this.bus2.setDestination(destination);
			this.bus2.setDepartureTime(departureTime);
		}
	}
	
}
