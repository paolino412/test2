package natella;

class Persona2 {
	protected int età;
	protected String nome ;
	public Persona2(String n,int e) {
		età = e;
		nome = n;
	}
    public void chiSei () {
    	System.out.println("dati persona: " +nome+ " di anni " +età);
    	
    }
}
  
class Studente extends Persona2 {
	private String matricola;
	private int esami;
	
	public Studente (String n,int e, String m, int es) {
		super (n,e);
		matricola = m;
		esami = es;
		
	}
	 public void chiSei () {
		    super.chiSei();
	    	System.out.println( "matricola " +matricola+ " numero esami "+esami );
	    	
	    }
	
}
public class UsaStudente {

	public static void main(String[] args) {
		 Studente s1 = new Studente(" Albert Spheer ", 34, "m6300155", 7);
		 Studente s2 = new Studente(" Heinrich Himmler ", 35, "m6300165", 5);
		 s1.chiSei();
		 s2.chiSei();
	}

}
