package DugumOlusturma;
import java.util.*;

public class Ana {
 public static void main(String[] args) {
	 
	 Sınıf A; // null bellekte yer kaplamaz
	 A = new Sınıf(); // içine değer atandı (bellekte yer gösterir)
	 Sınıf B = new Sınıf(); // ikinci nesenmi oluşturdum
	 Sınıf C = new Sınıf(); // üçüncü nesenmi oluşturdum 
	 
	 A.sayı = 10; // nesne1'in sayı değişkeni değiştirildi 
	 B.sayı = 22; // nesne2'in sayı değişkeni değiştirildi 
	 C.sayı = 33; // nesne3'in sayı değişkeni değiştirildi 
	 
	 System.out.println(A.sayı);
	 System.out.println(B.sayı);
	 System.out.println(C.sayı);
	 
	 A.next=B; // A'nın düğümünü B'ye bağladım
	 B.next=C;
	 C.next=null; // bunu belirtmek zorundayım yoksa next'i açıkta kalır
	 
	 System.out.println(A.next.isim); // A'nın nextinin b olduğunu göstermek istiyorum 
	 System.out.println(A.next.sayı); // A'nın nextinin b olduğunu göstermek istiyorum 
	 
	 Sınıf temp = A; // geçici değişken (ref ve temp arasındaki farkı araştır!)
	 
	 while(temp!=null) { //travers işlemi (düğüm üzerinde dolaşma işlemi)
		 System.out.println(temp.sayı);
		 temp=temp.next;
	 }
 }
}
