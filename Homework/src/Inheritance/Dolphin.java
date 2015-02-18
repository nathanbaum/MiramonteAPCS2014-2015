package Inheritance;

public class Dolphin extends Mammal{
	 
	private double lengthOfDolphin;
	private double lengthOfFin;
	
	public double getLengthOfDolphin() {
		return lengthOfDolphin;
	}
	
	public void setLengthOfDolphin(double lengthOfDolphin) {
		this.lengthOfDolphin = lengthOfDolphin;
	}
	
	public double getLengthOfFin() {
		return lengthOfFin;
	}
	
	public void setLengthOfFin(double lengthOfFin) {
		this.lengthOfFin = lengthOfFin;
	}
	
	public String yearsLeftDolphin() {
		int yearsLeft = getLifeExpectancy() - currentAge();
		return "This dolphin has " + (yearsLeft*3) + " dolphin years left to live.";
	}
}
