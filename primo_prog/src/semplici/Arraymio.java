package semplici;

import java.util.Random;

public class Arraymio {

	public static void main(String[] args) {
		Random r = new Random();
		 double totale = 0;
		 double media;
		 double incassiGiornalieri[] = new double[30];
		 for ( int i = 0; i< 30; i++) {
             System.out.println("inserire incasso per il giorno" +i+":");

			 incassiGiornalieri[i] = r.nextDouble()*1000;
			 System.out.println(incassiGiornalieri[i]);
			 totale += incassiGiornalieri[i];
			 
		 }
			 
             media = totale / 30;
             System.out.println("\nincasso medio giornalliero" + media);
             for ( int i = 0; i< 30; i++) {
    			 if (incassiGiornalieri[i]> media)
    			 System.out.println("incasso giorno " +(i+1)+" è "+incassiGiornalieri[i]);
    			  
    		 }
	}

}
