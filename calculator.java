import java.awt.*;
import java.awt.event.*;
import java.util.*;

class calculator extends WindowAdapter implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextArea ta=new TextArea("",1,1,TextArea.SCROLLBARS_NONE);
	Integer total,n2,n1,mid=0;
	int inn;

String temp="",no1="",no2="",check="",chk="";

public calculator()
{
	Frame f=new Frame("Calculator");    f.setSize(400,400);
    f.setLayout(new GridLayout(5,1));
	f.addWindowListener(this);


    
    Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();

	f.add(ta);
	f.add(p1);
	f.add(p2);
	f.add(p3);
	f.add(p4);
	p1.setLayout(new GridLayout(1,4));
	p2.setLayout(new GridLayout(1,4));
	p3.setLayout(new GridLayout(1,4));
    p4.setLayout(new GridLayout(1,4));



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
	b13=new Button("C");
	b13.addActionListener(this);
	b14=new Button("0");
	b14.addActionListener(this);
	b15=new Button("/");
	b15.addActionListener(this);
	b16=new Button("=");
	b16.addActionListener(this);

	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p2.add(b5);
	p2.add(b6);
	p2.add(b7);
	p2.add(b8);
	p3.add(b9);
	p3.add(b10);
	p3.add(b11);
	p3.add(b12);
	p4.add(b13);
	p4.add(b14);
	p4.add(b15);
	p4.add(b16);


f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
	String str=e.getActionCommand();
	
	switch (str)
{
	case "1":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	//System.out.println(no2);
	ta.setText(no2);
	chk="";
	break;
	case "2":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "3":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "4":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "5":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "6":
		clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "7":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case "8":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case"9":
		clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case"0":
	clearr();
	temp=ta.getText();
	no2=temp+str;
	ta.setText(no2);
	chk="";
	break;
	case"+":
	if(no1.equals(""))
	{	
		no1=no2;
		no2="";
    check="+";
	ta.setText(null);
	}
	else
	{
		if(no2.equals(""))
	{
		check="+";
		chk="clearit";
	}	
	else
	{
	ans();
	check="+";
	no2="";	    
	}	
	}	
	break;
	case"-":
	if(no1.equals(""))
	{
	
		no1=no2;
		no2="";
		check="-";
		ta.setText(null);
		}
	else
	{
	if(no2.equals(""))
	{
		check="-";
	chk="clearit";
	}

	else
	{
	ans();
	no2="";
	check="-";
	}	
	}	
	break;
	case "*":
       if(no1.equals(""))
	{

	no1=no2;
	no2="";
    check="*";
	ta.setText(null);
	}
	else
	{
	if(no2.equals(""))
	{
	check="*";
	chk="clearit";
	}

	else
	{
	ans();
	no2="";
	check="*";
		}	
	} 
		break;
	case"/":
	{
	if(no1.equals(""))
	{

	no1=no2;
	no2="";
    check="/";
	ta.setText(null);
	}
	else
	{
	if(no2.equals(""))
	{
	check="/";
	chk="clearit";	
	}

	else
	{
	ans();
	no2="";
	check="/";
	}	
	}
    }
case"C":
{
check=no1=no2=temp="";
mid=n2=n1=0;
    ta.setText("");
    }
case"=":
{
if(!(no2.equals("")))
{
ans();	
    no2="";        
}

}	
}	
}

	public void ans()
	{
	if(mid==0)               
	{
		if(check.equals("+"))
		{
		n1=Integer.parseInt(no1);
		n2=Integer.parseInt(no2);
		total=n1+n2;
		ta.setText(total+"");
		}

	if(check.equals("-"))
	{

	n1=Integer.parseInt(no1);
	n2=Integer.parseInt(no2);
	total=n1-n2;
	ta.setText(total+"");
	}
	if(check.equals("*"))
	{
	n1=Integer.parseInt(no1);
		n2=Integer.parseInt(no2);
	total=n1*n2;
	ta.setText(total+"");
	}
		if(check.equals("/"))
	{
	n1=Integer.parseInt(no1);
	n2=Integer.parseInt(no2);
	total=n1/n2;
	ta.setText(total+"");
	}
	mid=total;
	chk="clearit";
	}	
	else
	{

	if(check.equals("+"))
	{

	n2=Integer.parseInt(no2);
	total=mid+n2;
	ta.setText(total+"");
	}

	if(check.equals("-"))
	{


	n2=Integer.parseInt(no2);
	total=mid-n2;
	ta.setText(total+"");
	}
	if(check.equals("*"))
	{

	n2=Integer.parseInt(no2);
	total=mid*n2;
	ta.setText(total+"");
	}
	if(check.equals("/"))
	{

	n2=Integer.parseInt(no2);
	total=mid/n2;
	ta.setText(total+"");
	}
	chk="clearit";
	mid=total;
	}
	check="";

}


	public void clearr()
	{
	if(chk.equals("clearit"))
	{

	ta.setText("");
	}
	}
	public void windowClosing(WindowEvent e1)
	{
	System.out.println("window");
	Window w=e1.getWindow();
	w.setVisible(false);
	w.dispose();
	System.exit(0);
	}
	public static void main(String args[])
	{
	calculator ca=new calculator();
	}	


}