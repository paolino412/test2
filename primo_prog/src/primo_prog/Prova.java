package primo_prog;

public class Prova {
	public static void main (String[]args) {
		String str1,str2;
		str1 = new String("java");
		//str2 = str1;
		str2 = new String("java");
		System.out.println("stesso valore?"+str1.equals(str2));
		System.out.println("stesso oggetto?"+(str1==str2));

	}

}
