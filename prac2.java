package prac1;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

//creating GUI using Swing
class TestSwing extends JFrame
{
	JButton jb;
	JTextField tf1,tf2;
	JPasswordField pf;
	JPanel jp,jp1;
	JLabel l1,l2,l3,l4;

	TestSwing()
	{
		setSize(400,400);                //component class of java.awt
		setTitle("Hello");              //frame class of java.awt


		Container c=this.getContentPane();


		tf1=new JTextField("Email");
		l3=new JLabel(" ");
		jb=new JButton("Login");
		l4=new JLabel(" ");
		pf=new JPasswordField("Password");
		l1=new JLabel("Enter Email");
		l2=new JLabel("Enter Password");

		c.add(jb,"South");
		c.add(tf1,"North");
		c.add(pf,"North");


		jp=new JPanel();
		jp.add(l1);
		jp.add(tf1);
		jp.add(l2);
		jp.add(pf);
		jp.setLayout(new GridLayout(3,2));
		c.add(jp,"North");

		jp1=new JPanel();
		jp1.add(l3);
		jp1.add(jb);
		jp1.add(l4);
		jp1.setLayout(new GridLayout(1,3));
		c.add(jp1,"South");

	}
}


public class prac2 {

	public static void main(String[] args) {

		TestSwing ts=new TestSwing();
		ts.setVisible(true);                 //component class of java.awt
	}

}
