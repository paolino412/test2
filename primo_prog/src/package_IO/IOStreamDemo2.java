package package_IO;
import java.io.*;
public class IOStreamDemo2 {

	public static void main(String[] args)throws IOException {
      
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("inserisci linea");
		String s = stdin.readLine();
		System.out.println(s);


	}

}
