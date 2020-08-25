package primo_prog;

public class UsaStringa2 {

	 public static void Stampa(String s){
		 try {
			 System.out.println(s);
			 if (s == null)
			 throw new ErroreStringaVuota();} 
		 catch (ErroreStringaVuota e)
		 {System.out.println ("Spiacente");}
		   
		
	} 
	public  static void main(String[] args) { 
		String mia = null;
		
		Stampa(mia);
		
	}
	} 