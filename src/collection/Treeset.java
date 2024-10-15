package collection;



	import java.util.TreeSet;

	public class Treeset {
	    public static void main(String[] args) {
	        // Create a TreeSet of Integer
	        TreeSet<Integer> treeSet = new TreeSet<>();

	        // Add elements to the TreeSet
	        treeSet.add(10);
	        treeSet.add(20);
	        treeSet.add(30);
	        treeSet.add(10);  // Duplicate element

	        // Only unique elements are stored
	        System.out.println("TreeSet after adding duplicate 10: " + treeSet);
	    }
	}

	
	
	
	
	

