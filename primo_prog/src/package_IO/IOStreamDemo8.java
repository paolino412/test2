package package_IO;
import java.io.*;
public class IOStreamDemo8 {

	public static void main(String[] args) throws IOException {
		 File file = new File ("C:\\Users"
		   		  	+ "\\renata\\Desktop\\prova_java\\myfile.text");
		 try {
		 file.createNewFile();
		 }
		 catch(IOException x) {
			 System.err.format( "create file error:%s%n",x.getMessage());
		 }
		 //lettura file
		 InputStream in = null;
		 try {
			 in = new FileInputStream(file);
			 BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			 //lettura file riga per riga
			 String line = null;
			 while((line = reader.readLine()) != null)
				 System.out.println(line);
		 }
		 catch(IOException x) {
			 System.err.println(x);
		 }
		 finally {
			 if ( in != null)
				 in.close();
		 }
		 String s = "testo prova ";
		 byte data[] = s.getBytes();
		 OutputStream out = null;
		 try {
			 out = new BufferedOutputStream(new FileOutputStream(file));
			 out.write(data, 0, data.length);
		 }
		 catch(IOException x) {
			 System.err.println(x);
		 }
		 finally {
			 if (out != null) {
				 out.flush();
				 out.close();
			 }
		 }
		 }

}

 