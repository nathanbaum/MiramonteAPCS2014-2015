package Inheritance;

public class Mammal extends Animal{
	
	private double milkFatContent;
	private String hairColor;
	
	public Mammal(){
		super();
		milkFatContent = -1;
		hairColor = null;
	}
	
	public Mammal(int lifeExpectancy, int birthYear, double avgNumOffspring, double milkFatContent){
		super(lifeExpectancy, birthYear, avgNumOffspring);
		this.milkFatContent = milkFatContent;
	}
}
