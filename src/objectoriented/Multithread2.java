package objectoriented;

	class MyThread extends Thread {
	    public void run() {
	        for (int i = 1; i <= 3; i++) {
	            System.out.println(i + " from " + Thread.currentThread().getName());
	            try {
	                Thread.sleep(1000); // Pause execution for 1 second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

	public class Multithread2 {
	    public static void main(String[] args) {
	        MyThread t1 = new MyThread();
	        MyThread t2 = new MyThread();
	        
	        t1.start();
	        t2.start();

	        try {
	            t1.join(); // Wait for t1 to finish
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	        
	        System.out.println("t1 has finished execution");
	    }
	}

	
	
	
	
	
	
	
	
	
	

