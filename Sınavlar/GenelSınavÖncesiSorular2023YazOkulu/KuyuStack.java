package GenelSınavÖncesiSorular2023YazOkulu;

public class KuyuStack {
KuyuNode top;
KuyuNode bottom;

public void ekle(int malzeme) {
	KuyuNode kuyu = new KuyuNode(malzeme); // kuyu bir merdüven, her node ise kuyunun bir basamağı gibi düşün
	if(bottom == null) {
		bottom = kuyu;
		bottom.next = null;
	}else {
		KuyuNode temp = bottom;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = kuyu;
		top = kuyu;
		top.next = null;
	}
}

public int[] KuyuBosalt() {
    KuyuNode temp = bottom;
    int i = 0;
    int[] dizi = new int[countNodes()]; // Kuyudaki düğüm sayısı kadar bir dizi oluştur
    while (temp != null) {
        dizi[i] = temp.malzeme; // Malzemeyi dizinin ilgili elemanına at
        temp.malzeme = 0; // Kuyudaki malzemeyi sıfırla
        temp = temp.next; // Sonraki düğüme geç
        i++;
    }
    kuyuTamamenSil();
    return dizi; // malzemeleri bir diziye atıyoruz
}

public int countNodes() { // kuyudaki node sayısını sayıyoruz
    KuyuNode temp = bottom;
    int count = 0;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    return count;
}

public void kuyuTamamenSil() { // kuyuyu tamamen siliyoruz
   KuyuNode temp2 = null;
   while(bottom.next != null) {
	   temp2 = bottom;
	   bottom=bottom.next;
	   temp2 = null;
	  
   }
   bottom = null; 
}
 

public void print() {
	KuyuNode temp = bottom;
	if(temp == null) {
		System.out.println("Kuyu bos...");
	}else {
		System.out.println(temp.malzeme);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.println(temp.malzeme);
		}
	}
}
}
