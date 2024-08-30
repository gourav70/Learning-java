package learning_array;


	import java.util.ArrayList;

	public class _2_arr{
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        // Using a for loop
	        System.out.println("Using for loop:");
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }

	        // Using an enhanced for loop
	        System.out.println("Using for-each loop:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
	}


