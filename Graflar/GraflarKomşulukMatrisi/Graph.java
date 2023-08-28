package GraflarKomşulukMatrisi;
import java.util.*;
public class Graph {

	ArrayList<Node> nodes; //for nodes
	int[][] matrix; //2D Array
	
	Graph(int size){ //it takes size
		nodes = new ArrayList<>();
		matrix = new int[size][size]; //that's way space complexity is O(v^2)				
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1; // we are creating an edge between src and dst
	}
	
	public boolean checkEdge(int src, int dst) { // source & destination
		if(matrix[src][dst] == 1) //if there is an edge return true else return false
			return true;
		else
			return false;
 	}
	
	public void print() {
		System.out.print("  ");
		for(Node node : nodes) { // foreach in java
			System.out.print(node.data + " ");
		}
		System.out.println();
		
		for(int i=0; i<matrix.length; i++) {
			System.out.print(nodes.get(i).data + " "); // A->B->C->D->E
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
