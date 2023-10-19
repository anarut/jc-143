package lesson11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AwtProgram {

    public AwtProgram() {
        Frame f = new Frame();
        Button btn=new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);         //adding a new Button.
        f.setSize(300, 250);        //setting size.
        f.setTitle("JavaTPoint");  //setting title.
        f.setLayout(null);   //set default layout for frame.
        f.setVisible(true);           //set frame visibility true.


        btn.addActionListener(e -> {
            try {
                Desktop desktop = Desktop.getDesktop();
                String s = "http://www.onliner.by";
                URI uri = new URI(s);
                desktop.browse(uri);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        AwtProgram awt = new AwtProgram();
    }
}
