import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event extends Applet implements ActionListener {
    Button b;
    TextField tf;

    public void init() {
        tf = new TextField();
        tf.setBounds(30, 40, 150, 20);
        b = new Button("Click");
        b.setBounds(80, 150, 60, 50);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome " + tf.getText());
    }
}
<!--
<applet code="Event.class" width="300" height="300">
</applet>
-->
