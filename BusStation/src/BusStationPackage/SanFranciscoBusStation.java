package BusStationPackage;

public class SanFranciscoBusStation {

	public static void main(String[] args) {

		BusStation sfBusStation = new BusStation();
		
		sfBusStation.setAddress("145 High Street, San Francisco");
		sfBusStation.setBus(1, 123, "Los Angeles", "9:00 AM");
		sfBusStation.setBus(2, 456, "San Diego", "11:00 AM");
		
		System.out.println("Busses leave from the " + sfBusStation.getAddress() +" bus station are as follows: ");
		System.out.println("Bus 1:\n" + sfBusStation.getBus(1));
		System.out.println("Bus 2:\n" + sfBusStation.getBus(2));
	}

}
