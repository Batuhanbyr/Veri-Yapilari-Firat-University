package Queues;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		// FIFO First İn First Out
		
		queue.offer("Karen"); // adding add() offer()
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		queue.add("meltem"); // u can add like this
		
		
		System.out.println(queue.peek()); // first in first out ! don't forget
		queue.poll(); // removes head DON'T CAUSE ANY EXCCEPTİON!
		queue.remove(); // removes head
		
		
		System.out.println(queue.element()); // its like peek but throws an exception
		System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Harold")); // if it's have true, is not false
        System.out.println(queue.size()); // length
	}

}
