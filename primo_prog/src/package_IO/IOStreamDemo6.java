package package_IO;
import java.io.*;
public class IOStreamDemo6 {

	public static void main(String[] args) throws IOException {
	  RandomAccessFile rf = new RandomAccessFile("C:\\Users"
   		  	+ "\\renata\\Desktop\\prova_java\\prova1.txt", "rw");
        for(int  i = 0;i< 10; i++)
        	rf.writeDouble(i*1.41);
        	rf.close();
        	 rf = new RandomAccessFile("C:\\Users"
        	   		  	+ "\\renata\\Desktop\\prova_java\\prova1.txt", "rw");
        	 rf.seek(5*8);
           	rf.writeDouble(47.0001);
           	rf.close();
           	rf=new RandomAccessFile("C:\\Users"
    	   		  	+ "\\renata\\Desktop\\prova_java\\prova1.txt", "r");
           	for (int i=0;i<10;i++)
           	System.out.println("Value "+i+": "+rf.readDouble());
           	rf.close();

	}

}
