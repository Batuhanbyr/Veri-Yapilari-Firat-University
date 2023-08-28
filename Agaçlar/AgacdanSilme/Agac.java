package AgacdanSilme;

public class Agac {
 Node root;

public Agac() {
root = null;
}

Node newNode(int data) {
	root = new Node(data);
	return root;
}

Node insert(Node root, int data) {
	if(root != null) {
		if(data<root.data) 
			root.left = insert(root.left,data);
		else 
			root.right = insert(root.right,data);
	}else {
		root = newNode(data);
	}
	return root;
}

void inorder(Node root) {
	if(root != null) {
		inorder(root.left);
		System.out.print(root.data + " "); 
		inorder(root.right);
	}
}

// Verilen değeri ağaçtan silen fonksiyon
Node deleteNode(Node root, int key) {
    // Temel durum: Ağaç boşsa veya istenen düğüm null ise
    if (root == null)
        return root;

    // İstenen değer, sol alt ağaçta ise sol tarafa git
    if (key < root.data)
        root.left = deleteNode(root.left, key);
    // İstenen değer, sağ alt ağaçta ise sağ tarafa git
    else if (key > root.data)
        root.right = deleteNode(root.right, key);
    // Eğer değer bulunduysa
    else {
        // Sadece bir çocuğu veya hiç çocuğu olmayan durumda düğümü sil
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;

        // İki çocuğu olan durumda, inorder halefini bul
        root.data = minValue(root.right);

        // Inorder halefi olan düğümü sil
        root.right = deleteNode(root.right, root.data);
    }

    return root;
}

// Verilen ağacın en küçük değerini bulan yardımcı fonksiyon
int minValue(Node root) {
    int minValue = root.data;
    while (root.left != null) {
        minValue = root.left.data;
        root = root.left;
    }
    return minValue;
}


 
}
