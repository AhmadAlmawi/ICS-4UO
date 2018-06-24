package queue;

public class StudentInfo {

	private int studentNumber;
	private String firstName;
	private String lastName;
	private StudentInfo next; // Points to the next item in the LL

	// Constructors
	public StudentInfo() {
		this.studentNumber = -1; // Bogus information
		this.firstName = null;
		this.lastName = null;
		this.next = null; // Initialized to not point anywhere
	}

	public StudentInfo(int sN, String fN, String lN) {
		this.studentNumber = sN;
		this.firstName = fN;
		this.lastName = lN;
		this.next = null;
	}

	// Methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public StudentInfo getNext() {
		return next;
	}

	public void setNext(StudentInfo next) {
		this.next = next;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {

		if (studentNumber >= 1) {
			this.studentNumber = studentNumber;
		} else {
			System.out.println("Node Number not Valid");
		}

	}
}
