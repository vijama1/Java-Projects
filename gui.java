import java.awt.*;
class Demo
{
	public static void main(String args[])
	{
		Frame f=new Frame("Calculator");
		f.setSize(400,400);
		TextArea t=new TextArea();
		/*Dimension d=new Dimension();
		d.width=30;
		d.height=400;
		t.setSize(d);
		t.setSize(400,30);*/
		
		GridLayout gl=new GridLayout(5,0);
		
		f.setLayout(gl);
		f.add(t);
		Button b1=new Button("1");
		//b1.setSize(100,75);
		Button b2=new Button("2");
		//b2.setSize(100,75);
		Button b3=new Button("3");
		//b3.setSize(100,75);
		Button b4=new Button("+");
		//b4.setSize(100,75);
		Button b5=new Button("4");
		//b5.setSize(100,75);
		Button b6=new Button("5");
		//b6.setSize(100,75);
		Button b7=new Button("6");
		//b7.setSize(100,75);
		Button b8=new Button("-");
		//b8.setSize(100,75);
		Button b9=new Button("7");
		//b9.setSize(100,75);
		Button b10=new Button("8");
		//b10.setSize(100,75);
		Button b11=new Button("9");
		//b11.setSize(100,75);
		Button b12=new Button("*");
		//b12.setSize(100,75);
		Button b13=new Button("c");
		//b13.setSize(100,75);
		Button b14=new Button("0");
		//b14.setSize(100,75);
		Button b15=new Button("/");
		//b15.setSize(100,75);
		Button b16=new Button("=");
		//b16.setSize(100,75);
		/*add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);*/
		GridLayout g2=new GridLayout(0,4);
		Panel p1=new Panel();
		p1.setLayout(g2);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		Panel p2=new Panel();
		p2.setLayout(g2);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		Panel p3=new Panel();
		p3.setLayout(g2);
		p3.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		Panel p4=new Panel();
		p4.setLayout(g2);
		p4.add(b13);
		p4.add(b14);
		p4.add(b15);
		p4.add(b16);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		
		f.setVisible(true);
	}
}