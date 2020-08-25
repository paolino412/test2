package altro_package;

class Ruota {
	private String s;
	Ruota(){
		System.out.println("ruota()");
		s = new String("ruota inserita");
	}
	public String toString() {
		return s;
	}
}

class Motore {
	 String s;
	Motore(){
		System.out.println("motore()");
		s = new String("motore montato");
	}
	public String toString() {
		return s;
	}
}

class Carrozzeria {
	private String s;
	Carrozzeria(){
		System.out.println("carrozzeria()");
		s = new String("carrozzeria inserita");
	}
	public String toString() {
		return s;
	}
}

public class Macchina {
     private  Ruota ruota1,ruota2,ruota3,ruota4;
      Motore motore;
      Carrozzeria carrozzeria = new Carrozzeria();
      String s = "macchina assemblata";
     Macchina(){
    	 System.out.println("macchina()");
    	 motore = new Motore();
     }
     void print() {
    	 ruota1 = new Ruota();
    	 ruota2 = new Ruota();

    	 ruota3 = new Ruota();

    	 ruota4 = new Ruota();
    	 System.out.println("macchina="+s);
    	 System.out.println("ruota1="+ruota1);
    	 System.out.println("ruota2="+ruota2);
    	 System.out.println("ruota3="+ruota3);
    	 System.out.println("ruota4="+ruota4);
    	 System.out.println("motore="+motore);
    	 System.out.println("carrozzeria="+carrozzeria);
    	 System.out.println("source="+s); 

    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Macchina x = new Macchina();
             x.print();
             System.out.println(x.motore.s);
	}

}
