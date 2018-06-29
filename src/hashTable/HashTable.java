package hashTable;

import java.util.ArrayList;

public class HashTable {

	// Attributes
	private ArrayList<EmployeeInfo>[] buckets;
	private int bucketAmount;

	// Constructor
	public HashTable(int numBuckets) {
		bucketAmount = numBuckets;
		buckets = new ArrayList[bucketAmount];
		for (int i = 0; i < bucketAmount; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();
		}
	}

	// Methods
	public void addEmployee(EmployeeInfo toAdd) {
		int bucketAdding = toAdd.getEmpNumber() % bucketAmount;
		buckets[bucketAdding].add(toAdd);
	}

	public boolean removeEmployee(EmployeeInfo toRemove) {
		int bucketRemove = toRemove.getEmpNumber() % bucketAmount;
		for (int i = 0; i < buckets[bucketRemove].size() - 1; i++) {

			if (buckets[bucketRemove].get(i).getEmpNumber() == toRemove.getEmpNumber()) {
				buckets[bucketRemove].remove(i);
			}
		}
		return true;
	}

	public int search(EmployeeInfo toFind) {
		int buck = toFind.getEmpNumber() % bucketAmount;
		int position = -1;
		for (int i = 0; i < buckets[buck].size() - 1; i++) {
			if (buckets[buck].get(i).getEmpNumber() == toFind.getEmpNumber()) {
				position = i;
			}
		}
		return position;
	}

	public void showData() {
		System.out.println("Number of buckets: " + bucketAmount);
	}
}