package BaglıListeİleQueueler;
import java.util.*;
public class BaglıListeliQueue {
	
Node top;
Node bottom;

/*                                                      son            ilk
 *  Burdaki kuyruk biraz farklıdır. (ilk giren eleman): ⓛ → ⓛ → ⓛ → ⓛ → ⓛ 
 *                                                      ↑                ↑
 *                                                      bottom          top
 * 
 * KUYRUK : FİRST İN FİRST OUT (FİFO) 
 * TOP : HER ZAMAN SON GİRENİ GÖSTERİR
 * BOTTOMM : HER ZAMAN İLK GİRENİ GÖSTERİR
 * */


public void push(int data) {
	Node eleman = new Node(data);
	if(top==null) {
		top = eleman;
		top.next = null;
		bottom = top;
	}else {
		top.next = eleman;
		top = top.next;
		top.next = null;
	}
}


public void pop() {
	if(bottom==null) {
		System.out.println("*Kuyruk bos*");
	}else if(bottom.next==null){
		bottom = null;
		top = bottom;
		System.out.println("kuyrukdaki son eleman da silindi");
	}
	else {
		Node temp = bottom;
		while(temp.next!=top) {
			temp = temp.next;
		}
		top = temp;
		top.next = null;
	}
}

public void print() {
	Node temp = bottom;
	Stack<Integer> stack = new Stack<Integer>(); // SIRF TERS GÖZÜKMESİN DÜZ DE GÖZÜKSÜN DİYE EKLİYORUZ 
	if(temp==null) {
		System.out.println("*Kuyruk bos*");
	}else {
	System.out.print("queue (bottom'dan baslatarak sayiyoruz bu nedenle ters) : " + temp.data);
	stack.add(temp.data);
	while(temp.next!=null) {
	temp = temp.next;
	System.out.print("<-" + temp.data);
	stack.add(temp.data);
	}
	Collections.reverse(stack);
	System.out.println(" ");
	System.out.println("duz hali : " + stack);}
}

}
