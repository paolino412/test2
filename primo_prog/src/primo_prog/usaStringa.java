package primo_prog;
//: c02:HelloDate.java
//import java.util.*;
/** The first Thinking in Java example program. 
  * Displays a string and today's date. 
  * @author Bruce Eckel 
  * @author www.BruceEckel.com 
  * @version 2.0
  */

public  class usaStringa { 
	 
	   public static void Stampa(String s)throws ErroreStringaVuota {
		   if (s == null)throw new ErroreStringaVuota ();
		   else
		System.out.println(s);
	}//il main non può accedere ad un metodo non statico
	   // perchè se ci fossero più istanze usaStringa
	   //il main non avrebbe alcun ccriterio per decidere
	   //a quale oggetto appartiene il metodo stampa
	   
	public  static void main(String[] args) { 
		String mia = null;
		try {Stampa(mia);}
		catch (ErroreStringaVuota e)
		{System.out.println ("Spiacente");}
	}
	} ///:~
 