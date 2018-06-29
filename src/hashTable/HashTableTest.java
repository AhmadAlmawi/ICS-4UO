package hashTable;

public class HashTableTest {

	public static void main(String[] args) {
		
		HashTable testTable = new HashTable(4);
		
		EmployeeInfo Ahmad = new EmployeeInfo(1);
		EmployeeInfo Dhyey = new EmployeeInfo(2);
		EmployeeInfo Madhi = new EmployeeInfo(3);
		EmployeeInfo Ani = new EmployeeInfo(4);
		EmployeeInfo Saharsh = new EmployeeInfo(8);
		
		testTable.addEmployee(Ahmad);
		testTable.addEmployee(Dhyey);
		testTable.addEmployee(Madhi);
		testTable.addEmployee(Ani);
		testTable.addEmployee(Saharsh);
		
		testTable.showData();
		
		testTable.removeEmployee(Saharsh);	
		
	}

}
