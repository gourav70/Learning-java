package Learning_queue;


	import java.util.LinkedList;
	import java.util.Queue;
	
	public class queue_2 {
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        
	        queue.add("Element 1");
	        queue.add("Element 2");
	        queue.add("Element 3");

	        
	        System.out.println("Queue: " + queue);

	        
	        String removed = queue.remove();
	        System.out.println("Removed: " + removed);

	        
	        String peeked = queue.peek();
	        System.out.println("Front element: " + peeked);

	        
	        System.out.println("Queue after removal: " + queue);
	    }
	}


