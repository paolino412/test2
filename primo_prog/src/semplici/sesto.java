package semplici;

import java.io.*;
import java.util.*;

public class sesto {

	static double LeggiDouble (String messaggio,double valoreMin,double valoreMax) {
		Scanner tastiera = new Scanner(System.in);//creo un oggetto per leggere un byte
		 boolean a;
		 
		double risultato = 0.0;
		 
		do {    
			System.out.print(messaggio);
			 a = !tastiera.hasNextDouble();
			System.out.println(a);
			 while (!tastiera.hasNextDouble()) {
				 
			     System.out.println("inserisci un intero "); 
				System.out.print(messaggio);
				 tastiera.nextLine();		
				
			}
			 
			risultato = tastiera.nextDouble();
			 
			if (risultato < valoreMin || risultato > valoreMax) {
				 
				System.out.println("vlore non acceettbile( " +valoreMin +"-"+valoreMax  +")");
			}
			
	        
			
		} while (risultato < valoreMin || risultato > valoreMax );
		
		return risultato;
		
		
	}

public static void main(String[] args) {
		
		double sommainiziale = 0.0;
		double percentualeInteresse = 0.0;
		sommainiziale = LeggiDouble("immetti la somma iniziale",45,52);
		percentualeInteresse = LeggiDouble("immetti la percentuale",0.12,0.89);

		
	}


}
