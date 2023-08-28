package Hoca1SınavOnceSoruları;

public class DaireselBaglı {
	Node head;
    Node head2; //diğer liste için 
    
    public void ekle(int data) {
    	Node eleman = new Node(data);
    	if(head==null) {
    		head = eleman;
    		head.next = head;
    	}else {
    		Node temp = head;
    		while(temp.next!=head) {
    			temp = temp.next;
    		}
    		temp.next = eleman;
    		eleman.next = head;
    		
    	}
    }
    
    public void ekle2(int data) {
    	Node eleman2 = new Node(data);
    	if(head2==null) {
    		head2 = eleman2;
    		head2.next = head2;
    	}else {
    		Node temp2 = head2;
    		while(temp2.next!=head2) {
    			temp2 = temp2.next;
    		}
    		temp2.next = eleman2;
    		eleman2.next = head2;
    	}
    }
    
    public void Ayıkla() {
    	Node temp = head;
    	if(temp.data>100) {
    		ekle2(temp.data);
    	}
    	while(temp.next!=head) {
    		temp = temp.next;
    		if(temp.data>100) {
        		ekle2(temp.data);
        	}  
        }
    }
    
    
    public void yazdır() {
    	Node temp = head;
    	System.out.print("liste : " + temp.data);
    	while(temp.next!=head) {
    		temp=temp.next;
    		System.out.print("->" + temp.data);	
    	}	
    }
    
    public void yazdır2() {
    	Node temp2 = head2;
    	System.out.print("liste : " + temp2.data);
    	while(temp2.next!=head2) {
    		temp2=temp2.next;
    		System.out.print("->" + temp2.data);	
    	}	
    }
}
