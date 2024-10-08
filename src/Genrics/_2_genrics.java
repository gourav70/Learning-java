package Genrics;


	// Java code to illustrate working
	// of Wildcards in Generics
	import java.util.*;

	// Parent class
	class Student
	{
	    void print()
	    {
	        System.out.println("Student");
	    }
	}

	// Descendant class of Student
	class EnggStudent extends Student
	{
	    void print()
	    {
	        System.out.println("EnggStudent");
	    }
	}

	// Descendant class of Student
	class MgmtStudent extends Student
	{
	    void print()
	    {
	        System.out.println("MgmtStudent");
	    }
	}

	public class _2_genrics {
	
	    /
	    static void printStudents(
	        ArrayList<? extends Student> al)
	    {
	        for (Student s: al)
	            s.print();
	    }
	    
	    // Main function 
	    public static void main (String[] args) {
	        // Creating ArrayList of EnggStudent
	        ArrayList<EnggStudent> al1 = new ArrayList<>();
	        
	        // Adding EnggStudent to al1
	        al1.add(new EnggStudent());
	        al1.add(new EnggStudent());
	        
	        // Creating ArrayList of MgmtStudent
	        ArrayList<MgmtStudent> al2 = new ArrayList<>();
	        
	        // Adding MgmtStudent to al2
	        al2.add(new MgmtStudent());
	        
	        // Calling the general purpose StringIndexOutOfBoundsException
	        printStudents(al1);
	        printStudents(al2);
	    }
	}


