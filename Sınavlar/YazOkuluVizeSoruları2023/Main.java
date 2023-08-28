package YazOkuluVizeSoruları2023;

public class Main {

	public static void main(String[] args) {
		
		//  ✮✦ VERİ YAPILARI DERSİ, YAZ OKULU VİZE SINAV SORULARI 2023  ✮✦
		
		// COLLECTİONS KULLANILMASI YASAKTIR!
		
		/*1-) 20 öğrenciye ait ad ve veri yapıları notu tek yönli bağlı listede tutulmak isteniyor.
              Liste yapısı oluşturarak, en yüksek notu alan öğrencinin ad ve veri yapıları notunu ekrana yazan programı yazınız.
              (40 puan)
          */
		
		Ogrenciler ogr = new Ogrenciler();
		
		ogr.ekle("ali", 10);
		ogr.ekle("veli", 50);
		ogr.ekle("mert", 30);
		ogr.ekle("nazli", 70);
		ogr.ekle("naz", 90);
		ogr.ekle("ömer", 13);
		ogr.ekle("hilmi", 34);
		ogr.ekle("deniz", 100);
		
		ogr.enYuksekBul();
		
		
		/*2-)Çift yönlü dairesel Liste nedir? kullanım alanına örnek vererek 20 elemanlı çift yönlü dairesel listeyi
		     oluşturan kodları veriniz.
             (40 puan)
             
             ************
           Çift yönlü dairesel liste, veri yapılarından biridir ve çift yönlü bağlı listelerin bir türevidir.
           Bu liste türünde her bir eleman, hem bir önceki hem de bir sonraki elemana işaret eden iki bağa sahiptir.
           Listenin son elemanı, ilk elemana bağlıdır, böylece liste dairesel bir şekilde tamamlanmış olur.
           
           Kullanım alanları;
           1- Oyun Programlaması
           2- Metin Düzenleme ve Dizgi İşleme
           3- Müzik Çalma Listeleri
           4- Veri Saklama
           5- Animasyon Yönetimi
         */
		
		CıftYonluListe liste = new CıftYonluListe();
		
		for(int i=0; i<20; i++) { // 20 elemanı listeye ekliyoruz
			liste.ekle(i);
		}
		
		liste.bastır();
		
		/*3-) Kuyruk, yığıt ve ağaç yapıları bilgisayarda hangi alanda kullanılır?
		 *    Açıklayınız (20 puan)
		 *    
		 *    Kuyruk;
		 *    1- işletim sistemlerinde (process managibg)
		 *    2- bilgisayların portlarında olan işlemler
		 *    3- yazıcılar
		 *    
		 *    Yığıt;
		 *    1- (postfix,prefix)
		 *    2- divide and conquer algoritması
		 *    3- internet tarayıcıları geri tuşu
		 *    4- recursive 
		 *    5- polish notation
		 *    
		 *    Ağaç;
		 *    1- veri tabanları
		 *    2- en kısa yol bulma algitmaları (Dijakstra algoritması vb.) 
		 *    3- hiyerarşik veri yapılarında
         */
	}

}
