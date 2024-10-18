package objectoriented;



	class PingPong {
	    private boolean pingTurn = true;

	    // Ping method
	    public synchronized void ping() throws InterruptedException {
	        while (!pingTurn) {
	            wait();  // Wait for pong to complete
	        }
	        System.out.println("Ping");
	        pingTurn = false;
	        notify();  // Notify pong to play
	    }

	    // Pong method
	    public synchronized void pong() throws InterruptedException {
	        while (pingTurn) {
	            wait();  // Wait for ping to complete
	        }
	        System.out.println("Pong");
	        pingTurn = true;
	        notify();  // Notify ping to play
	    }
	}

	public class Multithread5 {
		public static void main(String[] args) {
	        PingPong game = new PingPong();

	        // Ping thread
	        Thread pingThread = new Thread(() -> {
	            try {
	                for (int i = 0; i < 5; i++) {
	                    game.ping();
	                    Thread.sleep(500);  // Simulate some delay
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        });

	        // Pong thread
	        Thread pongThread = new Thread(() -> {
	            try {
	                for (int i = 0; i < 5; i++) {
	                    game.pong();
	                    Thread.sleep(500);  // Simulate some delay
	                }
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        });

	        pingThread.start();
	        pongThread.start();
	    }
	}

	
	
	
	
	
	
	
	

