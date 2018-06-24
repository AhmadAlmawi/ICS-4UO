package queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue testLL = new Queue();
		
		StudentInfo Ahmad = new StudentInfo (531315, "Ahmad", "Almawi");
		StudentInfo Ani = new StudentInfo (112233, "Ani", "Srikanth");
		StudentInfo Dhyey = new StudentInfo (445566, "Dhyey", "Bhavsar");
		StudentInfo Madhi = new StudentInfo (778899, "Madhi", "Najaragan");
		StudentInfo Saharsh = new StudentInfo (123456, "Saharsh", "Hariharan");
		
		testLL.enqueue(Ahmad);
		testLL.enqueue(Ani);
		testLL.enqueue(Dhyey);
		testLL.enqueue(Madhi);
		testLL.enqueue(Saharsh);
		testLL.displayList(); //order should order in which they're added
		System.out.println("");
		testLL.dequeue();
		testLL.displayList();
		//should be Ani, Dhyey, Madhi, Saharsh
		System.out.println("");
		testLL.dequeue();
		testLL.displayList();
		//should be Dhyey, Madhi, Saharsh
		System.out.println("");
		testLL.enqueue(Ahmad);
		testLL.displayList();
		//should be Dhyey, Madhi, Saharsh, Ahmad
		
	}

}
