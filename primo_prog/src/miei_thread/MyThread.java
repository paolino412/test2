package miei_thread;

public class MyThread extends Thread{
	private int countdown = 5;
	private static int threadcount = 0;
	
    public  MyThread() {
    	super (""+ ++threadcount );
    	start();
    }
    public String toString() {
    	return "#" +getName()+":"+countdown ;
    }
    public void run() {
    	while (true) {
    		System.out.println(this);
    		if (--countdown == 0)
    			return;
    	}
    }

	public static void main(String[] args) {
		 for (int i = 0;i<5;i++)
			 new MyThread();
	}

}
