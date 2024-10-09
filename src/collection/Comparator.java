package collection;


	import java.util.ArrayList;
	import java.util.Collections;

	// Book class implements Comparable interface
	class Book implements Comparable<Book> {
	    private String title;
	    private int price;

	    // Constructor
	    public Book(String title, int price) {
	        this.title = title;
	        this.price = price;
	    }

	    // Implementing the compareTo() method to compare books by price
	    @Override
	    public int compareTo(Book other) {
	        return this.price - other.price; // Ascending order by price
	    }

	    // Overriding toString method to display book details
	    @Override
	    public String toString() {
	        return title + " - $" + price;
	    }
	}

	public class Comparator {
	    public static void main(String[] args) {
	        // Create a list of books
	        ArrayList<Book> books = new ArrayList<>();
	        books.add(new Book("Java Basics", 40));
	        books.add(new Book("Advanced Java", 60));
	        books.add(new Book("Data Structures", 30));

	        // Sort the books by price using Comparable
	        Collections.sort(books);

	        // Print sorted book list
	        System.out.println("Books sorted by price:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	}


