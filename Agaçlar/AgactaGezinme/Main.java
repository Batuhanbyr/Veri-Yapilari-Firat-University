package AgactaGezinme;

public class Main {

	public static void main(String[] args) {
		
		Agac agac = new Agac();
		
		agac.root = agac.insert(agac.root, 10);
		agac.insert(agac.root, 8);
		agac.insert(agac.root, 15);
		agac.insert(agac.root, 5);
		agac.insert(agac.root, 12);
		agac.insert(agac.root, 20);
		agac.insert(agac.root, 9);
		agac.insert(agac.root, 25);
		
		System.out.print("Preorder: ");
		agac.preOrder(agac.root);
		System.out.println("");
		System.out.print("Inorder: ");
		agac.inOrder(agac.root);
		System.out.println("");
		System.out.print("Postorder: ");
		agac.postOrder(agac.root);
		System.out.println("");
		System.out.print("Height: ");
		System.out.print(agac.height(agac.root));
		System.out.println("");
		System.out.print("Size: ");
		System.out.print(agac.size(agac.root));
		
	}

}
