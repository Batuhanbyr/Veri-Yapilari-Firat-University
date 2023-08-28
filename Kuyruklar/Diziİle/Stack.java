package Diziİle;

public class Stack {
int[] dizi;
int index; // dizide nerde olduğum


public Stack(int deger) {
	this.dizi = new int[deger];
	this.index = 0;
}

void ekle(int deger) {
	if(index==0) {
		dizi[0] = deger;
		index++;
	}else if(index>=dizi.length) {
		System.out.println("Stack dolu bu nedenle eleman eklenemez!");
	}
	else {
		dizi[index] = deger;
		index++;	
	}
}

void cıkar() {
	System.out.println("Son giren eleman cikarildi: " + dizi[index-1]);
	dizi[index-1] = 0;
	index--;
}


void bastır() {
	for(int i=0; i<index; i++) {
		System.out.print("->" + dizi[i]);
	}
	System.out.println(" ");
}

}
