package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
         
		System.out.print("Tree (inorder) : ");
		tree.display();
		System.out.println("");
		System.out.println("Is there 1 in the tree? : " + tree.search(1));
		System.out.println("Is there 11 in the tree? : " + tree.search(11));
		tree.remove(0);
		
		tree.remove(1);
		System.out.print("Tree (inorder) : ");
		tree.display();
		
	}

}
