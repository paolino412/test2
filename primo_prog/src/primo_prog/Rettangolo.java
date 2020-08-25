package primo_prog;
class figura{
	protected int i;// se metto private, ret e c non possono accedervi con ret.i e c.i
	figura(int z){
		System.out.println("costruita figura");
		i = z;
	}
}
class cerchio extends figura {
	cerchio (int i){
		super(i);
		System.out.println("costruito cerchio");
		Rettangolo rett = new Rettangolo(20);//accesso a livello di package
	}
}
public class Rettangolo extends figura {
	Rettangolo (int i){
		super(i);
		System.out.println("costruito rettangolo");
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rettangolo ret = new Rettangolo(4);//accesso alla cclasse consentito perchè dello stesso packAGE
cerchio c = new cerchio(6);
System.out.println(ret.i);
System.out.println(c.i);

	}

}
