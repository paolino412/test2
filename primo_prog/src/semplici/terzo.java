package semplici;

public class terzo {
	static void stampaMessaggio(String messaggio,char simbolo,int lungh_simb) {
		//stampa_rigaln(simbolo,lungh_simb);
		String riga = crea('*',40);
		System.out.println(riga);
		System.out.println(messaggio);
		stampa_riga(simbolo,lungh_simb);
	}

	
	static void stampa_riga(char simbolo,int quanti) {
		stampa_riga_capo(simbolo,quanti,false);
		
	}
	static String crea(char simbolo,int volte) {
		String riga = "";
		for(int i = 0; i < volte; i++)
			riga+= simbolo;
		return riga;
	}
	static void stampa_rigaln(char simbolo,int quanti) {
		stampa_riga_capo(simbolo,quanti,true);
		
	}
	static void stampa_riga_capo(char simb,int qua,boolean a_capo) {
		for (int i = 0; i< qua;i++)
			System.out.print(simb);
		if (a_capo)
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      stampaMessaggio("ciao muo",'*',40);
	}

}
