package objectoriented;


	class Counter {
	    private int count = 0;

	    // Synchronized method to prevent race conditions
	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }
	}

	public class multithread3 {
	    public static void main(String[] args) throws InterruptedException {
	        Counter counter = new Counter();

	        // Creating two threads
	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        });

	        // Start threads
	        t1.start();
	        t2.start();

	        // Wait for threads to finish
	        t1.join();
	        t2.join();

	        // Output the final count
	        System.out.println("Final Count: " + counter.getCount());
	    }
	}


