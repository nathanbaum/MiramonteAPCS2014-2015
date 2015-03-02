package dogsPackage;

public class Labrador extends Dog{
	private String color; //black, yellow, or chocolate?
	private int breedWeight = 75;

	public Labrador(String name, String color){
		super(name);
		this.color=color;
	}

	public String speak(){
		return "arf arf";
	}

	public int getBreedWeight(){
		return breedWeight;
	}
	
	/*public String getClass(){
	  	retrun "class Labrador.";
	  }
	 */
}
