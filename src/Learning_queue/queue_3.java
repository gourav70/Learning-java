package Learning_queue;


	import java.util.Queue;
	import java.util.Stack;

	public class queue_3 {
	    public static Queue<Integer> rev(Queue<Integer> q) {
	        // Create a stack to hold the elements of the queue
	        Stack<Integer> stack = new Stack<>();
	        
	        // Dequeue all elements from the queue and push them onto the stack
	        while (!q.isEmpty()) {
	            stack.push(q.poll());
	        }
	        
	        // Pop elements from the stack and enqueue them back into the queue
	        while (!stack.isEmpty()) {
	            q.add(stack.pop());
	        }
	        
	        // Return the reversed queue
	        return q;
	    }
	}


