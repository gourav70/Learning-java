package Learning_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class queue_6 {
public static void main(String args[])
{
	
	PriorityQueue<Integer> pq 
	= new PriorityQueue<Integer>(Collections.reverseOrder());
	
	pq.add(10);
	pq.add(20);
	pq.add(70);
	
	System.out.println(pq.poll());
	
	System.out.println(pq.peek());
	
	
	
	
	
	
	
}
	
	
	
	
}
