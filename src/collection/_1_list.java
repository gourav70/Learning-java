package collection;


	import java.util.List;
	import java.util.ArrayList;

	public class _1_list {	    
	    public static void printList(List<? extends Number> list) {
	        for (Number n : list) {
	            System.out.print(n + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // List of integers
	        List<Integer> intList = new ArrayList<>();
	        intList.add(10);
	        intList.add(20);
	        intList.add(30);
	        printList(intList); // OK because Integer extends Number

	        // List of doubles
	        List<Double> doubleList = new ArrayList<>();
	        doubleList.add(10.5);
	        doubleList.add(20.5);
	        doubleList.add(30.5);
	        printList(doubleList); // OK because Double extends Number
	    }
	    }


