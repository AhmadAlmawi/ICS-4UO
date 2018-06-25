package stack;

public class Stack {

	// Variables
	StudentInfo topOfStack = null;
	int numItems = 0;

	// Constructor
	public Stack() {
	}

	// Methods
	public void push(StudentInfo toAdd) { // Adds an item to the top of the stack
		if (numItems == 0) {
			topOfStack = toAdd;
			numItems++;
		} else {
			toAdd.setNext(topOfStack);
			topOfStack = toAdd;
			numItems++;
		}
	}

	public void pop() { // Removes the top item in the stack
		if (numItems == 0) {
			System.out.println("There are no more students to remove");
		} else {
			topOfStack = topOfStack.getNext();
			numItems--;
		}
	}

	public void peek() { // Displays the top item in the stack
		if (numItems == 0) {
			System.out.println("There's nobody in the list");
		} else {
			System.out.println(topOfStack.getFirstName());
		}
	}
}
