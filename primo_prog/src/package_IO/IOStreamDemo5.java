package package_IO;
import java.io.*;
public class IOStreamDemo5 {

	public static void main(String[] args)throws IOException {
	 BufferedReader in = new BufferedReader (new FileReader("C:\\Users"
   		  	+ "\\renata\\Desktop\\prova_java\\text.txt"));
	 String s,s2 = new String();
	 while( (s = in.readLine()) != null ) 
		 s2+= s+"\n";
	      in.close();
	      try {
	   BufferedReader in4 = new BufferedReader (new StringReader(s2));
	   PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users"
   		  	+ "\\renata\\Desktop\\prova_java\\prova1.txt")));
	   int lineCount = 1;
	   while ((s = in4.readLine()) != null)
		   out.println(lineCount++ +":"+s);
	   out.close();
	      }
	      catch(EOFException e) {
	    	  System.err.println  ("end of stream");
	      }
	}

}
