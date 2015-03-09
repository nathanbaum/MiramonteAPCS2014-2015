package inheritanceAbstractionAndInterfacesPackage;

public class Chiropractor implements DoctorsOffice {
	private int patientsWithBackProblems, costPerCustomer, numDoctors, doctorSalary;

	public Chiropractor(int patientsWithBackProblems, int costPerCustomer, int numDoctors, int doctorSalary){
		this.patientsWithBackProblems = patientsWithBackProblems;
		this.costPerCustomer = costPerCustomer;
		this.numDoctors = numDoctors;
		this.doctorSalary = doctorSalary;
	}
	
	public int totalAmountBilledToInsurance() {
		return patientsWithBackProblems*costPerCustomer;
	}

	public int costOfServices() {
		return numDoctors*doctorSalary;
	}
	
}
