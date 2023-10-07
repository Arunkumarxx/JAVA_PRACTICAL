import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login extends JFrame implements ActionListener
{
    JPanel pan;
    JButton b;
    JTextField t;
    JPasswordField p;
    JLabel l1,l2,msg;
    public Login()
    {
        pan=new JPanel(new GridLayout(3,2));
        b=new JButton("Click");
        t=new JTextField();
        p=new JPasswordField();
        l1=new JLabel("Name :");
        l2=new JLabel("Pass :");
        msg=new JLabel();
        pan.add(l1);
        pan.add(t);
        pan.add(l2);
        pan.add(p);
        pan.add(msg);
        pan.add(b);
        b.addActionListener(this);
        setSize(100,150);
        setVisible(true);
        add(pan);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(t.getText().equals("cse")&&p.getText().equals("123"))
            msg.setText("Welcome "+t.getText());
        else
            msg.setText("Invalid");
    }
    public static void main(String []args)
    {
        new Login();
    }
}
