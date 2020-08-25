package altro_package;
import java.io.*;
public class DirList {
public static void main(String[] args) {
File path=new File("C:\\Users\\renata\\Desktop\\PROGRAMMAZIONE II\\PECCHIA");
if (!path.exists())System.out.println("Il path non esiste!");
String[] list;
list = path.list();
if(!path.isFile()){
System.out.println("Elementi nella directory: "+path.getPath());
for (int i=0;i<list.length;i++)
System.out.println(list[i]);}
String pathname=path.getName(); //nome della directory
System.out.println("La directory è: "+pathname);
FileData.propriety(path); //proprietà file o directory
NewDirectory.makeDir(); //crea una nuova directory
File rinomina=new File("C:\\ciao");
path.renameTo(rinomina);
System.out.println("Il path "+path.getPath()+" è stato rinominato in: "+rinomina.getPath());
}
}
class FileData{
static public void propriety(File f){
System.out.println("Absolute path: "+f.getAbsolutePath()+
"\n Puoi leggere? "+f.canRead()+
"\n Puoi scrivere? "+f.canWrite()+
"\n getParent: "+f.getParent()+
"\n getPath: "+f.getPath()+
"\n lunghezza: "+ f.length()+
"\n Ultima modifica: "+f.lastModified());
if (f.isFile())
System.out.println("E' un file!");
else if(f.isDirectory())
System.out.println("E' una directory!");
}
}
class NewDirectory{
static void makeDir(){
File newdir=new File("C:\\Documents and Settings\\Francesco\\Documenti\\strunz");
newdir.mkdir();
System.out.println("E'stata creata la seguente directory: "+newdir.getPath());
DeleteFile.delete(newdir);
}
}
class DeleteFile{
static void delete(File newdir){
newdir.delete();
System.out.println("E' stato cancellata la seguente directory: "+newdir.getPath());
}
}
