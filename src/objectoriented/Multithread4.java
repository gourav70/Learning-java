package objectoriented;


class SharedResource{
	private int value;
	private boolean available = false;
	
	public synchronized void produce(int value) throws InterruptedException{
		
		while(available) {
			wait();
		}
		
		this.value = value;
		available = true;
		System.out.println("Produced: " + value);
		
		notify();	
		
	}
	
	public synchronized void consume() throws InterruptedException {
		
		while(!available) {
			wait();
		}
		
		System.out.println("Consumed " +value);
		available = false;
		
		notify();
	}
	
}

public class Multithread4 {
	public static void main(String[] args) {
		
		SharedResource resource = new SharedResource();
		
		Thread producerThread = new Thread(() -> {
			
			try {
				for(int i =1; i<=5; i++) {
					resource.produce(i);
                    Thread.sleep(1000);  // Simulate some delay in production
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
				
			
			
			
		});
		
		
		Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                    Thread.sleep(1500);  // Simulate some delay in consumption
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }

		
		
		
		
	}


