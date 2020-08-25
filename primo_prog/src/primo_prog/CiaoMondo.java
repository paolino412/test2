package primo_prog;

public class CiaoMondo
{
public static void main(String[] args)
{
System.out.print ("Ciao mondo, sono il primo programma in Java ");
String Nome;
String Cognome;
try {Nome=args[0];}
catch (ArrayIndexOutOfBoundsException e)
{Nome="Non hai inserito il tuo Nome";}
;
try {Cognome=args[1];}
catch (ArrayIndexOutOfBoundsException e)
{Cognome="Non hai inserito il tuo Cognome";}
;
System.out.println ("di "+Nome+" "+Cognome);
}}