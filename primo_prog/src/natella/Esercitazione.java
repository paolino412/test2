package natella;

 

class Student {
	protected String nome;
	protected String cognome ;
	protected int età ;
	public Student () {
		System.out.println (toString());
	}
	public Student (String nome,String cognome,int età) {
		 setNome (nome);
		 setCognome(cognome);
		 setEtà(età);
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setCognome (String cognome) {
		this.cognome = cognome;
	 
}
	public void setEtà (int età) {
		this.età = età;
	}
	public String getNome () {
		return nome;
	}
	public String getCognome () {
		return cognome;
	}
	public int getEtà () {
		return età;
	}
    public String toString ( ) {
    	return ("nome " +getNome()+" cognome "
    +getCognome()+ " di anni "+getEtà());
    }
    
}
class StudenteTLC extends Student {
	private String corsoDiLaurea ;
 
	public StudenteTLC (String n,String c, int e) {
		super(n,c,e );
		 

		System.out.println (toString());
	}
	
	 public String toString () {
		 return (super.toString()+" corso di laurea in ingegneria TLc " );
	    }	
	}
	


class StudenteBiomedica extends Student {
	private String corsoDiLaurea ;
	
	public StudenteBiomedica (String n,String c, int e ) {
		super(n,c,e );
		 
		System.out.println (toString());
	}
	
	 public String toString () {
	    return (super.toString()+" corso di laurea in ingegneria biomedica");
	    }	
	}
	

public class Esercitazione {

	public static void main(String[] args) {
		Student s1 = new StudenteTLC ("hermann", "goering",32);
				 
		 
		System.out.println(s1);
		Student s2 = new StudenteBiomedica ("hermann", "fegelein",32); 
		 
		System.out.println(s2);
		Student s3 = new StudenteBiomedica ("Helmut", "Heidling",32); 
		 
		System.out.println(s3);
	}

}
