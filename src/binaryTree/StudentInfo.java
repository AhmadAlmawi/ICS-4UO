package binaryTree;

public class StudentInfo {
	
	//Attributes
	private String firstName, lastName;
	private int studentNum;
	private StudentInfo left, right;
	
	//Constructors
	public StudentInfo(int key, String firstName, String lastName){
		setLeft(null);
		setRight(null);
		this.studentNum = key;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	
	//Getters & Setters
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

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public StudentInfo getLeft() {
		return left;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public StudentInfo getRight() {
		return right;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}
	

}
