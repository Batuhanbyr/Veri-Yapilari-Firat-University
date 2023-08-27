package GraflarDFS_BFS;
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
	
	public void DepthFirstSearch(int src) { // src(source node) = node that we will like to began
		boolean[] visited = new boolean[matrix.length]; // creating a boolean list for to know which node we visit
		dfsHelper(src,visited);
	}

	private void dfsHelper(int src, boolean[] visited) {
		if(visited[src]) // if it's true
			return;
		else {
			visited[src] = true;
			System.out.println(nodes.get(src).data + " =visited");
		}
		
		for(int i=0; i<matrix[src].length; i++) {
			if(matrix[src][i] == 1) {
				dfsHelper(i, visited);
			}
		}
		return;
	}
	
	
	public void BreadthFirstSearch(int src) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[matrix.length];
		queue.offer(src);
		visited[src] = true;
		while(queue.size() != 0) {
			src = queue.poll();
			System.out.println(nodes.get(src).data + " =visited");
			
			for(int i = 0; i<matrix.length; i++) {
				if(matrix[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	
	
}
