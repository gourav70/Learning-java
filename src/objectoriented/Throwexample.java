package objectoriented;

public class Throwexample {

	public static void checkAge(int age) throws Exception {
		
		if(age < 18) {
			
			throw new Exception("Age must be 18 or older.");
			
			
		} else {
			System.out.println("Access granted - You are old enough!");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			
			checkAge(16);
		}
		catch(Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
		}
		
		
		
		
		
	}
	
	
	
	
}
