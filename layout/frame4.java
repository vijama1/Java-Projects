import java.awt.*;
import java.awt.event.*;
class frame4 implements ActionListener
{
	Frame f;Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;Panel p1,p,p2,p3,ps,p4;Button b1,b2,b3,b4,b5,b6,b7,b8;CardLayout cl;
	public frame4()
	{
		f=new Frame();
		f.setSize(400,400);
		cl=new CardLayout();
		f.setLayout(cl);
		p1=new Panel();
		p1.setLayout(new GridBagLayout());
		l1=new Label("Name");
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;	gbc.gridy=0;
		gbc.gridwidth=1;	gbc.gridheight=1;
		gbc.ipadx=6;	gbc.ipady=4;
		Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(l1,gbc);
		t1=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(t1,gbc);
		l2=new Label("Surname");
		gbc.gridy=1;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(l2,gbc);
		t2=new TextField();
		gbc.gridy=1;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(t2,gbc);
		l3=new Label("Age");
		gbc.gridy=2;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(l3,gbc);
		t3=new TextField();
		gbc.gridy=2;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(t3,gbc);
		b1=new Button("Back");
		gbc.gridy=3;	gbc.gridx=0;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(b1,gbc);
		b1.addActionListener(this);
		b2=new Button("Next");
		gbc.gridy=3;	gbc.gridx=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(b2,gbc);
		b2.addActionListener(this);
		f.add(p1,"First Panel");
		
		p2=new Panel();
		p2.setLayout(new GridBagLayout());
		l4=new Label("H.no");
		//GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;	gbc.gridy=0;
		gbc.gridwidth=1;	gbc.gridheight=1;
		gbc.ipadx=6;	gbc.ipady=4;
		//Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(l4,gbc);
		t4=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(t4,gbc);
		l5=new Label("Colony");
		gbc.gridy=1;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(l5,gbc);
		t5=new TextField();
		gbc.gridy=1;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(t5,gbc);
		l6=new Label("Ciy");
		gbc.gridy=2;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(l6,gbc);
		t6=new TextField();
		gbc.gridy=2;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(t6,gbc);
		b3=new Button("Back");
		gbc.gridy=3;	gbc.gridx=0;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(b3,gbc);
		b3.addActionListener(this);
		b4=new Button("Next");
		gbc.gridy=3;	gbc.gridx=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p2.add(b4,gbc);
		b4.addActionListener(this);
		f.add(p2,"Second Panel");
		
		p3=new Panel();
		p3.setLayout(new GridBagLayout());
		l7=new Label("Phone");
		//GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;	gbc.gridy=0;
		gbc.gridwidth=1;	gbc.gridheight=1;
		gbc.ipadx=6;	gbc.ipady=4;
		//Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(l7,gbc);
		t7=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(t7,gbc);
		l8=new Label("Email");
		gbc.gridy=1;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(l8,gbc);
		t8=new TextField();
		gbc.gridy=1;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(t8,gbc);
		l9=new Label("Fax");
		gbc.gridy=2;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(l9,gbc);
		t9=new TextField();
		gbc.gridy=2;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(t9,gbc);
		b5=new Button("Back");
		gbc.gridy=3;	gbc.gridx=0;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(b5,gbc);
		b5.addActionListener(this);
		b6=new Button("Next");
		gbc.gridy=3;	gbc.gridx=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p3.add(b6,gbc);
		b6.addActionListener(this);
		f.add(p3,"Third Panel");
		
		p4=new Panel();
		p4.setLayout(new GridBagLayout());
		l10=new Label("Salary");
		//GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;	gbc.gridy=0;
		gbc.gridwidth=1;	gbc.gridheight=1;
		gbc.ipadx=6;	gbc.ipady=4;
		//Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(l10,gbc);
		t10=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(t10,gbc);
		l11=new Label("HRA");
		gbc.gridy=1;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(l11,gbc);
		t11=new TextField();
		gbc.gridy=1;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(t11,gbc);
		l12=new Label("DA");
		gbc.gridy=2;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(l12,gbc);
		t12=new TextField();
		gbc.gridy=2;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(t12,gbc);
		b7=new Button("Back");
		gbc.gridy=3;	gbc.gridx=0;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(b7,gbc);
		b7.addActionListener(this);
		b8=new Button("Next");
		gbc.gridy=3;	gbc.gridx=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p4.add(b8,gbc);
		b8.addActionListener(this);
		f.add(p4,"Fourth Panel");
		f.setVisible(true);
		cl.last(f);
		cl.first(f);
		cl.next(f);
		cl.previous(f);
		cl.show(f,"First Panel");
		//cl.show(f,"South");
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			cl.previous(f);
		}
		else if(e.getSource()==b2)
		{
			cl.next(f);
		}
		else if(e.getSource()==b3)
		{
			cl.previous(f);
		}
		else if(e.getSource()==b4)
		{
			cl.next(f);
		}
		else if(e.getSource()==b5)
		{
			cl.previous(f);
		}
		else if(e.getSource()==b6)
		{
			cl.next(f);
		}
		else if(e.getSource()==b7)
		{
			cl.previous(f);
		}
		else if(e.getSource()==b8)
		{
			cl.next(f);
		}
	}
	public static void main(String args[])
	{
		frame4 f=new frame4();
	}
}