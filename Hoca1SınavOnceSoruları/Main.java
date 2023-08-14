package Hoca1SınavOnceSoruları;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// --------------------HOCANIN 1.SINAV ÖNCESİ SORDUĞU SORULAR--------------------
		
		/* 1-) Kuyruk ve Yığın bilgisayarda nerelde kullanılır?
		 * 
		 * Kuyruk -FIFO
		 * 1* Yazıcılarda (birden fazla yazdırma isteği kuyrukta tutulur)
		 * 2* Bilgisayarın portlarında (fiziksel)
		 * 3* İşletim sistemi kuyrukları (hafıza yönetmek, process managing)
		 * 
		 * Yığıt -LİFO
		 * 1* Yazılım tabanında kullanılır (recursive sistemler çalışırken hafızada tampon bellek şeklinde (buffer) yürütülür.
		 * 2* Algoritma (Divide and Conquer)
		 * 3* prefix, postfix, infix algoritmaları yığıt kullanır
		 * 
		 * */
		
		
		/* 2-) 20 elemanlı tek yönlü dairesel liste oluşturulmak isteniyor bu listede sayısal değeri 100'den büyük 
		 *  olanları alıp yeni bir bağlı liste oluşturunuz. 
		 * (bu soru ucuaçık bir soru yani nodeları söküp bu nodelarla mı oluşturmamızı istiyor bunu belirtmemiş
		 *  bu nedenle bende kolay yolu olan nodeları sökmeden başka bir node yarattım)
		 *  
		 * */
		
		DaireselBaglı liste = new DaireselBaglı();
		
		liste.ekle(1);
		liste.ekle(11);
		liste.ekle(12);
		liste.ekle(11);
		liste.ekle(1244);
		liste.ekle(124);
		liste.ekle(127);
		liste.ekle(222);
		
	    liste.yazdır();	
	    
	    System.out.println(" ");
	    System.out.println(liste.head.data);
	    
		liste.Ayıkla();
		System.out.println(liste.head2.data);
		liste.yazdır2();
		
		
		/*
		 * 3-) Bir sınıftaki öğrencilerin adını soyadını veri yapıları notunu ve memleket adresini tutan 
		 *  çift yönlü bir dairesel liste oluşturunuz. 
		 *  a) bu sınıftaki en yüksek not alan kişiyi listenin başına ekleyinizi.(çıkarıp ekleme işlemi)
		 * 
		 * 
		 * */
		 
		Ogrenciler ogr = new Ogrenciler();
		
		ogr.ekle("ALI", "CABBAR", "İZMİR", 101);
		ogr.ekle("AYSE", "CABBAR", "İZMİR", 12);
		ogr.ekle("NEJLA", "CABBAR", "İZMİR", 184);
		ogr.ekle("IREM", "CABBAR", "İZMİR", 1);
		ogr.ekle("IREM", "CABBAR", "İZMİR", 14);
		
		
		 System.out.println(" ");
		ogr.yazdır();
		System.out.println(" ");
		ogr.enYuksekNot();
		System.out.println(" ");
		ogr.yazdır();
	   }
	}
