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
		if(busNum == 1) return bus1;
		return bus2;
	}
	
	//setBus(int busNumber) - if bus number is 1, set the info for bus 1, otherwise set the info for bus 2
	public void setBus(int busNum, Bus bus) {
		if(busNum == 1) this.bus1 = bus;
		this.bus2 = bus;
	}
	
}
