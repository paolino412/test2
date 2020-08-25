/* Input bufferizzato da file
 * stampo a video quello che c’è scritto nel file Prova.doc
*/
package package_IO;
import java.io.*;
public class IOStreamDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
       BufferedReader mio = new BufferedReader(new FileReader("C:\\Users\\renata"
       		+ "\\Desktop\\prova_java\\prova.doc"));
       String s,s2 = new String();
       while (  (s= mio.readLine() ) != null ) {
    	   s2 += s+ "\n";
    	   System.out.println(s2);
       }
       mio.close();
	}

}
