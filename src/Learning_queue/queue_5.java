package Learning_queue;


	import java.util.ArrayDeque;
	import java.util.Deque;

	public class queue_5 {
	    public static void main(String[] args) {
	        Deque<String> deque = new ArrayDeque<>();
	        deque.add("A");
	        deque.add("B");
	        deque.add("C");

	        // Convert to an array
	        String[] array = deque.toArray(new String[0]);

	        // Print the array
	        System.out.println("Array: ");
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	}


