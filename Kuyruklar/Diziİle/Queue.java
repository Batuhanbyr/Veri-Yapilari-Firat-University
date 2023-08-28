package Diziİle;

public class Queue {
	int[] dizi;
	int index; // dizide nerde olduğum
	int cıkarma = 0; // cıkarma işleminde her zaman 0'ıncı indexi çıkarıyoruz
	
	public 	Queue(int deger) {
		this.dizi = new int[deger];
		this.index = 0;
	}
	
	void ekle(int deger) {
		if(index==0) {
			dizi[0] = deger;
			index++;
		}else if(index>=dizi.length) {
			System.out.println("Queue dolu bu nedenle eleman eklenemez!");
		}
		else {
			dizi[index] = deger;
			index++;	
		}
	}
	
	
	void cıkar() {
		System.out.println("ilk giren eleman cikarildi: " + dizi[cıkarma]);
		dizi[cıkarma] = 0;
		
		for(int i=0; i<index-1; i++) {
			dizi[i] = dizi[i+1];
		}
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
