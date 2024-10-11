package objectoriented;


	class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;  // Reference equality check
	        if (obj == null || getClass() != obj.getClass()) return false;  // Class type check

	        Person person = (Person) obj;
	        return age == person.age && name.equals(person.name);  // Content equality check
	    }
	}

	public class Equals {
	    public static void main(String[] args) {
	        Person p1 = new Person("Alice", 25);
	        Person p2 = new Person("Alice", 25);

	        if (p1.equals(p2)) {
	            System.out.println("p1 and p2 have the same content");
	        } else {
	            System.out.println("p1 and p2 have different content");
	        }
	    }
	}


