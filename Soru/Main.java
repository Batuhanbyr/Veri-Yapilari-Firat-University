package Soru;
import java.util.*;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<String>();
		
		// adding customers
		queue.add("1.customer");
		queue.add("2.customer");
		queue.add("3.customer");
		queue.add("4.customer");
		queue.add("5.customer");
		queue.add("6.customer");
		queue.add("7.customer");
		queue.add("8.customer");
		queue.add("9.customer");
		queue.add("10.customer");
		
		LocalTime myObj1 = LocalTime.now();
		İşlem(queue);
		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj1);
		System.out.println("The process has occurred during this time....");
		System.out.println(myObj2);
	}
	
	
	public static void İşlem(Queue queue) {
		try {
			for(int i = 1; i<=10; i++) {
			System.out.println(queue.peek() + " Customer is being taken out...");
			queue.remove();
			System.out.println(" Customer has left...");
			Thread.sleep(1000); // we are waiting for 1 sec
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}

}
