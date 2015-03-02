package dogsPackage;

public class Dog {
	public String name;
	public Dog(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public String speak()
	{
		return "woof";
	}
	
	/*public String getClass(){
		return "class Dog.";
	}*/
}
