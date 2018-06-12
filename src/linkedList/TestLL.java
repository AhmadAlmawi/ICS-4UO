package linkedList;

public class TestLL {

	public static void main(String[] args) {
		
		LinkedList testLL = new LinkedList();
		
		StudentInfo Ahmad = new StudentInfo (531315, "Ahmad", "Almawi");
		StudentInfo Ani = new StudentInfo (112233, "Ani", "Srikanth");
		StudentInfo Dhyey = new StudentInfo (445566, "Dhyey", "Bhavsar");
		StudentInfo Madhi = new StudentInfo (778899, "Madhi", "Najaragan");
		StudentInfo Saharsh = new StudentInfo (123456, "Saharsh", "Hariharan");
		
		testLL.addToFront(Ahmad);
		testLL.addToFront(Ani);
		testLL.addToFront(Dhyey);
		testLL.addToFront(Madhi);
		testLL.addToFront(Saharsh);
		testLL.displayList(); //order should be reverse
		
		testLL.removeFromRear();
		testLL.displayList();
		//should be Saharsh, Madhi, Dhyey, Ani

	}
}
