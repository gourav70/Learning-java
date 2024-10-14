package collection;


	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public int hashCode() {
	        int result = 17; // Start with a non-zero constant
	        result = 31 * result + name.hashCode(); // Use prime number 31
	        result = 31 * result + age;
	        return result;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Person person = (Person) o;
	        return age == person.age && name.equals(person.name);
	    }

	    public static void main(String[] args) {
	        Person p1 = new Person("Alice", 25);
	        Person p2 = new Person("Alice", 25);

	        System.out.println(p1.hashCode());
	        System.out.println(p2.hashCode());
	    }
	}


