import java.awt.*;
import java.applet.*;

public class AppletParam extends Applet{
  String str;
  public void init(){
    str = getParameter("string");
    if(str==null)
      str="Java";
    str="Hello! "+str;
  }
  public void paint(Graphics g){
    g.drawString(str,400,400);
  }
  public static void main(String[] args) {

  }

}
