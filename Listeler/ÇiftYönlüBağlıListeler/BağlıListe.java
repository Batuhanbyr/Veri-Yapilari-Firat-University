package ÇiftYönlüBağlıListeler;

public class BağlıListe {
// çift yönlü doğrusal bağlı liste yapısı
	
	Node head = null;
	Node tail = null;
	
	
	void BasaEkle(int data) {
		Node eleman = new Node(data);
		if(head==null) {
			head = eleman;
			tail = eleman;
			eleman.prev = null;
			eleman.next = null;
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			head.prev = null;
		}		
	}
	
	void SonaEkle(int data) {
		Node eleman = new Node(data);
		if(head==null) {
			head = eleman;
			tail = eleman;
			eleman.prev = null;
			eleman.next = null;
		} else {
			tail.next = eleman;
			eleman.prev = tail;
			eleman.next = null;
			tail = eleman;
			tail.next = null;
		}		
	}
	
	void ArayaEkle(int index, int data) {
		Node temp = head;
		Node eleman = new Node(data);
		if(index==1) { //BAŞA EKLEMEYİ ZATEN YAZDIK BURDA SADECE ÇAĞIRIYORUZ
			BasaEkle(data);	
		}
		for(int i=1; i<index-1; i++) {
			temp=temp.next;
		}
		if(temp.next.next==null) { //SONA EKLEMEYİ ZATEN YAZDIK BURDA SADECE ÇAĞIRIYORUZ
			SonaEkle(data);
		}
		Node temp2 = temp;
		temp2 = temp.next;
		
		eleman.next = temp2;
		eleman.prev = temp;
		temp.next = eleman;
		temp2.prev = eleman;
	}
	
	//***********************************************
	
	void BastanSil() {
		
		if(head==null) {
			System.out.println("Liste boş olduğu için baştan silme gerçekleştirilemedi...");
		}
		else if(head.next==null) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}		
	}
	
void SondanSil() {
		
		if(head==null) {
			System.out.println("Liste boş olduğu için sondan silme gerçekleştirilemedi...");
		}
		else if(head.next==null) {
			head = null;
			tail = null;
		} 
		else {
			tail = tail.prev;
			tail.next = null;
		}		
	}

void AradanSil(int index) {
	Node temp = head;
	if(index==1) { //BAŞA EKLEMEYİ ZATEN YAZDIK BURDA SADECE ÇAĞIRIYORUZ
		BastanSil();
	}
	for(int i=1; i<index-1; i++) {
		temp=temp.next;
	}
	if(temp.next.next==null) { //SONA EKLEMEYİ ZATEN YAZDIK BURDA SADECE ÇAĞIRIYORUZ
		SondanSil();
	}else { // exception fırlatmasın diye
	Node temp2 = temp;
	temp2 = temp.next.next;
	
	temp.next = null;
	temp.next = temp2;
	temp2.prev = temp;
	}
	
}
	
	
	void Yazdır(BağlıListe liste) {
		if(head==null) {
			System.out.println("liste bos");
		}else {
		Node temp = head;
		System.out.print("liste: "+temp.data);
	    while(temp.next!=null) {
	    	temp = temp.next;
			System.out.print( "->" + temp.data);
		}
	}
	}
	
	
	
}
