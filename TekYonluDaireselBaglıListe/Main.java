package TekYonluDaireselBaglıListe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    BaglıListe liste = new BaglıListe();
    
    liste.BasaEkle(1);
    liste.SonaEkle(2);
    liste.SonaEkle(3);
    liste.BasaEkle(0);
    
    
    liste.Yazdır(liste);
    
    //liste.OrtayaEkle(5, 55);
    //liste.SondanSilme();
    liste.OrtadanSilme(3);
    
    System.out.println(" ");
    liste.Yazdır(liste);
	}

}
