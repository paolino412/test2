package semplici;

import java.util.*;

public class primo {

	public static void main(String[] args) {
		  
		 int somma = 0;
		 int a;
		 while (somma < 1000) {
			  
		 
		 System.out.println("immetti numero a(  " +somma+" ) ");
		 Scanner s = new Scanner(System.in);
		  
		  somma += s.nextInt();
          
		 
		 System.out.println("la somma è "+somma);
	}

}
}