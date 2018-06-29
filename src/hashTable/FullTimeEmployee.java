package hashTable;

public class FullTimeEmployee extends EmployeeInfo {
	
	private double yearlySalary;

	public FullTimeEmployee(int employeeNumber) {
		super(employeeNumber);
	}
	public double calcAnnualGrossIncome(){
		return this.yearlySalary;
	}
	public double AnnualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductRate);
	}
}
