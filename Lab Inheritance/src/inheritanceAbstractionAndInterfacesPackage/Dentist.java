package inheritanceAbstractionAndInterfacesPackage;

public class Dentist implements DoctorsOffice{
	private int numPeopleThatNeedFilling;
	private double costOfFilling;
	
	public Dentist(){
		
	}
	
	public Dentist(int numPeopleThatNeedFilling, double costOfFilling){
		this.numPeopleThatNeedFilling = numPeopleThatNeedFilling;
		this.costOfFilling = costOfFilling;
	}
	
	public double totalAmountBilledToInsurance(){
		return numPeopleThatNeedFilling*costOfFilling;
	}
	
	public double costOfServices(){
		return numPeopleThatNeedFilling*costOfFilling;
	}
	
	/*public String toString(){
		return ("$" + totalAmountBilledToInsurance() + "\t\t$" + costOfServices());
	}*/
}
