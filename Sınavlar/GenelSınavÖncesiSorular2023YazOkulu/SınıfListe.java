package GenelSınavÖncesiSorular2023YazOkulu;

public class SınıfListe {
SınıfNode head;

public void ekle(String rol, String isim, String görev) {
	SınıfNode eklenecek = new SınıfNode(rol,isim,görev);
	if(head == null) {
		head = eklenecek;
		head.next = null;
	}else {
		SınıfNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = eklenecek;
		eklenecek.next = null;
	}
}

public void print() {
	SınıfNode temp = head;
	System.out.println("gorevi: " + temp.rol + " | ismi : " + temp.isim + " | yapmasi gerekenler : " + temp.gerekenler);
	while(temp.next!=null) {
		temp = temp.next;
		System.out.println("gorevi: " + temp.rol + " | ismi : " + temp.isim + " | yapmasi gerekenler : " + temp.gerekenler);
	}
}
}
