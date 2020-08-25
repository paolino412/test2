package miei_thread;
class Sleeper extends Thread {
	private int duration ;
	public Sleeper (String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}
	public void run() {
		try {
			sleep(duration);
			
		}
		catch(InterruptedException e) {
			System.out.println(getName() +" è stato interrotto " + "isInterrupted è " +isInterrupted());
			return;
		}
		System.out.println(getName() +" si è svegliato");
	}
}

class Joiner extends Thread {
	private Sleeper sleeper  ;
	public Joiner (String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
			
			
		}
		System.out.println(getName()+ " join completato ");
	}
}

public class Sample_join {

	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper ("Sleepy",1500);
		Sleeper grumpy = new Sleeper("Grumpy",1500);
		Joiner dopey = new Joiner ("Dopey",sleepy);
		Joiner doc = new Joiner ("Doc",sleepy);
		grumpy.interrupt();
		int i = Integer.parseInt("12");
		System.out.println(i);
	}

}
