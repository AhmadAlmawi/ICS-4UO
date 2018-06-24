package queue;

public class Queue {

	// Variables
	StudentInfo head, current, tail = null;
	int numItems = 0;

	// Constructor
	public Queue() {
	}

	// Methods
	public void enqueue (StudentInfo toAdd) { //Adds an item to the back of the list
		if (numItems == 0) {
			head = toAdd;
			tail = toAdd;
			numItems++;
		} else {	
			tail.setNext(toAdd);
			tail = toAdd;
			numItems++;
		}
	}

	public void dequeue() { //Removes the first item in the list
		if (numItems == 0) {
			System.out.println("There are no more students to remove");
		} else {
			head = head.getNext();
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
