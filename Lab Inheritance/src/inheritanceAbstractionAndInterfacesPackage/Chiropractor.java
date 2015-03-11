package inheritanceAbstractionAndInterfacesPackage;

public class Chiropractor implements DoctorsOffice {
	private int patientsWithBackProblems, numDoctors;
	private double doctorSalary, costPerCustomer;
	
	public Chiropractor(){
		
	}

	public Chiropractor(int patientsWithBackProblems, double costPerCustomer, int numDoctors, double doctorSalary){
		this.patientsWithBackProblems = patientsWithBackProblems;
		this.costPerCustomer = costPerCustomer;
		this.numDoctors = numDoctors;
		this.doctorSalary = doctorSalary;
	}
	
	public double totalAmountBilledToInsurance() {
		return patientsWithBackProblems*costPerCustomer;
	}

	public double costOfServices() {
		return numDoctors*doctorSalary;
	}
	
	public String toString(){
		return ("$" + totalAmountBilledToInsurance() + "\t\t$" + costOfServices());
	}
}
