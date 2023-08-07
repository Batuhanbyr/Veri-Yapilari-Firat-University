package ÇiftYönlüBağlıListeler;

public class Main {

	public static void main(String[] args) {
		BağlıListe liste = new BağlıListe();
		liste.BasaEkle(2);
		//liste.BastanSil();
		liste.SonaEkle(3);
		liste.SonaEkle(4);
		liste.SonaEkle(5);
		liste.SonaEkle(6);
		liste.BasaEkle(66);
		liste.BasaEkle(6600);
		
		
		//liste.ArayaEkle(2, 456);
		
		//liste.ArayaEkle(1, 111);
		//liste.ArayaEkle(10, 777);
		
		//liste.ArayaEkle(5, 555);
		
		liste.Yazdır(liste);
		
		//liste.BastanSil();
		//liste.SondanSil();
		
		//liste.Yazdır(liste);

		liste.AradanSil(2);
		
		System.out.println(" ");
		liste.Yazdır(liste);
	}

}
