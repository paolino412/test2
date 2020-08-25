package primo_prog;
class Strumenti {
	public void suona() {
		System.out.println("sto suonando");
	}
	static void tune (Strumenti i) {
		i.suona();
	}
}
class chitarra extends Strumenti{
	public void suona() {
		System.out.println("sto suonando la chitarra");
	}
}
class piano extends Strumenti{
	public void suona() {
		System.out.println("sto suonando il piano");
	}
}
public class Upcasting {

	public static void main(String[] args) {
	 chitarra elettrica = new chitarra();
	 Strumenti s = new Strumenti();
	 Strumenti.tune(elettrica); // upcasting 
	 Strumenti.tune(s);
	 
	 piano pianola = new piano();
	 Strumenti.tune(pianola);
	}

}
