package GenelSınavÖncesiSorular2023YazOkulu;

public class DaireselListe2 {
 processNode head;
 
 public void ekle(int zaman) {
	 processNode process = new processNode(zaman);
	 if(head == null) {
		 head = process;
		 head.next = head;
	 }else {
		processNode temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = process;
		process.next = head;
		
	 }
 }
 
 public void print() {
	 processNode temp = head;
	 try {
		 System.out.println("processin kendi zamanı işleniyor : " + temp.cpuzaman);
		 Thread.sleep(temp.cpuzaman*1000);
		 Thread.sleep(100);
		 while(temp.next != head) {
			 temp = temp.next;
			 System.out.println("processin kendi zamanı işleniyor : " + temp.cpuzaman);
			 Thread.sleep(temp.cpuzaman*1000);
			 Thread.sleep(100);	
		 }
		 Thread.sleep(100); // 0.1 milisaniye
	 }catch(Exception e) {
		 System.out.print(e);
	 }
 }
}
