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
	
	//---ADDİNG GROUP OF NODES--- 
	
	
	void AddNodestotheFirst(List list, int... x) {
		
		Node[] A = new Node[x.length];
		int i = 0;
		
		for(int num : x) {
			A[i] = new Node(); 
			A[i].value = num;
			i++;
		}
		
		A[0].next=A[1]; // first node's next --ATTENTION--
		A[1].next=A[2]; // we need to make this automathic!!!
		
		
		Node headA = A[0];
		Node tempA = headA;
		
		//adding the first
		while(tempA.next!=null) {
			tempA=tempA.next; // now temp_another located at the end
		}
		//System.out.println(tempA.value);
		
		// now we are adding this Node at first 
	     tempA.next = list.head;
	     list.head = headA;
		
	}
	
void AddNodesattheEnd(List list, int... x) {
		
		Node[] A = new Node[x.length];
		int i = 0;
		
		for(int num : x) {
			A[i] = new Node(); 
			A[i].value = num;
			i++;
		}
		
		A[0].next=A[1]; // first node's next --LOOK HERE---
		A[1].next=A[2]; // we need to make this automathic!!!
		
		
		Node headA = A[0];
		Node tempA = headA;
		
		Node listtemp = list.head;
	
		while(listtemp.next!=null) {
			listtemp=listtemp.next; // now listtemp located at the end
		}		
		// now we are adding this Node to the end
	    listtemp.next = headA;
		
	}

void AddNodestotheMid(int index,List list, int... x) {
	
	Node[] A = new Node[x.length];
	int i = 0;
	
	for(int num : x) {
		A[i] = new Node(); 
		A[i].value = num;
		i++;
	}
	
	A[0].next=A[1]; // first node's next --LOOK HERE---
	A[1].next=A[2]; // we need to make this automathic!!!
	
	
	Node headA = A[0];
	Node tempA = headA;
	
	Node listtemp = list.head;

	
	for(int j=0; j<(index-2); j++) {
		listtemp = listtemp.next;
	}
	
	for(int z=1; z<(x.length); z++) {
	 tempA = tempA.next;
	}
	
	// now we are adding this Node to the mid
	tempA.next = listtemp.next;
    listtemp.next = headA;
	
}
	
	
// ---DELETİNG GROUP OF NODES--- 
	
void DeleteFirstNodes(int index, List list) { // delete a group of Nodes at the beggining
	Node listtemp=list.head;
	for(int i = 1; i<index; i++) {
		listtemp= listtemp.next;
	}
	head = listtemp.next;
	
}

void DeleteLastNodes(int index, List list) { // delete a group of Nodes at the beggining
	Node listtemp=list.head;
	int x = 1;
	while(listtemp.next!=null) {
		listtemp=listtemp.next;
		x++;
	}
	 // now x are like list.length 
	listtemp=list.head;
	
	int len = x - index;
	for(int i = 1; i<len; i++) {
		listtemp= listtemp.next;
	}
	
	listtemp.next=null;
	
}

void DeleteMidNodes(int start, int length, List list) {
	
	Node listtemp = list.head;
	
	for(int i=1; i<start; i++) {
		listtemp=listtemp.next;	
	}
	
	for(int j=1; j<length; j++) {
		listtemp=listtemp.next;
	}
	
	list.head=listtemp.next;
}
	
}
