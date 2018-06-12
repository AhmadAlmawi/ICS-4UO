package binaryTree;

public class TestTree {

	public static void main(String[] args) {

		MyBinaryTree testTing = new MyBinaryTree();
		
		StudentInfo Ahmad = new StudentInfo (7, "Ahmad", "Almawi");
		StudentInfo Ani = new StudentInfo (11, "Ani", "Srikanth");
		StudentInfo Dhyey = new StudentInfo (2, "Dhyey", "Bhavsar");
		StudentInfo Madhi = new StudentInfo (5, "Madhi", "Najaragan");
		StudentInfo Saharsh = new StudentInfo (20, "Saharsh", "Hariharan");
		
		testTing.addNode(testTing.getRoot(), Ahmad);
		testTing.addNode(testTing.getRoot(), Ani);
		testTing.addNode(testTing.getRoot(), Dhyey);
		testTing.addNode(testTing.getRoot(), Madhi);
		testTing.addNode(testTing.getRoot(), Saharsh);
		
		System.out.println("Preorder");		
		testTing.preorder(testTing.getRoot());
		System.out.println(" ");
		
		System.out.println("Inorder");		
		testTing.inorder(testTing.getRoot());
		System.out.println(" ");
		
		System.out.println("Postorder");		
		testTing.postorder(testTing.getRoot());
		System.out.println(" ");
	}

}
