package GenelSınavÖncesiSorular2023YazOkulu;

public class Stack11 {
Node11 bottom;
Stack11 next;

public void ekle(int data){
	Node11 eklenecek = new Node11(data);
	if(bottom == null) {
		bottom = eklenecek;
		bottom.next = null;
	}else {
		Node11 temp = bottom;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = eklenecek;
		eklenecek.next = null;
	}
}

public List11 listeyeAl(List11 liste) { // Stack içindeki verileri tekYönlüListeye ekleyen fonksiyon 
	List11 liste2 = liste;
	Node11 temp = bottom;
	liste2.ekle(temp.data);
	while(temp.next!=null) {
		temp = temp.next;
		liste2.ekle(temp.data);
	}
	return liste2;
}


}
