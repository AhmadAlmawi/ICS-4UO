package binaryTree;

public class MyBinaryTree {

	// ATTRIBUTES
	private StudentInfo root;
	private int itemsInTree = 0;

	// CONSTRUCTOR
	public MyBinaryTree() {
	}

	// METHODS
	public void addNode(StudentInfo targetNode, StudentInfo toAdd) {
		if (itemsInTree == 0) {
			root = toAdd;
		} else {
			if (toAdd.getStudentNum() < targetNode.getStudentNum()) {
				if (targetNode.getLeft() == null) {
					targetNode.setLeft(toAdd);
				} else {
					addNode(targetNode.getLeft(), toAdd);
				}
			} else {
				if (targetNode.getRight() == null) {
					targetNode.setRight(toAdd);
				} else {
					addNode(targetNode.getRight(), toAdd);
				}
			}
		}
		itemsInTree++;
	}
	
	//Traversals
	public void preorder(StudentInfo currentNode) {
		if (currentNode == null) {
			return;
		} else {
			System.out.println(currentNode.getFirstName() + " " + currentNode.getLastName() + ": " + currentNode.getStudentNum());
			preorder(currentNode.getLeft());
			preorder(currentNode.getRight());
		}
	}
	
	public void inorder(StudentInfo currentNode) {
		if (currentNode == null) {
			return;
		} else {
			inorder(currentNode.getLeft());
			System.out.println(currentNode.getFirstName() + " " + currentNode.getLastName() + ": " + currentNode.getStudentNum());
			inorder(currentNode.getRight());
		}
	}
	
	public void postorder(StudentInfo currentNode) {
		if (currentNode == null) {
			return;
		} else {
			postorder(currentNode.getLeft());
			postorder(currentNode.getRight());
			System.out.println(currentNode.getFirstName() + " " + currentNode.getLastName() + ": " + currentNode.getStudentNum());
		}
	}

	
	
	// GETTERS & SETTERS
	public StudentInfo getRoot() {
		return root;
	}

	public void setRoot(StudentInfo root) {
		this.root = root;
	}

	public int getItemsInTree() {
		return itemsInTree;
	}

	public void setItemsInTree(int itemsInTree) {
		this.itemsInTree = itemsInTree;
	}

}
