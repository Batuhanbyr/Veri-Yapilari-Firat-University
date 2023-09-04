package YazOkuluFinavSoruları2023;

public class Main {

	public static void main(String[] args) {
		// ****************************** YAZ OKUL VERİ YAPILARI 2023 SINAV SORULARI ******************************
		
		//  SORU 1
		// 40 düğüm bir iki yönlü dairesel bir liste oluşturarak 20. düğümü dairesel listeden çıkaran programı yazınız.
		 
		İkiliDaireselListe liste = new İkiliDaireselListe();
		for(int i=1; i<41; i++) {
			liste.ekle(i);
		}
		
		System.out.println("*********1.Soru*********");
		liste.print();
		liste.çıkar();
		System.out.println(" ");
		liste.print();

		// DİĞER SORULAR README'DE AÇIKLANMIŞTIR
		
	}

}
