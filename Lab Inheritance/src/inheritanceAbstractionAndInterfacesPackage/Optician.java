package inheritanceAbstractionAndInterfacesPackage;

public class Optician implements DoctorsOffice{
	private int patients;
	private double costPerFrame, costOfEyeExam, rent;
	
	public Optician(){
		
	}
	
	public Optician(double costPerFrame, double costOfEyeExam, int patients, double rent){
		this.costPerFrame = costPerFrame;
		this.costOfEyeExam = costOfEyeExam;
		this.patients = patients;
		this.rent = rent;
	}


	public double totalAmountBilledToInsurance() {
		return (costPerFrame+costOfEyeExam)*patients;
	}

	public double costOfServices() {
		return rent;
	}
	
	public String toString(){
		return ("$" + totalAmountBilledToInsurance() + "\t$" + costOfServices());
	}
}
