package linkedList;

public class LinkedList {

	//Variables
	StudentInfo head, current, tail = null;
	int numItems = 0;
	
	//Constructor
	public LinkedList() {
	}
	
	//Methods
	public void addToFront (StudentInfo toAdd) {
		if (numItems == 0) {
			head = toAdd;
			tail = toAdd;
			numItems++;
		} else {
			toAdd.setNext(head);
			head = toAdd;
			numItems++;
		}
	}
	
	public void removeFromRear() {
		if (numItems == 0) {
			System.out.println("There are no more students to remove");
		} else {
			current = head;
			for (int i = 0; i < numItems -1 ; i++) {
				current = current.getNext();
			}
			current.setNext(null);
			numItems--;
		}
	}
	
	public void displayList() {
		if (numItems == 0) {
			System.out.println("There's nobody in the list");
		} else {
			current = head;
			for (int i = 0; i < numItems; i++) {
				System.out.println(current.getFirstName());
				current = current.getNext();
			}
		}
	}

}
