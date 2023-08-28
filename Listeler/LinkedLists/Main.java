package LinkedLists;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
        
		/*linkedlist.push("A");
		linkedlist.push("B");
		linkedlist.push("C");
		linkedlist.push("D");
		linkedlist.push("F");
		
		linkedlist.pop();  //it's removing the LAST element*/
		
		linkedlist.offer("A");
		linkedlist.offer("B");
		linkedlist.offer("C");
		linkedlist.offer("D");
		linkedlist.offer("F");
		
		// linkedlist.remove(); //it's removing the FİRST element
		// linkedlist.remove("C"); //it will remove C
		// linkedlist.poll(); //it's remove the FİRST element
		System.out.println(linkedlist);
		System.out.println( linkedlist.indexOf("B")); // When u adding 1-2-3... when u looking 0-1-2... !
		linkedlist.add(4,"E"); //it's adding at the 4 index
		
		
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.getFirst());
		
		System.out.println(linkedlist);
		
		
	    /*  ADDİNG		addFirst(e) offerFirst(e)		addLast(e) offerLast(e)
	     *  REMOVİNG    removeFirst(e) pollFirst(e)		removeLast(e) pollLast(e)
	     *  SHOW        getFirst(e) peekFirst(e)		getLast(e) peekLast(e)
	     * 
	     * */
	
		
		 // *******************************************************
		  // LinkedList =  Nodes are in 2 parts (data + address)
		  //                        Nodes are in non-consecutive memory locations
		  //                        Elements are linked using pointers
		            
		  //    advantages?
		  //    1. Dynamic Data Structure (allocates needed memory while running)
		  //    2. Insertion and Deletion of Nodes is easy. O(1) 
		  //    3. No/Low memory waste
		  
		  //    disadvantages?
		  //    1. Greater memory usage (additional pointer)
		  //    2. No random access of elements (no index [i])
		  //    3. Accessing/searching elements is more time consuming. O(n)
		  
		  //    uses?
		  //    1. implement Stacks/Queues
		  //    2. GPS navigation
		  //    3. music playlist
		  // *******************************************************

		
		
	}

}
