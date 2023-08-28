package İkiliAgac;

public class Main {

	public static void main(String[] args) {
		
		İkiliAgac agac = new İkiliAgac();
		
		agac.root = agac.insert(agac.root, 10);
		agac.insert(agac.root, 15);
		agac.insert(agac.root, 8);
		agac.insert(agac.root, 20);
		agac.insert(agac.root, 4);
		agac.insert(agac.root, 12);
		
        System.out.println(agac.root.data);
        
	}

}
