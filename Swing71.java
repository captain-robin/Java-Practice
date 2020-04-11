import javax.swing.*;
import java.awt.event.*;
public class Swing71 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public Swing71(){}
   public Swing71(final String s) {
       super(s);
   }

   public void setComponents() {
       l1 = new JLabel("Enter two number");
       l2 = new JLabel("Frist number is ");
       l3 = new JLabel("Second number is ");
       l4 = new JLabel();
       t1 = new JTextField();
       t2 = new JTextField();
       b1 = new JButton("Add");

       setLayout(null);
       l1.setBounds(50, 50, 200, 30);
       l2.setBounds(50, 80, 100, 20);
       t1.setBounds(150, 80, 100, 20); 
       l3.setBounds(50, 130, 100, 20);
       t2.setBounds(150, 130, 100, 20);
       l4.setBounds(50, 210, 200, 20);
       b1.setBounds(80, 180, 100, 20);
       add(l1);
       add(l2);
       add(t1);
       add(l3);
       add(t2);
       add(b1);
       add(l4);
       b1.addActionListener(new Handler());
   }

    class Handler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        int a, b, s;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        s = a + b;
        l4.setText("Result is "+s);
      }
  }

   public static void main(final String[] args) {
       final Swing71 jf = new Swing71("SWing Example");
        jf.setComponents();
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}