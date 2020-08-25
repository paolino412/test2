package primo_prog;

class Persona1 {
	
	protected	String nome;
	protected String sesso;
	protected int età;
	
	    Persona1(String nome,String sesso, int età) {
		this.nome = new String(nome);
		this.sesso = new String(sesso);
		this.età = età;
	}
      public  void chi_sei() {
  		System.out.println( "nome "+nome+" sesso "+sesso+" età "+età);

        }
}
class Studente extends Persona1{
	private	String facoltà;
	private String matricola;
	private int esami;
	Studente(String nome,String sesso, int età,String facoltà,String matricola,int esami) {
		super(nome,sesso,età);
		this.facoltà = new String(facoltà);
		this.matricola = new String( matricola);
		this.esami =  esami;
	}
      public  void chi_sei() {
    	  super.chi_sei();
  		System.out.println( "iscritto alla facoltà di\t"+facoltà+"\tmatricola\t"+matricola+"\t ha sostenuto\t"+esami+"\tesami");

        }
	
}
public class UsaStudente {

	public static void main(String[] args) {
		 Studente s1 = new Studente("Paolo","maschio",35,"ingegneria","m6300155",6);
		 s1.chi_sei();

	}

}
