package package_IO;
import java.io.*;

public class IOStreamDemo7 {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users"
	   		  	+ "\\renata\\Desktop\\prova_java\\text.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//Lettura di un singolo carattere
		byte ch = raf.readByte();
		System.out.println("Read first character of file: " + ch);
		//Lettura di una riga
		System.out.println("Read full line: " + raf.readLine());
		raf.seek(file.length());
		//Scrittura di una nuova riga a fine file
		raf.write(0x0A);
		raf.writeBytes("This will complete the Demo");
		raf.close();

	}

}
