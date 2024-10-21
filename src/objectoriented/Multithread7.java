package objectoriented;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	class WorkerThread implements Runnable {
	    private String message;

	    public WorkerThread(String s) {
	        this.message = s;
	    }

	    public void run() {
	        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
	        processMessage();
	        System.out.println(Thread.currentThread().getName() + " (End)");
	    }

	    private void processMessage() {
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}

	public class Multithread7 {
		public static void main(String[] args) {
	        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 threads

	        for (int i = 1; i <= 5; i++) {
	            Runnable worker = new WorkerThread("Task " + i);
	            executor.execute(worker);  // Submitting task for execution
	        }

	        executor.shutdown();
	        while (!executor.isTerminated()) {
	        }
	        System.out.println("All threads are finished.");
	    }
	}


