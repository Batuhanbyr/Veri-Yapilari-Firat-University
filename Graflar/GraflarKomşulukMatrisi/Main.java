package GraflarKomşulukMatrisi;

public class Main {

	public static void main(String[] args) {
		
		
		Graph graph = new Graph(5); // size is 5
		
		graph.addNode(new Node('A')); // adding nodes
		graph.addNode(new Node('B')); // adding nodes
		graph.addNode(new Node('C')); // adding nodes
		graph.addNode(new Node('D')); // adding nodes
		graph.addNode(new Node('E')); // adding nodes
	    
		
		graph.addEdge(0, 1); // A to B
		graph.addEdge(1, 2); // B To C
		graph.addEdge(1, 4); // B To E
		graph.addEdge(2, 3); // C To D
		graph.addEdge(2, 3); // C To E
		graph.addEdge(4, 0); // E To A
		graph.addEdge(4, 2); // E To C
		
		graph.print();
		
		
		System.out.println(graph.checkEdge(0, 0));
	}

}
