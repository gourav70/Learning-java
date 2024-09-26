package objectoriented;

public class Finally {

	

	    // Method that declares it can throw an exception using 'throws'
	    public static void validateAge(int age) throws Exception {
	        if (age < 18) {
	            // Explicitly throwing an exception using 'throw'
	            throw new Exception("Age must be 18 or older.");
	        } else {
	            System.out.println("Access granted - You are old enough!");
	        }
	    
	    }
	    public static void main(String[] args) {
	        try {
	            // Calling the method that can throw an exception
	            validateAge(16);  // This will throw an exception because age is less than 18
	       

	        } catch (Exception e) {
	            // Catching the thrown exception
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            // Finally block will always be executed
	            System.out.println("This is the 'finally' block. It always runs.");
	        }

	        System.out.println("Program continues after handling the exception.");
	    }
	}
	
	
	
	
	
	
	

