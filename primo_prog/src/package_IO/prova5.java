package package_IO;
import java.io.*;

public class prova5 {

	public static void main(String[] args) throws IOException{
		try{
			FileInputStream fis=new FileInputStream("C:\\Users\\renata\\Desktop\\prova_java\\text.txt");
			DataInputStream dis= new DataInputStream(fis);
			//lettura
			double d=dis.readDouble();
			int i= dis.readInt();
			String s= dis.readUTF();
			System.out.println(s);
			//Chiude la catena
			dis.close();
			fis.close();
			}catch (IOException e){}

	}

}
