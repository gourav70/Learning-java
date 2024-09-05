package learning_array;

public class _4_arr {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 4, 45, 99};
	        
	        if (arr.length < 2) {
	            System.out.println("Invalid Input");
	            return;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int element : arr) {
	            if (element > largest) {
	                secondLargest = largest;
	                largest = element;
	            } else if (element > secondLargest && element != largest) {
	                secondLargest = element;
	            }
	        }

	        System.out.println("Second Largest Element: " + secondLargest);
	    }
	}


