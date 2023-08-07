package BaglıListeİleStackler;
public class BaglıListeliStack {

	Node top;
	Node bottom;
	
	void push(int data) {
		Node eleman = new Node(data);
		if(top==null) {
			top = eleman;
			bottom = eleman;
			System.out.println("push : " + top.data);
			top.next = null;
		}else {
			eleman.next = top;
			top = eleman;
			System.out.println("push : " + top.data);
		}
	}
	
	
	void pop() {
		if(top==null) {
			System.out.println("stack bos");
		}else if(top.next==null){
			top = null;
			bottom = null;
			System.out.println("stackdaki son eleman da silindi");
		}
		else {
			Node temp = top;
			while(temp.next!=bottom) {
				temp = temp.next;
			}
			bottom = temp;
			bottom.next = null;
		}
	}
	
	void print() {
		Node temp = top;
		if(temp==null) {
			System.out.println("stack bos");
		}else {
		System.out.print("stack : " + temp.data);
		while(temp.next!=null) {
		temp = temp.next;
		System.out.print("->" + temp.data);
		}}
	}
}
