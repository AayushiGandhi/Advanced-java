package prac1;
import java.awt.Container;

import javax.swing.*;

//creating GUI using Swing
class TestSwing extends JFrame
{
	//private static final Object String = null;
	JButton jb;
	JTextField tf;
	JRadioButton r;
	JComboBox cb;
	JScrollBar sb;
	JPanel jp;

	TestSwing()
	{
		setSize(400,400);                //component class of java.awt
		setTitle("Hello");              //frame class of java.awt

		jb=new JButton("Ok");
		Container c=this.getContentPane();
		c.add(jb,"South");

		tf=new JTextField("Hey");
		r=new JRadioButton("Select");
		cb=new JComboBox();                 //combo box means drop down menu
		sb=new JScrollBar();

		c.add(tf,"North");
		c.add(r,"East");
		c.add(cb,"Center");
		c.add(sb,"West");

		cb.addItem("first");
		cb.addItem("second");

		jp=new JPanel();
		jp.add(tf);                 //add components in panel
		jp.add(r);
		jp.add(cb);
		jp.add(sb);
		jp.add(jb);
		c.add(jp);               //add panel in container
	}
}


public class prac1 {

	public static void main(String[] args) {

		TestSwing ts=new TestSwing();
		ts.setVisible(true);                 //component class of java.awt
	}

}
