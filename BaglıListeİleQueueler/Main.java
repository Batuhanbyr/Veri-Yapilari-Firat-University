package BaglıListeİleQueueler;

public class Main {

	public static void main(String[] args) {
		BaglıListeliQueue kuyruk = new BaglıListeliQueue();
		
		kuyruk.push(1);
		kuyruk.push(11);
		kuyruk.push(12);
		kuyruk.push(13);
		
		kuyruk.print();
		System.out.println(" ");
		
		kuyruk.pop();
		kuyruk.pop();
		kuyruk.pop();
		kuyruk.pop();
		
		//kuyruk.pop();
		
		kuyruk.push(1);
		kuyruk.push(11);
		kuyruk.push(12);
		
		kuyruk.print();
		System.out.println(" ");
		
//		System.out.println(kuyruk.top.data);
//		System.out.println(kuyruk.bottom.data);
//		System.out.println(kuyruk.bottom.next.data);
	}

}
