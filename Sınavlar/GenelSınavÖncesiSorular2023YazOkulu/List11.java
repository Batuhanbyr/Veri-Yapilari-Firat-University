package GenelSınavÖncesiSorular2023YazOkulu;

public class List11 {
Node11 head;

public void ekle(int data) {
	Node11 eklenecek = new Node11(data);
	if(head == null) {
		head = eklenecek;
		head.next = null;
	}else {
		Node11 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = eklenecek;
		eklenecek.next = null;
	}
}

public void print() {
	Node11 temp = head;
	if(temp != null) {
	System.out.print(temp.data + " ");
	while(temp.next!=null) {
		temp = temp.next;
		System.out.print(temp.data + " ");
	}}else {
		System.out.print("liste bos...");
	}
}
}
