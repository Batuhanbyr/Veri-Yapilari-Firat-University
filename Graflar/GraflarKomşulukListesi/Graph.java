package GraflarKomşulukListesi;
import java.util.*;

public class Graph {
   
	ArrayList<LinkedList<Node>> alist; //adjacency list
	
	Graph(){
		alist = new ArrayList<>();
	}
	
	public void addNode(Node node) {
		LinkedList<Node> currentlist = new LinkedList<>();
		currentlist.add(node);
		alist.add(currentlist);
	}
	
    public void addEdge(int src, int dst) { // takes source & destination
		LinkedList<Node> currentlist = alist.get(src);
		Node dstnode = alist.get(dst).get(0);
	    currentlist.add(dstnode);
	}
    
     public boolean checkEdge(int src, int dst) { // takes source & destination
    	 LinkedList<Node> currentlist = alist.get(src);
 		Node dstnode = alist.get(dst).get(0);
 		
 		for(Node node : currentlist) {
 			if(node == dstnode)
 				return true;
 		}
 		return false;
	}
     public void print() {
    	 for(LinkedList<Node> currentlist : alist) {
    		 for(Node node : currentlist) {
    			 System.out.print(node.data + "->");
    		 }
    		 System.out.println(" ");
    	 }
     }
}
