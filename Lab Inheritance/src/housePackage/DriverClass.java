package housePackage;

public class DriverClass {

	public static void main(String[] args) {
		Room roomsInHouse[] = new Room[30];
        
        Bedroom myBedroom = new Bedroom(20, "blue", "carpet", 3, 2, 1, "walk-in", true);
        /*Bathroom myBathroom = new Bathroom(50, "taupe", "marble", 2, 1, 2, true);
         
        System.out.println(myBedroom.getClass().toString());
        System.out.println(Bedroom.class.toString());
         
        roomsInHouse[0] = myBedroom;
        roomsInHouse[1] = myBathroom;
         
        for(int i=0; i<2; i++)
        {
            if(roomsInHouse[i].getClass() == Bedroom.class)
            {
                Bedroom theBedroom = (Bedroom)roomsInHouse[i];
                System.out.println("closet size in myBedroom2 object: " + theBedroom.getClosetSize());
            }
            else if(roomsInHouse[i].getClass() == Bathroom.class)
            {
                Bathroom theBathroom = (Bathroom)roomsInHouse[i];
                System.out.println("Closet size in myBedroom2 object: " + theBathroom.getNumSinks());
            }
        }*/

	}

}
