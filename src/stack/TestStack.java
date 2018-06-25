package stack;

public class TestStack {

	public static void main(String[] args) {

		Stack testLL = new Stack();
		
		StudentInfo Ahmad = new StudentInfo (531315, "Ahmad", "Almawi");
		StudentInfo Ani = new StudentInfo (112233, "Ani", "Srikanth");
		StudentInfo Dhyey = new StudentInfo (445566, "Dhyey", "Bhavsar");
		StudentInfo Madhi = new StudentInfo (778899, "Madhi", "Najaragan");
		StudentInfo Saharsh = new StudentInfo (123456, "Saharsh", "Hariharan");
		
		testLL.push(Ahmad);
		testLL.push(Ani);
		testLL.push(Dhyey);
		testLL.push(Madhi);
		testLL.push(Saharsh);
		testLL.peek(); //should return Saharsh
		System.out.println("");
		//testLL.pop();
		testLL.peek();
		//should be Madhi
		System.out.println("");
		//testLL.pop();
		testLL.peek();
		//should be Dhyey
		System.out.println("");
		testLL.push(Ahmad);
		testLL.peek();
		//should be Ahmad
		
	}

}
