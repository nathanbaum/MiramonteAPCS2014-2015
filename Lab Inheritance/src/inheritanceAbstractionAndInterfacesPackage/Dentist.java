package inheritanceAbstractionAndInterfacesPackage;

public class Dentist implements DoctorsOffice{
	private int numPeopleThatNeedFilling, costOfFilling;
	
	public Dentist(int numPeopleThatNeedFilling, int costOfFilling){
		this.numPeopleThatNeedFilling = numPeopleThatNeedFilling;
		this.costOfFilling = costOfFilling;
	}
	
	public int totalAmountBilledToInsurance(){
		return numPeopleThatNeedFilling*costOfFilling;
	}
	
	public int costOfServices(){
		return numPeopleThatNeedFilling*costOfFilling;
	}
}
