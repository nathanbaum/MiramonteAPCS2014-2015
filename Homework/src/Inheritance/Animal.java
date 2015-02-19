package Inheritance;

public class Animal {
	private int lifeExpectancy;
	private int birthYear;
	private double avgNumOffspring;
	
	public Animal(){
		this.lifeExpectancy = -1;
		this.birthYear = -1;
		this.avgNumOffspring = -1;
	}
	
	public Animal(int lifeExpectancy, int birthYear, double avgNumOffspring){
		this.lifeExpectancy = lifeExpectancy;
		this.birthYear = birthYear;
		this.avgNumOffspring = avgNumOffspring;
	}

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
