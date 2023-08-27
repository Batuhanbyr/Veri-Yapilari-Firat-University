package GraflarKomşulukListesi;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph();
        
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1); // A to B
		graph.addEdge(1, 2); // B To C
		graph.addEdge(1, 4); // B To E
		graph.addEdge(2, 3); // C To D
		graph.addEdge(2, 3); // C To E
		graph.addEdge(4, 0); // E To A
		graph.addEdge(4, 2); // E To C
		
		graph.print();
	}

}
