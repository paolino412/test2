package natella;

class Persona {
	private String name;
	public Persona (String n) {
		name =  n;
	}
	String identit� () {
		return name;
	}
	
}
public class UsaPersona {

	public static void main(String[] args) {
		 Persona ahitler = new Persona  ("Adolf Hitler ");
		 Persona jgoebbels = new Persona ("Joseph Goebbels ");
		 System.out.println (ahitler.identit�());
		 System.out.println (jgoebbels.identit�());
	}

}
