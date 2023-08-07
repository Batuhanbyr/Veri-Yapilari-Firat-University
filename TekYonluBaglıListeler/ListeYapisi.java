package TekYonluBaglıListeler;

public class ListeYapisi {
Node head = null;
Node tail = null;

void BasaEkle(int x) {
	Node eleman = new Node();
	eleman.data=x;
	
	if(head==null) {
		eleman.next=null;
		head=eleman;
		tail=eleman;
		
	}else {
		eleman.next=head;
		head=eleman;
	}
}

void SonaEkle(int x) {
	Node eleman = new Node();
	eleman.data=x;
	
	if(head==null) {
		eleman.next=null;
		head=eleman;
		tail=eleman;
		
	}else {
		eleman.next=null;
		tail.next=eleman;
		tail=eleman;
	}
}

void ArayaEkle(int indis, int x) {
	Node eleman = new Node();
	eleman.data=x;
	
	if(head==null && indis==0) {
		eleman.next=null;
		head=eleman;
		tail=eleman;
		
	}else if(head!=null && indis==0) {
		eleman.next=head;
		head=eleman;
	}
	else { // sona eklemek isterse
		int n=0;
		Node temp=head;
		Node temp2=head;
		while(temp!=null) {
			n++;
			temp2=temp;
			temp=temp.next;
		}
		if(n==indis) {
			temp2.next=eleman;
			eleman.next=temp;
		}
		else {
			temp=head;
			temp2=head;
			int i=0;
			while(i != indis) {
				temp2=temp;
				temp=temp.next;
				i++;
			}
			temp2.next=eleman;
			eleman.next=temp;
		}
		
	}
} 






void Yazdır() { // doğru yaptım !
	Node temp=head;
	System.out.println(temp.data);
	while(temp.next!=null) {
		System.out.println(temp.next.data);
		temp=temp.next;
	}
	System.out.println("dizinin sonu");
	
}


}
