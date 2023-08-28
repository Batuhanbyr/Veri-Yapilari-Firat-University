package PriorityQueues;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// FIFO First in First out data structures that server element
		//                         with the highest priorities first
		//                         before elements with lower priority

			Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
			//Coolections.reverseorder() it'S really important!
			
		queue.offer(1.2);
		queue.offer(2.2);
		queue.offer(3.2);
		queue.offer(4.2);
		queue.offer(0.2);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
