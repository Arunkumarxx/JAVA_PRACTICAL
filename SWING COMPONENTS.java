import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame {
    JPanel pan;
    JButton b;
    JTextField t;
    JPasswordField p;
    JLabel l1, l2, msg;

    public Form() {
        pan = new JPanel(new GridLayout(3, 2));
        b = new JButton("Click");
        t = new JTextField();
        p = new JPasswordField();
        l1 = new JLabel("Name :");
        l2 = new JLabel("Pass :");
        msg = new JLabel();
        pan.add(l1);
        pan.add(t);
        pan.add(l2);
        pan.add(p);
        pan.add(msg);
        pan.add(b);

        // Add an ActionListener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Here, you can add code to handle the button click event
                String name = t.getText();
                String pass = new String(p.getPassword());
                msg.setText("Name: " + name + ", Pass: " + pass);
            }
        });

        add(pan);
        setSize(300, 150); // Set a reasonable size for the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation when the window is closed
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Form();
            }
        });
    }
}
