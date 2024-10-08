package objectoriented;


	class MyThread extends Thread {
	    @Override public void run()
	    {
	        for (int i = 0; i < 10; i++)
	            System.out.println("child thread");
	    }
	}
	

	public class Multithread {
	    public static void main(String... args)
	    {
	        MyThread t = new MyThread(); // Thread instantiation
	        t.start(); // starting a thread
	        // At this line 2 threads are there
	        for (int i = 1; i <= 5; i++)
	            System.out.println("Main Thread");
	    }
	}


