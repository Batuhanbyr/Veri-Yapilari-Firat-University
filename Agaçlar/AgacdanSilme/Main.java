package AgacdanSilme;

public class Main {

	public static void main(String[] args) {
		Agac agac = new Agac();
		agac.root = agac.insert(agac.root,10);
		agac.root = agac.insert(agac.root,5);
		agac.root = agac.insert(agac.root,15);
		agac.root = agac.insert(agac.root,20);
		agac.root = agac.insert(agac.root,4);
		agac.root = agac.insert(agac.root,8);
		agac.root = agac.insert(agac.root,12);
		agac.root = agac.insert(agac.root,30);
		agac.root = agac.insert(agac.root,18);
		
		agac.inorder(agac.root);
		agac.deleteNode(agac.root, 15);
		System.out.println(" ");
		agac.inorder(agac.root);

	}

}
