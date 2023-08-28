package TekYonluDaireselBaglıListe;

public class BaglıListe {
	
Node head;


public void BasaEkle(int data) {
	Node eleman = new Node(data);
	if(head==null) {
		head = eleman;
		head.next = head;
	}else {
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		eleman.next = head;
		temp.next=eleman;
		head = eleman;
	}
}


public void SonaEkle(int data) {
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

public void OrtayaEkle(int index,int data) {
	Node eleman = new Node(data);
	if(head==null) {
		head = eleman;
		head.next = head;
	}
	if(index==1) {
		BasaEkle(data);
	}else {
	Node temp = head;
	for(int i=1; i<index-1; i++) {
		temp = temp.next;
	}
	if(temp.next==head) { // eğer sondaysam
		SonaEkle(data);
	}else {
	Node temp2 = temp;
	temp2 = temp2.next;
	
	temp.next = eleman;
	eleman.next = temp2;
	}
	}	
}

//***************************************************************************************

public void BastanSilme() {
	if(head==null) {
		System.out.println("Liste Boş");
	}else {
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		head = head.next;
		temp.next=null; //önemli silme yapıyoruz
		temp.next=head;
	}
}

public void SondanSilme() {
	if(head==null) {
		System.out.println("Liste Boş");
	}else {
		Node temp = head;
		while(temp.next.next!=head) {
			temp = temp.next;
		}
		temp.next =null; //sondan silme
		temp.next = head;
	}
}

public void OrtadanSilme(int index) {
	
	if(head==null) {
		System.out.println("Liste Boş");	
	}
	if(index==1) {
		BastanSilme(); // ilk elemanı silicem
	}else {
	Node temp = head;
	for(int i=1; i<index-1; i++) {
		temp = temp.next;
	}
	if(temp.next.next==head) { // eğer sondaysam
	 SondanSilme(); //son elemanı siliceğim 	
	}else {
	Node temp2 = temp;
	temp2 = temp2.next.next;
	
	temp.next = null; // siliyorum
	temp.next = temp2;
	}
	}	
}

public void Yazdır(BaglıListe liste) {
	Node temp = head;
	System.out.print("liste : " + temp.data);
	while(temp.next!=head) {
		temp=temp.next;
		System.out.print("->" + temp.data);	
	}
	
}
}
