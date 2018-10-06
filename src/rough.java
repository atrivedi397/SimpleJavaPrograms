import java.applet.Applet;
import java.awt.*;


public class rough extends Applet {

    Label l1;

    public void init()
    {
        l1 = new Label("WELCOME");
        setLayout(null);
        l1.setBounds(150,50,100,100);
        add(l1);
    }
}
