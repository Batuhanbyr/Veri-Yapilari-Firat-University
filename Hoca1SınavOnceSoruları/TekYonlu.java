package Hoca1SınavOnceSoruları;

public class TekYonlu {

	Node head;
	Node head2;
	
	
	void ekle(int data) {
		Node ekle = new Node(data);
		if(head == null) {
			head = ekle;
			head.next =null;
		}else {
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = ekle;
			ekle.next = null;
		}
	}
	
	void ayır() {
		Node temp1 = head;
		Node temp11 = head;
		Node temp2 = head;
		Node temp22 = head;
		
		for(int i=0; i<59; i++) {
			temp11 = temp1;
			temp1 = temp1.next;
		}
        for(int i=0; i<79; i++) {
        	temp2 = temp2.next;
		}
        temp22 = temp2;
        temp22 = temp22.next;
        
        head2 = temp1;
        temp2.next = temp1;
        
        temp11.next = temp22;
	}
	
	
	void bastır() {
		Node temp = head;
		System.out.print("->" + temp.data);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.print("->" + temp.data);	
		}
	}
	
	void bastır2() {
		Node temp = head2;
		System.out.print("->" + temp.data);
		while(temp.next!=head2) {
			temp = temp.next;
			System.out.print("->" + temp.data);	
		}
	}
}
