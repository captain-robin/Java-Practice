import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

/*<applet code="MyApplet" width="300" height="220"></applet>*/
public class MyApplet extends Applet {
	Label l1,l2,l3,l4;
	TextField t1, t2;
	Button b1,b2;

	public void init(){
	   l1=new Label("Frist Number");
	   l2=new Label("Frist Number");
	   l3=new Label();
	   l4=new Label();
	   t1=new TextField();
	   t2=new TextField();
	   b1=new Button("Add");
	   b2=new Button("Multiply");
	   setLayout(null);
	   l1.setBounds(30,50,100,20);
	   l2.setBounds(30,100,100,20);
	   t1.setBounds(150,50,100,20);
	   t2.setBounds(150,100,100,20);
	   b1.setBounds(40,150,40,20);
	   b2.setBounds(80,150,80,20);
	   l3.setBounds(30,180,100,20);
	   l4.setBounds(60,180,100,20);
	   
	   add(t1);
	   add(t2);
	   add(l1);
	   add(l2);
	   add(b1);
	   add(l3);
	   add(b2);
	   add(l4);
	   b1.addActionListener(new MyHandler());
	   b2.multiplyActionListener(new MyHandler());
	}   
	public class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int a,b,s,r;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			s=a+b;
			r=a*b;
			l3.setText("Sum is "+s);
			l4.setText("Multiply is "+r);
		}
	}
}