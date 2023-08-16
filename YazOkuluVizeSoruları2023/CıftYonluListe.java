package YazOkuluVizeSoruları2023;

public class CıftYonluListe {
Node head;

void ekle(int data) {
	Node eklenecek = new Node(data);
	if(head==null) {
		head = eklenecek;
		head.next = head;
		head.prev = head;
	}
	else {
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		temp.next = eklenecek;
		eklenecek.prev = temp;
		eklenecek.next = head;
	}
}

void bastır() {
	Node temp =head;
	System.out.print(" liste : " + temp.data);
	while(temp.next!=head) {
		temp = temp.next;
		System.out.print("->" + temp.data);
	}
}
}
