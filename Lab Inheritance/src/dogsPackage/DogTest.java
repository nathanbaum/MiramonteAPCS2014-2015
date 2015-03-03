package dogsPackage;

public class DogTest {
	public static void main(String[] args){
		Dog dog = new Dog("Spike");
		Labrador lab = new Labrador("Rover", "brown");
		Yorkshire york = new Yorkshire("Yorkie", "white");
		
		//prints Spike stuff
		System.out.println(dog.getName() + " is a " + dog.getClass());
		System.out.println(dog.getName() + " says " + dog.speak());
		System.out.println();
		
		//prints Rover stuff
		System.out.println(lab.getName() + " is a " + lab.getClass());
		System.out.println(lab.getName() + " says " + lab.speak() + ", is " + lab.getColor() + ", and weighs " + lab.getBreedWeight() + ".");
		System.out.println();
		
		//prints Yorkie stuff
		System.out.println(york.getName() + " is a " + york.getClass());
		System.out.println(york.getName() + " says " + york.speak() + ", is " + york.getColor() + ", and weighs " + york.getBreedWeight() + ".");
		System.out.println();
	}
}
