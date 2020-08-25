package altro_package;

public class Document {
	private String title = "titolo";
	class Destinazione {
		private String label;
		Destinazione (String whereTo){
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
		String readTitle() {
			return Document.this.title;//solo title
		}
		
	}
	public void ship (String dest) {
	Destinazione	d = new Destinazione(dest);
	System.out.println(d.readLabel()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Document doc = new Document();
        Document.Destinazione des = doc.new Destinazione("dodoma");
        String str = des.readTitle();
       doc.ship(des.readLabel());
	}

}
