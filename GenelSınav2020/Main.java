package GenelSınav2020;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		
		 //****************************************2. SORU****************************************
		/*Liste L1 = new Liste();
		Liste L2 = new Liste();
		
		L1.linkedlist.add(1);
		L1.linkedlist.add(12);
		L2.linkedlist.add(9);
		L2.linkedlist.add(6);
		
		Liste_birleştir(L1,L2);*/
		
		
		 //****************************************6. SORU****************************************
	/*LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	
	addNumsLinkedList(linkedlist);
	System.out.println("bagliliste: " + linkedlist);*/
		
		//****************************************7. SORU****************************************
	/*Stack<Integer> stack = new Stack<Integer>();
		
	stack.add(9);
	stack.add(1);
	stack.add(9);
	stack.add(2);
	stack.add(3);
	stack.add(9);
	stack.add(4);
	stack.add(9);
	stack.add(9);
	
	System.out.println("bagliyigit once : " + stack);
	hepsini_Sil(stack,9);
	System.out.println("bagliyigit sonra : " + stack);*/
	
	}
			//****************************************2. SORU****************************************
			/*  Elinde tam sayıları tutan iki addet sıralı bağlı liste olduğu varsayımaktadır. Bu iki bağlı 
			 *  sıralı birleştirip listeyi döndüren bir public Liste_birleştir(Liste L1, Liste L2){} metodunu yazınız.
			 *  !SORU AÇIK BELİRTİLMEMİŞ, BU NEDENLE ÇÖZÜM KESİN OLMAYABİLİR!
			 * */
	
	public static void Liste_birleştir(Liste L1,Liste L2) {
		Liste L3 = new Liste();
		L3.linkedlist = L1.linkedlist;
		L3.linkedlist.addAll(L2.linkedlist);
		System.out.println(L3.linkedlist);
	}
	
	
	        //****************************************6. SORU****************************************
			/*  1 ile 100 arasında rastgele üretilen 20 adet sayıyı bir bağlı listeye ekleyen ve ekleme yaparken
			 *  Rastegele üretilen sayı eğer bağlı listede var ise bu sayı bağlı listeye eklemeyerek yeni bir sayı 
			 *  üretilmesini sağlayan programı yazınız.
			 * */
	
	public static void addNumsLinkedList(LinkedList<Integer> list) {
	     for(int i=0; i<20; i++) {
		 int randomNum = (int)((Math.random() * 100)+1); // 1 ve 100 arasında numara 
		 list.add(randomNum);
	     }		
	}
	
			//****************************************7. SORU****************************************
			/*  Bir bağlı yığıt veri yapısında bulunan elemanlardan verilen bir parametrenin değerine eşit olan tüm elemanları 
			 *  silerek yığıtın yeni halini döndüren hepsini_sil() isimli bir metot yazınız. Örneğin {9,1,9,2,3,9,4,9,9} elemanlarını 
			 *  içeren bir yığıt için 9 elemanı parametre olarak verilerek hepsini_sil(9) metodu çağrıldığında {1,2,3,4} elemanlarını 
			 *  içeren bir yığıt geri döndürülecektir. 
			 *  Not : Bu metodu yazarken başka bir veri yapısı tanımlanmayaccaktır(başka bir yığıt,bağlı liste veya kuyruk vb.)
			 * 
			 * */
	
	public static void hepsini_Sil(Stack<Integer> stack, int k) {
	    for (int i = stack.size() - 1; i >= 0; i--) {
	        if (stack.get(i) == k) {
	            stack.remove(i);
	        }
	    }
	}

}