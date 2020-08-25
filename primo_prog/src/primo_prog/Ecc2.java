package primo_prog;

public class Ecc2 {
public static void main(String args[]) {
int a = 10;
int b = 0;
try {
int c = a/b;
System.out.println(c);
} catch (ArithmeticException exc) {
System.out.println("Divisione per zero...");
exc.printStackTrace();
//stesso output di come se l’eccezione non fosse
// catturata, ma senza interrompere il programma
}
}
}
