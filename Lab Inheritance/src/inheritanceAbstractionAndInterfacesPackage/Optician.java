package inheritanceAbstractionAndInterfacesPackage;

public class Optician implements DoctorsOffice{
	private int costPerFrame, costOfEyeExam, patients, rent;
	
	public Optician(int costPerFrame, int costOfEyeExam, int patients, int rent){
		this.costPerFrame = costPerFrame;
		this.costOfEyeExam = costOfEyeExam;
		this.patients = patients;
		this.rent = rent;
	}


	public int totalAmountBilledToInsurance() {
		return (costPerFrame+costOfEyeExam)*patients;
	}

	public int costOfServices() {
		return rent;
	}
}
