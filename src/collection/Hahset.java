package collection;


	import java.util.HashSet;
	import java.util.Iterator;

	public class Hahset {
	    public static void main(String[] args) {
	        // Create a HashSet of Integers
	        HashSet<Integer> numbers = new HashSet<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        // Obtain an Iterator for the HashSet
	        Iterator<Integer> iterator = numbers.iterator();

	        // Traverse the HashSet using the Iterator
	        System.out.println("Numbers in the HashSet:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Removing an element using Iterator
	        iterator = numbers.iterator(); // Resetting the iterator
	        while (iterator.hasNext()) {
	            Integer num = iterator.next();
	            if (num == 20) {
	                iterator.remove(); // Remove '20' from the HashSet
	            }
	        }

	        // Display the HashSet after removal
	        System.out.println("\nHashSet after removal:");
	        System.out.println(numbers);
	    }
	}


