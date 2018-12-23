import java.awt.*;
import java.applet.*;


@SuppressWarnings("deprecation")
public class MyApplet extends Applet {
    String out;
    public void init(){
        setBackground(Color.yellow);
        System.out.println("INIT");
        out += "INIT->";
        System.out.println(out);
    }
    public void start(){
        setBackground(Color.GREEN);
        out += "Start->";
        System.out.println(out);
    }

    public void stop(){
        out += "Stop->";
        setBackground(Color.BLUE);
        System.out.println(out);
    }

    public void destroy(){
        out += "destroy";
        System.out.println(out);
    }

    public void paint(Graphics g){
        g.drawString("Welcome to applet", 40,40);
        out += "paint->";
        g.drawString(out, 20, 63);
    }
}