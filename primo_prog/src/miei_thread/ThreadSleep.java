package miei_thread;

public class ThreadSleep extends Thread{
private int countDown=5;
private static int threadCount=0;
public ThreadSleep(){
super (""+ ++threadCount); //costruttore Thread(String name) alloca un nuovo oggetto
 
start(); //ridefinizione del metodo: Returns a string representation of this thread, including the
 
}
public String toString(){ return "#" + getName()+":"+countDown;} //getName ritorna il nome del
 
public void run(){
while (true){
System.out.println(this);
if (--countDown==0)return;
try{
sleep(1000);
}catch(InterruptedException e){
throw new RuntimeException (e);
}
}
}
public static void main(String[] args)throws  InterruptedException{
for (int i=0; i<5; i++){
   new ThreadSleep().join();
}
}
}