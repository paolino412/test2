package primo_prog;

class Persona1 {
	
	protected	String nome;
	protected String sesso;
	protected int et�;
	
	    Persona1(String nome,String sesso, int et�) {
		this.nome = new String(nome);
		this.sesso = new String(sesso);
		this.et� = et�;
	}
      public  void chi_sei() {
  		System.out.println( "nome "+nome+" sesso "+sesso+" et� "+et�);

        }
}
class Studente extends Persona1{
	private	String facolt�;
	private String matricola;
	private int esami;
	Studente(String nome,String sesso, int et�,String facolt�,String matricola,int esami) {
		super(nome,sesso,et�);
		this.facolt� = new String(facolt�);
		this.matricola = new String( matricola);
		this.esami =  esami;
	}
      public  void chi_sei() {
    	  super.chi_sei();
  		System.out.println( "iscritto alla facolt� di\t"+facolt�+"\tmatricola\t"+matricola+"\t ha sostenuto\t"+esami+"\tesami");

        }
	
}
public class UsaStudente {

	public static void main(String[] args) {
		 Studente s1 = new Studente("Paolo","maschio",35,"ingegneria","m6300155",6);
		 s1.chi_sei();

	}

}
