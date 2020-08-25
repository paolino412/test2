package semplici;

import java.io.*;

public class Quinto {
	static double LeggiDouble (String messaggio,double valoreMin,double valoreMax) {
		InputStreamReader tastiera = new InputStreamReader(System.in);//creo un oggetto per leggere un byte
		BufferedReader bufferTastiera = new BufferedReader(tastiera); // oggetto per leggere un intera linea
		String riga = "";// stringa in cui inserire la linea
		// ciclo d'inserimento di una linea che va avanti finchè riscontro un errore
		double risultato = 0.0;
		boolean errore = false;// variabile che segnala l'errore
		do {
			errore = false;
			try {
				System.out.print(messaggio);
				riga = bufferTastiera.readLine();				
				risultato = Double.parseDouble(riga);
				
				
			}
			catch (NumberFormatException e){
				System.out.println ("non è un numero");
				errore = true;
				
			}
			
			catch (IOException ei){
				System.out.println ("problemi di input");
				errore = true;
				
			}
			if (risultato <= valoreMin || risultato >= valoreMax) {
				errore = true;
				System.out.println("vlore non acceettbile( " +valoreMin +"-"+valoreMax  +")");
			}
			
	        
			
		} while (errore );
		
		return risultato;
		
		
	}

public static void main(String[] args) {
		
		double sommainiziale = 0.0;
		double percentualeInteresse = 0.0;
		sommainiziale = LeggiDouble("immetti la somma iniziale",45,52);
		percentualeInteresse = LeggiDouble("immetti la percentuale",0.12,0.89);

		
	}

}



