package collection;


	import java.util.LinkedHashSet;

	public class Linkedhashset {
	    public static void main(String[] args) {
	        // Creating two LinkedHashSets
	        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
	        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
	        
	        // Adding elements to set1
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        
	        // Adding elements to set2
	        set2.add(3);
	        set2.add(4);
	        set2.add(5);
	        set2.add(6);
	        
	        // Union of set1 and set2
	        LinkedHashSet<Integer> unionSet = new LinkedHashSet<>(set1);
	        unionSet.addAll(set2);
	        System.out.println("Union of set1 and set2: " + unionSet);
	        
	        // Intersection of set1 and set2
	        LinkedHashSet<Integer> intersectionSet = new LinkedHashSet<>(set1);
	        intersectionSet.retainAll(set2);
	        System.out.println("Intersection of set1 and set2: " + intersectionSet);
	    }
	}

}
