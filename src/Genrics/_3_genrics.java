package Genrics;


	// Generic class
	class Box<T> {
	    // T stands for "Type" and can be replaced with any object type
	    private T value;

	    public void setValue(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }
	}

	public class _3_genrics {
	    public static void main(String[] args) {
	        // Creating a Box object for Integer
	        Box<Integer> integerBox = new Box<>();
	        integerBox.setValue(123);
	        System.out.println("Integer Value: " + integerBox.getValue());

	        // Creating a Box object for String
	        Box<String> stringBox = new Box<>();
	        stringBox.setValue("Hello, Generics!");
	        System.out.println("String Value: " + stringBox.getValue());

	        // Creating a Box object for Double
	        Box<Double> doubleBox = new Box<>();
	        doubleBox.setValue(99.99);
	        System.out.println("Double Value: " + doubleBox.getValue());
	    }
	}


