package altro_package;
import java.io.*;
public class ByteArrayIOapp {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
         ByteArrayOutputStream outstream = new ByteArrayOutputStream();
         String s = new String("questo è un test");
         outstream.write(s.getBytes());
         System.out.println("flusso di output "+outstream);
         System.out.println("dimensione "+outstream.size());
         ByteArrayInputStream instream ;
         instream = new ByteArrayInputStream(outstream.toByteArray());
         int inBytes = instream.available();
         byte inBuf [] = new byte [inBytes];
         int bytesRead = instream.read(inBuf, 0, inBytes);
         System.out.println("byte letti "+bytesRead);
         System.out.println("sono "+new String(inBuf));

	}

}
