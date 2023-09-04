package YazOkuluFinavSoruları2023;

public class İkiliDaireselListe {

	Node head;
	Node tail;
	
	public void ekle(int deger) {
		Node eklenecek = new Node(deger);
		
		if(head == null) {
			head = eklenecek;
			tail = head;
			head.next = head;
			head.prev = head;
		}else {
			tail.next = eklenecek;
			eklenecek.next = head;
			eklenecek.prev = tail;
			tail = eklenecek;
		}
	}
	
	public void çıkar() { // 40. elemanı listedden çıkartıyoruz
		Node temp = head; 
		for(int i=0; i<20; i++) {
			temp = temp.next;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp = null;
	}
	
	public void print() { 
		Node temp = head;
		System.out.print("Liste : " + temp.data + " ");
		while(temp.next != head) {
			temp = temp.next;
			System.out.print(temp.data + " ");
		}
	}
}
