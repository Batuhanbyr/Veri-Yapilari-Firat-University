package Hoca1SınavOnceSoruları;

public class Ogrenciler {

Ogrenci head;
Ogrenci tail;

void ekle(String ad, String soyad, String memleket, int not) {
	
	Ogrenci eklenecekOgr = new Ogrenci(ad,soyad,memleket,not);
	
	if(head==null) {
		head = eklenecekOgr;
		head.next = null;
		head.prev = null;
		tail = eklenecekOgr;
		tail.next = null;
		tail.prev = null;
		
	}else {
		Ogrenci temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		eklenecekOgr.prev = temp;
		temp.next = eklenecekOgr;
		tail = eklenecekOgr;
		tail.next = null;
	}
}


void enYuksekNot() {
	Ogrenci temp = head;
	int x = temp.not;
	int i = 0;
	int index = 0;
	while(temp.next!=null) {
		temp = temp.next;
		i++;
		if(x<temp.not) {
			i++;
			index = i;
			x = temp.not;
		}
	}
	System.out.println("en yuksek not : " + x);
	System.out.println("en yuksek notun sirasi  : " + index);
	
	if(index == 0) {
		System.out.println("zaten başta bir işlem yapmaya gerek yok... ");
	}else {
	Ogrenci temp2 = head;
	for(int j=0; j<index-1; j++) {
	 temp2 = temp2.next;
	}

	if(temp2.next==null) { // sonda ise
		
		Ogrenci basaekle = temp2;
		temp2.next = head;
		head = temp2;		
		Ogrenci temp3 = head;
		while(temp3.next!=tail) {
			temp3 = temp3.next;
		}
		tail = null;
		tail = temp3;
		tail.next = null;
		
	}else { // ortada ise
		Ogrenci eklenecek = temp2;		
		Ogrenci tempp1 = head;
		Ogrenci tempp2 = head;
		while(tempp1.next!=temp2) {
			tempp1 = tempp1.next;
			tempp2 = tempp2.next;
		}
		tempp2 = temp2.next;
		tempp2 = temp2.next;
		
		tempp1.next = tempp2;
		tempp2.prev = tempp1;
		
		eklenecek.next = head;
		head = eklenecek;
		
	
		
	}
	
	}
	
	
}
void yazdır() {
	Ogrenci temp = head;
	System.out.println("-> " + temp.ad);
	while(temp.next!=null) {
		temp = temp.next;
	System.out.println("-> " + temp.ad);	
	}
}
	
}
