package ÇiftYonluDaireselBaglıListeler;

public class Main {

	public static void main(String[] args) {
		BaglıListe liste = new BaglıListe();

		liste.BasaEkle(1);
		liste.BasaEkle(2);
		liste.BasaEkle(3);
		
		liste.SonaEkle(5);
		
		liste.OrtayaEkle(2, 0);
		
		//liste.OrtadanSilme(2);
		//liste.BastanSilme();
		//liste.SondanSilme();
		
		//liste.OrtadanSilme(5);
		
		
		liste.Yazdır(liste);

	}

}
