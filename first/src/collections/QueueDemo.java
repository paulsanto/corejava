package collections;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {
	
	public static void main(String args[]) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		
		System.out.println("Original Queue is : " + queue);
		
		queue.remove();
		System.out.println("Queue after removing the head element: " + queue);
		
		String head = queue.peek();
		System.out.println("Head of the queue is: " + head);
		
		head = queue.poll();
		System.out.println("Remove head: " + head);
		
		System.out.println("Queue now looks like this: " + queue);
		
		
	}

}
