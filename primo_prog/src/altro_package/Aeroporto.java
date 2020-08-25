package altro_package;

abstract class Velivolo {
	private String peso;
	public abstract void decolla (); //{
		//System.out.println("sto decollando");

	//}

     public abstract void atterra (); //{
	//System.out.println("sto atterrando");

//}
}

class Elicottero extends Velivolo {
	private String peso;
	public void decolla () {
		System.out.println("sto decollando con l'elicottero");

	}

     public void atterra () {
	System.out.println("sto atterrando con l'elicottero");

}
}

class Mongolfiera extends Velivolo {
	private String peso;
	public void decolla () {
		System.out.println("sto decollando con la mongolfiera");

	}

     public void atterra () {
	System.out.println("sto atterrando con la mongolfiera");

}
}
class jet extends Velivolo {
	private String peso;
	public void decolla () {
		System.out.println("sto decollando con il jet");

	}

     public void atterra () {
	System.out.println("sto atterrando con il jet");

}
}
public class Aeroporto {
public void abilita_decollo ( Velivolo v) {
	v.decolla();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Aeroporto malpensa = new Aeroporto();
         Velivolo milano_napoli = new Mongolfiera();
         malpensa.abilita_decollo(milano_napoli);
	}

}
