package package_IO;
import java.io.*;

 
public class IOStreamDemo3 {

	public static void main(String[] args)throws IOException,EOFException {
		  BufferedReader in = new BufferedReader(new FileReader("C:\\Users"
		  	+ "\\renata\\Desktop\\prova_java\\prova.txt"));
          String s,s2 = new String();
          while ((s = in.readLine() )!= null ) {
        	 s2 = s +"\n";
      	  //   System.out.println(s2);

          }
       in.close();
         
 	     
        try {
        	ByteArrayInputStream bais =	new ByteArrayInputStream(s2.getBytes());
      DataInputStream in3=new DataInputStream ((bais));
      int dim = in3.available();
      byte mybuffer[] = new byte[dim];
      System.out.println(dim );
      in3.read(mybuffer, 0, dim);
        String s3,s4 = new String();
     //  while((s3 = in3.readLine())  != null) {
    	//   s4 += s3+"\n";
    	//      System.out.println(s4);
       	     

       //}
   System.out.println(new String(mybuffer));
     //   dos.close();
      //  in3.close(); 
        }
        catch (EOFException e) {
        	System.err.println("end of stream");
	}

	}
}
