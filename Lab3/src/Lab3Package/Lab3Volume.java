package Lab3Package;

public class Lab3Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String side1Inches = "5";
		String side2Inches = "10";
		String side3Inches = "15";
		
		System.out.println("side1Inches = " + side1Inches);
		System.out.println("side2Inches = " + side2Inches);
		System.out.println("side3Inches = " + side3Inches + "\n");
		
		
		//converting to double because the values convert to less than 1 foot(decimals)
		double side1Feet = (Double.parseDouble(side1Inches))/12;
		double side2Feet = (Double.parseDouble(side2Inches))/12;
		double side3Feet = (Double.parseDouble(side3Inches))/12;
		
		System.out.println("side1Feet = " + side1Feet);
		System.out.println("side2Feet = " + side2Feet);
		System.out.println("side3Feet = " + side3Feet + "\n");
		
		
		//volume is a double because when multiplying decimals together, you get more decimals
		double volume = side1Feet*side2Feet*side3Feet;
		
		System.out.println("room volume = " + volume + "feet^3");

	}

}
