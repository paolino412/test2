package semplici;
import java.io.*;

public class Quarto {

	public static void main(String[] args) {
		
		InputStreamReader tastiera = new InputStreamReader(System.in);//creo un oggetto per leggere un byte
		BufferedReader bufferTastiera = new BufferedReader(tastiera); // oggetto per leggere un intera linea
		String riga = "";// stringa in cui inserire la linea
		// ciclo d'inserimento di una linea che va avanti finchè riscontro un errore
		double sommaIniziale = 0;
		boolean errore = false;// variabile che segnala l'errore
		do {
			
			try {
				System.out.print("inserire un valore ");
				riga = bufferTastiera.readLine();				
				sommaIniziale = Double.parseDouble(riga);
				errore = false;
			}
			catch (NumberFormatException e){
				System.out.println ("non è un numero");
				errore = true;
				
			}
			
			catch (IOException ei){
				System.out.println ("problemi di input");
				errore = true;
				
			}
			
			
	        
			
		} while (errore);
		
	}

}
