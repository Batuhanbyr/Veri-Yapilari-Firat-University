package GenelSınavÖncesiSorular2023YazOkulu;

public class Queue11 {
Stack11 bottom;

	
	public void ekle(Stack11 stack) {
		Stack11 eklenecek = stack;
		if(bottom==null) {
			bottom = eklenecek;
			bottom.next = null;
		}else {
			Stack11 temp = bottom;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = eklenecek;
			eklenecek.next = null;
		}
	}
	
	public List11 listeyekoy(List11 liste) { //queue'nun içindeki stackların içindeki verileri listeye atan fonksiyon
		Stack11 temp = bottom;
		List11 liste1 = liste;
		temp.listeyeAl(liste1);
		while(temp.next!=null) {
			temp = temp.next;
			temp.listeyeAl(liste1);
		}
		return liste1;
	}
	
	
}
