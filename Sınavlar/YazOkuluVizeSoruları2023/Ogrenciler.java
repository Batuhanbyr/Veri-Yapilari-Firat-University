package YazOkuluVizeSoruları2023;

public class Ogrenciler {
Ogrenci head;

void ekle(String ad, int not) {
	Ogrenci eklenecek = new Ogrenci(not,ad);
	
	if(head==null) {
		head = eklenecek;
		head.next = null;
	}else {
		Ogrenci temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=eklenecek;
		eklenecek.next=null;
	}
}

void enYuksekBul() {
	Ogrenci temp = head;
	int enyukseknot = temp.not; int enyuksekindex=0; int index=0;
	while(temp.next!=null) {
		temp=temp.next;
		if(temp.not>=enyukseknot) {
			enyukseknot = temp.not;
			enyuksekindex = index;
		}
		index++;
	}
	Ogrenci temp1 = head;
	for(int i=0; i<=enyuksekindex; i++) {
		temp1 = temp1.next;
	}
	System.out.println("en yuksek not alan : " + temp1.not + " notu ile " + temp1.ad);
}

}
