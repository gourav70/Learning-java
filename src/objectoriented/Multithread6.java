package objectoriented;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	class WorkerThread implements Runnable {
	    private String message;

	    public WorkerThread(String s) {
	        this.message = s;
	    }

	    @Override
	    public void run() {
	        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
	        processMessage(); // simulate processing task
	        System.out.println(Thread.currentThread().getName() + " (End)");
	    }

	    private void processMessage() {
	        try {
	            Thread.sleep(2000); // Simulating a delay in task execution
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}

	public class Multithread6 {
		public static void main(String[] args) {
	        // Create a fixed thread pool with 3 threads
	        ExecutorService executor = Executors.newFixedThreadPool(3);
	        
	        // Submit 5 tasks to the thread pool
	        for (int i = 1; i <= 5; i++) {
	            Runnable worker = new WorkerThread("Task " + i);
	            executor.execute(worker);  // Submitting task for execution
	        }
	        
	        // Shut down the executor service
	        executor.shutdown();

	        while (!executor.isTerminated()) {
	            // Wait until all tasks are finished
	        }
	        System.out.println("All tasks are completed.");
	    }
	}


