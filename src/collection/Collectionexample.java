package collection;



	import java.util.ArrayList;
	import java.util.Collection;

	public class Collectionexample {
	    public static void main(String[] args) {
	        Collection<String> program = new ArrayList<>();

	        // Adding elements
	        program.add("C");
	        program.add("C++");
	        program.add("Java");

	        // Checking size and if collection is empty
	        System.out.println("Number of programs: " + program.size());  // Output: 3
	        System.out.println("Is collection empty? " + program.isEmpty());  // Output: false

	        // Checking if an element is in the collection
	        System.out.println("Contains C? " + program.contains("C"));  // Output: true

	        // Removing an element
	        program.remove("C++");
	        System.out.println("Contains C? " + program.contains("C"));  // Output: false

	        // Iterating through the collection
	        for (String programs : program) {
	            System.out.println(program);
	        }
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	

