package package_IO;

import java.io.*;
public class IOStreamDemo4 {
public static void main(String[] args)throws IOException {
       BufferedReader in =new BufferedReader(new FileReader("C:\\Users"
   		  	+ "\\renata\\Desktop\\prova_java\\prova.txt"));
        String s, s2=new String();
        
         while ((s=in.readLine())!=null) {
        	 s2=s; 
        	 System.out.println(s2);
        	 }
         in.close();
         try{
         DataInputStream in3=new DataInputStream (new ByteArrayInputStream(s2.getBytes()));
         while (true)
           System.out.print((char)in3.readByte());
                 }
         catch (EOFException e){
          System.err.println("End of stream ");
}
}
}
