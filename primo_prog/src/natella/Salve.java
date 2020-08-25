package natella;

import java.applet.*;
import java.awt.*;
@SuppressWarnings("deprecation")
public class Salve extends Applet {
String Text;
public void init() {
super.init();
// si ricava il testo dal file HTML
Text = new String(getParameter("text"));
}
public void paint (Graphics g) {
g.drawString(Text,50,50);
}
}