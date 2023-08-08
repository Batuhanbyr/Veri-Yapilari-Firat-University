package DiziİleQueue;

public class Main {

	public static void main(String[] args) {
	
		// Create a queue of capacity 4
        Queue q = new Queue(4);
 
        // print Queue elements
        q.queueDisplay();
 
        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        
        q.queueDisplay();
        System.out.println(" ");
       
        q.queueDequeue();
        q.queueDisplay();
        System.out.println(" ");
        System.out.println(q.queue[0]);
        
        q.queueDequeue();
        q.queueDisplay();
        System.out.println(" ");
        System.out.println(q.queue[0]);
        
        
        q.queueEnqueue(40);
        q.queueEnqueue(50);
        q.queueEnqueue(60);
        q.queueEnqueue(70);
        System.out.println(" ");
        q.queueDisplay();
        q.queueEnqueue(80);
        
      //  q.queueEnqueue(40);
       // q.queueEnqueue(50);
 
        // print Queue elements
      //  q.queueDisplay();
 
        // insert element in the queue
      //  q.queueEnqueue(60);
 
        // print Queue elements
      //  q.queueDisplay();
 
     //   q.queueDequeue();
    //    q.queueDequeue();
    //    System.out.printf(
   //         "\n\nafter two node deletion\n\n");
 
        // print Queue elements
    //    q.queueDisplay();
 
        // print front of the queue
    //    q.queueFront();

	}

}
