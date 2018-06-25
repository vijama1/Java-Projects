import java.awt.*;
class frame3 
{
	public static void main(String args[])
	{
	Frame f;Panel p1,p2,p3;CardLayout cl;Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
		f=new Frame();
		f.setSize(400,400);
		cl=new CardLayout();
		f.setLayout(new GridBagLayout());
		p1=new Panel();
		p1.setLayout(new GridBagLayout());
		b1=new Button("Name");
		b2=new Button("Surname");
		b3=new Button("Age");
		b4=new Button("H.No");
		b5=new Button("colony");
		b6=new Button("Area");
		b7=new Button("Phone");
		b8=new Button("Email");
		b9=new Button("Salary");
		b10=new Button("HA");
		b11=new Button("TA");
		b12=new Button("DA");
		
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		t7=new TextField();
		t8=new TextField();
		t9=new TextField();
		t10=new TextField();
		t11=new TextField();
		t12=new TextField();
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0; gbc.gridy=0;
		gbc.gridwidth=1; gbc.gridheight=1;
		gbc.ipadx=6; gbc.ipady=4;
		Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(b1);
		t1=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		p1.add(t1);
		
		f.add(p1,gbc);
		f.setVisible(true);
			
	}
}