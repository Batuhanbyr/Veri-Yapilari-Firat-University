package GenelSınavÖncesiSorular2023YazOkulu;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
	
		//                             _Genel Sınav Öncesi Hocanın Sorduğu Sorular 2023 YAZ OKULU_
		
	     // ___________________________________1.SORU_______________________________
		/* 40 kişilik bir iş yerinde çalışanların mesai ve ücretleri tayin ediliyor. Bu iş yerindeki çalışma saatine göre en yüksek
		 * ücreti alan ve en düşük ücreti alan çalışanın tespit edilmesi için Tek Yönlü Listeyi kullanarak bu iki kişiyi listeden çıkarınız.
		 * b-) aynı iş yerindeki ayın çalışanı kişisini listenin başına ekleyiniz. 
		 * NOT : ayın çalışanı o ayın içinde en fazla mesaiye devam eden kişidir. 
		 * */
		
		/*tekYönlüListe1 liste1 = new tekYönlüListe1();
		
		
		liste1.ekle(5, 20); // 40 tanesini for içinde ekleyebilirsiniz
		liste1.ekle(1, 200);
		liste1.ekle(4, 20);
		liste1.ekle(40, 10);
		liste1.ekle(2, 20);
		liste1.ekle(1, 2000);
		liste1.ekle(2, 3000000);
		
		System.out.println("*********");
		liste1.print();
		int enbuyuk = liste1.EnbüyükBul();
		int enkucuk = liste1.EnkücükBul();
		System.out.println("*********");
		System.out.println(enbuyuk);
		System.out.println("*********");
		System.out.println(enkucuk);
		
		liste1.Sil(enbuyuk);
		liste1.Sil(enkucuk);
		System.out.println("*********");
		liste1.print(); */
		
        //_______________________________2.SORU_______________________________
	    /* Bir işletim sisteminde 20 tane process çalıştırmak isteniyor her bir process'in gerektirdiği CPU zamanı bellidir.
	     * 0,1 milisaniye aralıklarla bütün processlerin bitmesi için ne kadarlık bir döngü gerekecektir. Bu işlemleri iki yönlü
		 * dairesel liste kullanarak gerçekleştiriniz.
		 * NOT : CPU zamanı, isteği biten processler dairesel listeden çıkarılacaktır.
		 * */
		
		/*System.out.println("*********2.soru*********");
		 DaireselListe2 liste2 = new DaireselListe2();
		 liste2.ekle(50);
		 liste2.ekle(7);
		 liste2.ekle(9);
		 liste2.ekle(10);
		 liste2.ekle(6);
		 liste2.print();*/
	        
		//_______________________________3.SORU_______________________________
	    /* Bir sınıfta hocasıyla birlikte toplam 40 kişi bulunmaktadır. Bu sınıftaki anlatılan derse göre tek yönlü liste yapısını 
	     * modelleyiniz. 
	     * NOT : Hocanın ve öğrencinin yapması gereken, bilinmesi gerekenleri tarif ediniz.
	     * (Soruda istenen açıkça ifade edilmemiş, bu nedenle çözüm görecelidir)
		 * */
		
		/*System.out.println("*********3.soru*********");
		SınıfListe kimyasınıflistesi = new SınıfListe();
		kimyasınıflistesi.ekle("ogretmen","veli", "ders anlatmak");
		kimyasınıflistesi.ekle("ogrenci","hasan", "sunum yapmak");
		kimyasınıflistesi.ekle("ogretmen","ayse", "odev yapmak");
		kimyasınıflistesi.print();*/
		
		//_______________________________4,5,6,7,8.SORU_______________________________
	    /* (SORULAR VE ÇÖZÜMLERİ README'DE AÇIKLANMIŞTIR)
		 * */
		
		//_______________________________9.SORU_______________________________
		/* ATM'de para çeken 10 kişi bulunmaktadır. Her birinin işlem süresi birbirinden farklıdır yeni bir kişinin gelmediği
		 * kabul edilerek bu kuyruktaki kişilerin işlemlerini bitirmesini sağlayınız.
		 * NOT : Bir kişi modellenirken kişinin çektiği para miktarı ve işlem süresi göz önüne alınacaktır. Bu işlem için Thread kullanınız.
		 * */
		
		/*System.out.println("*********6.soru*********");
		AtmKuyruk atm = new AtmKuyruk();
		atm.Ekle(100, 10);
		atm.Ekle(200, 20);
		atm.Ekle(50, 5);
		atm.ParalarCekilsin();*/	
		
		//_______________________________10.SORU_______________________________
        /* Bahçede 10 metrelik kuyu kazılıyor fakat kuyudan su çıkmıyor. Kuyunun kapatılma işlemini ve dolgu malzemesini stack 
         * kullanarak modelleyiniz. 
         * NOT : Kuyunun içindeki malzemeler bir sonraki çalışma için tekrar kullanılacaktır.
         * Malzemelerin derinliğini kendiniz seçiniz. 
         * (HAYATIMDA GÖRDÜĞÜM EN MANTIKLI SORU OLDUĞU İÇİN YİNE GÖRECELİ ÇÖZMEK ZORUNDA KALIYORUM)
	     * */
		/*System.out.println("*********10.soru*********");
		KuyuStack kuyu = new KuyuStack();
		kuyu.ekle(12);
		kuyu.ekle(13);
		kuyu.ekle(14);
		kuyu.ekle(15);
		kuyu.ekle(16);
		
		System.out.println("Kuyu bosaltmadan once...");
		kuyu.print(); // kuyu boşaltmadan önce
		
		int dizi[] = kuyu.KuyuBosalt();
		System.out.println("Kuyu bosaltdiktan sonra...");
		kuyu.print();
		
		for(int i: dizi) { // foreach ile dizideki elemanları bastırıyoruz
			System.out.println(i);
		}*/
		
		
		//_______________________________11.SORU_______________________________
        /* Yan Yana kazılmış 5 adet çukur bulunmaktadır. En öndeki çukurdan itibaren içerisindeki malzemeleri alıp tek yönlü
         * listeye yerleştiren programı yazınız.
         * (Collection kullanmak yasaktır!)
	     * */
	
		/*System.out.println("*********11.soru*********");
		Stack11 yığın1 = new Stack11();
		Stack11 yığın2 = new Stack11();
		Stack11 yığın3 = new Stack11();
		Stack11 yığın4 = new Stack11();
		Stack11 yığın5 = new Stack11(); 	
		yığın1.ekle(1);
		yığın1.ekle(2);
		yığın1.ekle(3); 
		
		yığın2.ekle(4);
		yığın2.ekle(5);
		yığın2.ekle(6);
		
		yığın3.ekle(7);
		yığın3.ekle(8);
		yığın3.ekle(9);
		
		yığın4.ekle(10);
		yığın4.ekle(11);
		yığın4.ekle(12);
		
		yığın5.ekle(13);
		yığın5.ekle(14);
		yığın5.ekle(15);		
		
		Queue11 kuyruk = new Queue11();
		kuyruk.ekle(yığın1);
		kuyruk.ekle(yığın2);
		kuyruk.ekle(yığın3);
		kuyruk.ekle(yığın4);
		kuyruk.ekle(yığın5);
		
		List11 liste = new List11();
		kuyruk.listeyekoy(liste);
		System.out.print("Liste: ");
		liste.print();*/
		
		
	}	
}
