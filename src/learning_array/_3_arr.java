package learning_array;


	import java.util.ArrayList;
	import java.util.Collections;

	public class _3_arr {
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(23);
	        numbers.add(4);
	        numbers.add(16);
	        numbers.add(42);
	        numbers.add(8);

	        // Find the maximum and minimum elements
	        int max = Collections.max(numbers);
	        int min = Collections.min(numbers);

	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	    }
	}


