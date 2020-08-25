package miei_thread;

public class ProvaThread5 implements Runnable{

	public static void main(String[] args) {
		ProvaThread5 pt = new ProvaThread5();
		Thread t = new Thread (pt);
		t.start();
		synchronized (pt) {
			pt.m2();
			
		}
	}
		public void run() {
			m1();
		}
		synchronized  void m1() {
			for (char c = 'A'; c < 'F'; c++) {
				System.out.println(c);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			
		}
						
		
	}
		}
		
		 void m2() {
			for (char c = '1'; c < '6'; c++) {
				System.out.println(c);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			
		}
						
		
	}
		}	
}
