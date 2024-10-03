package collection;


	import java.util.LinkedList;

	class Student {
	    String name;
	    int age;

	    // Constructor
	    Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // toString method for displaying student details
	    @Override
	    public String toString() {
	        return "Student{Name: " + name + ", Age: " + age + "}";
	    }
	}

	 public class Linkedlist {
	    public static void main(String[] args) {
	        // LinkedList of Student objects
	        LinkedList<Student> students = new LinkedList<>();

	        // Adding Student objects to the LinkedList
	        students.add(new Student("John", 20));
	        students.add(new Student("Alice", 22));

	        // Displaying the students
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}


