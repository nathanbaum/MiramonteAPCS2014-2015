package dogsPackage;

public class Yorkshire extends Dog{
	private int breedWeight = 15;
	private String color;
	
	public Yorkshire(String name, String color){
		super(name);
		this.color = color;
	}
	
	public String speak(){
		return "yap yap";
	}
	
	public int getBreedWeight(){
		return breedWeight;
	}
	
	public String getColor(){
		return color;
	}
	
	/*public String getClass(){
		return "class Yorkshire.";
	}*/
}
