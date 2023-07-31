package Test;

public class List {

	Node head;
	Node tail;
 // Node temp; we will define it whenever are needed
	
	
 // ---ADDİNG PART---	
	void CreateaNode(int x) { 
		Node Y = new Node(); // we create it our node
		Y.value=x; // and we gave it a value (paramether of method)
		
		if(head==null) { // we don't have any node yet
			head = Y;
			head.next = null;
			tail = head;		
		} else { // first we need to go to the end of LİST
			Node temp;
			temp = head;
			while(temp.next!=null) { // we need to go to the end of LİST
				temp = temp.next;
			} 
			temp.next = Y; // we put node to the end of LİST
			Y.next = null;
			temp = head; // we return this pointer to the start value
		}
	}
	
	
	void MakeFirst(int x) { //put node to the begining ( 1->2->3  convert to  24->1->2->3 ) 
		Node Y = new Node();
		Y.value=x;
		
		Y.next=head; // if this line = Y.next=head.next; we will see -> ( 1->2->3  convert to  24->2->3 )
		head=Y;
	}
	
	void MakeLast(int x) { // put node to the last
		Node temp = head;
		
		Node Y = new Node();
		Y.value = x;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=Y;
		Y.next = null;
	}
	
	void AddinMid(int index, int x) {
		// we will start at i (index of start) and t=t.next; 
		Node temp = head;
		for(int i=0; i<(index-2); i++) {
			temp = temp.next;
		}
		Node Y = new Node();
		Y.value = x;
		Y.next = temp.next;
		temp.next  = Y;
	}
	 
	void PrintList() { // we don't need to take a paramether 
		Node temp = head;
		System.out.println(temp.value); 
		while(temp.next!=null) {
			temp = temp.next;
			System.out.println(temp.value); 
		}
	}
	
	// ---DELETE PART---
	
	void DeleteFirst() { // its deleting the first Node
		Node temp = head;
		temp = temp.next;
		head = temp;
	}
	
	void DeleteLast() { // it's deleting the last Node
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next = null;
	}
	
	void DeleteMid(int index) {
		Node temp = head;
		Node temp2;
		for(int i=0; i<(index-2); i++) {
			temp = temp.next;
		}
		temp2 = temp.next.next;
		temp.next=temp2;
		
	}
}