import java.awt.*;
import java.awt.event.*;
class calculator implements ActionListener
{
	Frame f; TextArea t,t2;Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;Panel p1,p2,p3,p4;String value="";
	double v1,v2,answer;
	int ctr;
	char o;
	public calculator()
	{
		f=new Frame("Calculator");
		f.setSize(400,400);
		t=new TextArea();
		GridLayout gl=new GridLayout(6,0);
		f.setLayout(gl);
		t2=new TextArea();
		f.add(t2);
		f.add(t);
		
		b1=new Button("1");
		b1.addActionListener(this);
		b2=new Button("2");
		b2.addActionListener(this);
		b3=new Button("3");
		b3.addActionListener(this);
		b4=new Button("+");
		b4.addActionListener(this);
		b5=new Button("4");
		b5.addActionListener(this);
		b6=new Button("5");
		b6.addActionListener(this);
		b7=new Button("6");
		b7.addActionListener(this);
		b8=new Button("-");
		b8.addActionListener(this);
		b9=new Button("7");
		b9.addActionListener(this);
		b10=new Button("8");
		b10.addActionListener(this);
		b11=new Button("9");
		b11.addActionListener(this);
		b12=new Button("*");
		b12.addActionListener(this);
		b13=new Button("c");
		b13.addActionListener(this);
		b14=new Button("0");
		b14.addActionListener(this);
		b15=new Button("/");
		b15.addActionListener(this);
		b16=new Button("=");
		b16.addActionListener(this);
		GridLayout g2=new GridLayout(0,4);
		p1=new Panel();
		p1.setLayout(g2);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p2=new Panel();
		p2.setLayout(g2);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p3=new Panel();
		p3.setLayout(g2);
		p3.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		p4=new Panel();
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
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("1"))
		{
			t.appendText("1");
			value+=1;
			t2.setText(value);
		}
		
		if(str.equals("2"))
		{
			t.appendText("2");
			value+=2;
			t2.setText(value);
		}
		
		if(str.equals("3"))
		{
			t.appendText("3");
			value+=3;
			t2.setText(value);
		}
		
		if(str.equals("4"))
		{
			t.appendText("4");
			value+=4;
			t2.setText(value);
		}
		
		if(str.equals("5"))
		{
			t.appendText("5");
			value+=5;
			t2.setText(value);
		}
		
		if(str.equals("6"))
		{
			t.appendText("6");
			value+=6;
			t2.setText(value);
		}
		if(str.equals("7"))
		{
			t.appendText("7");
			value+=7;
			t2.setText(value);
		}
		
		if(str.equals("8"))
		{
			t.appendText("8");
			value+=8;
			t2.setText(value);
		}
		
		if(str.equals("9"))
		{
			t.appendText("9");
			value+=9;
			t2.setText(value);
		}
		
		if(str.equals("c"))
		{
			t.setText("");
			t2.setText("");
		}
		if(str.equals("0"))
		{
			t.appendText("0");
			value+=0;
			t2.setText(value);
		}
		else if(str.equals("/"))
		{
			t.setText("/");
			v1=Double.parseDouble(t2.getText());
			ctr=4;
			o='/';
			value="";
			t2.setText(value+"");
		}
		if(str.equals("+"))
		{
			v1=Double.parseDouble(t2.getText());
			ctr=1;
			o='+';
			value="";
			t2.setText(value+"");
			t.appendText("+");
		}
		
		if(str.equals("-"))
		{
			v1=Double.parseDouble(t2.getText());
			ctr=2;
			o='-';
			value="";
			t2.setText(value+"");
			t.appendText("-");
		}
		if(str.equals("*"))
		{
			v1=Double.parseDouble(t2.getText());
			ctr=3;
			o='*';
			value="";
			t2.setText(value+"");
			t.setText("*");
		}
		if(str.equals("="))
		{
			value="";
			v2=Double.parseDouble(t2.getText());
			if(ctr==1)
			{
				
				v2 = v1 + v2;
				t2.setText("" +answer);
				value=""; 
			}
			else if(ctr==2)
			{
				
				answer = v1 - v2;
				t2.setText("" +answer);
				value=""; 
			}
			else if(ctr==3)
			{
				answer = v1 * v2;
				t2.setText("" +answer);
				value="";
			}
			else if(ctr==4)
			{
				answer = v1 / v2;
				t2.setText("" +answer);
				value="";
			}
					
		
		}
	}

public static void main(String args[])
{
	calculator d=new calculator();
	
}
}