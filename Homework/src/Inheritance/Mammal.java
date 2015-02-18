package Inheritance;

public class Mammal {
	private int lifeExpectancy;
	private int birthYear;
	private double avgNumOffspring;

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	// public void setLifeExpectancy(int myLifeExpectancy) {
	//lifeExpectancy = myLifeExpectancy;
///}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getAvgNumOffspring() {
		return avgNumOffspring;
	}

	public void setAvgNumOffspring(double avgNumOffspring) {
		this.avgNumOffspring = avgNumOffspring;
	}









	public int currentAge() {
		return currentYear() - birthYear;
		
	}
	
	public int yearsLeft() {
		return lifeExpectancy - currentAge();
	}
	
	public int currentYear() {
		return 2015;
	}
}
