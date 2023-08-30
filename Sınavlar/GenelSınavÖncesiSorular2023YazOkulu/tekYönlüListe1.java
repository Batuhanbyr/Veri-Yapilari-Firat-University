package GenelSınavÖncesiSorular2023YazOkulu;

public class tekYönlüListe1 {

	Node head;
	
	public void ekle(int mesai,int ücret) {
		Node eklenecek = new Node(mesai,ücret);
		if(head == null) {
			head = eklenecek;
			head.next= null;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = eklenecek;
			eklenecek.next = null;
		}
	}
	
	public  int EnbüyükBul() {
		Node temp = head; int i = 1; int index = 1;
	    float enbuyuk = (temp.ücret / temp.mesai);
	    while(temp.next != null) {
	    	i++;
	    	if(enbuyuk < (temp.next.ücret / temp.next.mesai)) {
	    		enbuyuk = (temp.next.ücret / temp.next.mesai);
	    		index = i;
	    	}
	    	temp = temp.next;
	    }
		return index;
	}
	
	public  int EnkücükBul() {
		Node temp = head; int i = 1; int index = 1;
	    float enkucuk = (temp.ücret / temp.mesai);
	    while(temp.next!=null) {
	    	i++;
	    	if(enkucuk > (temp.next.ücret / temp.next.mesai)) {
	    		enkucuk = (temp.next.ücret / temp.next.mesai);
	    		index = i;
	    	}
	    	temp = temp.next;
	    }
		return index;
	}
	
	public void Sil(int index) {
	    if (index < 1) {
	        System.out.println("Geçersiz indeks");
	        return;
	    }
	    if (index == 1) {
	        head = head.next;
	        return;
	    }
	    Node temp = head;
	    Node prev = null;
	    for (int i = 1; temp != null && i < index; i++) {
	        prev = temp;
	        temp = temp.next;
	    }
	    if (temp == null) {
	        System.out.println("Geçersiz indeks");
	        return;
	    }
	    prev.next = temp.next;
	    temp = null;
	}

	
	public void print() {
		Node temp = head;
		System.out.println("mesaisi : " + temp.mesai + " ucreti : " + temp.ücret);
		while(temp.next != null) {
			temp = temp.next;
			System.out.println("mesaisi : " + temp.mesai + " ucreti : " + temp.ücret);
			
		}
	}
}
