package primo_prog;
class Persona {
	
	private	String nome,cognome;
	
	    Persona(String n,String c) {
		nome = new String(n);
		cognome = new String(c);
	}
      public  String identit�() {
        	return new String( cognome);
        }
}

public class UsaPersona {

	public static void main(String[] args) {
		Persona p1,p2;
		p1 = new Persona("valerio","cafasso");
		p2 = new Persona("sergio","amato");
		System.out.println(p1.identit�());
		System.out.println(p2.identit�());
	}

}
