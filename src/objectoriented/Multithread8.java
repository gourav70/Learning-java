package objectoriented;


	import java.util.concurrent.Callable;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;

	class CallableTask implements Callable<Integer> {
	    private int num;

	    public CallableTask(int num) {
	        this.num = num;
	    }

	    @Override
	    public Integer call() throws Exception {
	        return num * num;
	    }
	}

	public class Multithread8 {
		public static void main(String[] args) throws Exception {
	        ExecutorService executor = Executors.newFixedThreadPool(2);
	        Future<Integer> future1 = executor.submit(new CallableTask(5));
	        Future<Integer> future2 = executor.submit(new CallableTask(3));

	        System.out.println("Square of 5 is: " + future1.get());
	        System.out.println("Square of 3 is: " + future2.get());

	        executor.shutdown();
	    }
	}


