package objectoriented;


	// Abstract class
	abstract class Animal {
	    // Abstract method (does not have a body)
	    public abstract void sound();

	    // Regular method
	    public void sleep() {
	        System.out.println("The animal is sleeping.");
	    }
	}

	// Subclass that extends Animal and provides the implementation for the abstract method
	class Dog extends Animal {
	    // Implementing the abstract method
	    @Override
	    public void sound() {
	        System.out.println("The dog barks.");
	    }
	}

	public class Abstractexample {
	    public static void main(String[] args) {
	        // Animal a = new Animal(); // This would give an error, as Animal is abstract
	        Animal myDog = new Dog(); // Creating a Dog object (which is a subclass of Animal)
	        
	        myDog.sound(); // Output: The dog barks.
	        myDog.sleep(); // Output: The animal is sleeping.
	    }
	}





