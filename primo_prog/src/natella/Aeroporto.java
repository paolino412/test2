package natella;

class Velivolo {
	private String peso;
	
    public void atterra () {
    	System.out.println ("sto atterrando ");
    }
    
    public void decolla () {
    	System.out.println ("sto decollando ");
    }
    
}
class Elicottero extends Velivolo {
	

    public void atterra () {
    	System.out.println ("elicottero atterra ");
    }
    
    public void decolla () {
    	System.out.println ("elicottero decolla ");
    }
    
	
}

class Jet extends Velivolo {
	

    public void atterra () {
    	System.out.println ("jet atterra ");
    }
    
    public void decolla () {
    	System.out.println ("jet decolla ");
    }
    
	
}

class Mongolfiera extends Velivolo {
	

    public void atterra () {
    	System.out.println ("mongolfiera atterra ");
    }
    
    public void decolla () {
    	System.out.println ("mongolfiera decolla ");
    }
    
	
}
public class Aeroporto {
	public void abilita_decollo (Velivolo v) {
		v.decolla();
		
	}

	public static void main(String[] args) {
		 Aeroporto malpensa = new Aeroporto();
		 Velivolo r2 = new Velivolo();
		 Jet j2 = new Jet();
		 malpensa.abilita_decollo (r2);
         
		 System.out.println("modifica");
		 System.out.println("modifica numero 2");
		 System.out.println("modifica locale");
	}
	

}
