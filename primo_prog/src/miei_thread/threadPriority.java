package miei_thread;

public class threadPriority extends Thread {
	private int countdown = 5;
public	threadPriority(int priority){
		setPriority(priority);
		start();
	}
public	String toString () {
		return super.toString() +":"+ countdown;
		 
	}
public void run (){
	while (countdown != 0) {
		//for ( int i = 0;1 < 100; i++) 
			
		System.out.println(this);
		countdown-- ;
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for ( int j = 0; j < 2; j++)
        	new threadPriority(MAX_PRIORITY);
        for ( int i = 0; i < 5; i++)
        	new threadPriority(MIN_PRIORITY);
	}

}
