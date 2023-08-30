package GenelSınavÖncesiSorular2023YazOkulu;

public class AtmKuyruk {
NodeAtm head;
NodeAtm tail;

public void Ekle(int para, int süre) {
	NodeAtm eklenecek = new NodeAtm(para,süre);
	if(head==null) {
		head = eklenecek;
		head.next = null;
	}else {
		NodeAtm temp = head;
		while(temp.prev!=null) {
			temp = temp.prev;
		}
		temp.prev = eklenecek;
		eklenecek.next = temp;
		eklenecek.prev = null;
		tail = eklenecek;
	}
}

public void ParalarCekilsin() {
	 NodeAtm temp = head;
	 try {
		 System.out.println("para çekiliyor... : " + temp.süre);
		 Thread.sleep(temp.süre*1000);
		 while(temp.prev != null) {
			 temp = temp.prev;
			 System.out.println("para çekiliyor... : " + temp.süre);
			 Thread.sleep(temp.süre*1000);	
		 }
	 }catch(Exception e) {
		 System.out.print(e);
	 }
}



}
