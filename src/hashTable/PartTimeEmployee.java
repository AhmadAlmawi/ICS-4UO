package hashTable;

public class PartTimeEmployee extends EmployeeInfo {

	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	public PartTimeEmployee(int employeeNumber) {
		super(employeeNumber);	
	}
	public double calcAnnualGrossIncome (){		
		return hourlyWage*hoursPerWeek*weeksPerYear;
	}
	public double AnnualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductRate);
	}
}