package TekYonluBaglıListeler;

public class Uygulama {

	public static void main(String[] args) {
		ListeYapisi A = new ListeYapisi();
		
		A.BasaEkle(10);
		A.BasaEkle(231);
		A.BasaEkle(34);
		A.SonaEkle(24);
		A.SonaEkle(100);
		A.SonaEkle(101);
		A.SonaEkle(102);
		A.ArayaEkle(3, 6);
		//System.out.println(A.head.data);
		//System.out.println(A.tail.data);
		
		A.Yazdır();
	}

}
