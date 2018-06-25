import java.awt.*;
class frame2
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(new GridBagLayout());
		Label l1=new Label("Name");
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;	gbc.gridy=0;
		gbc.gridwidth=1;	gbc.gridheight=1;
		gbc.ipadx=6;	gbc.ipady=4;
		Insets i=new Insets(2,50,3,60);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		f.add(l1,gbc);
		TextField t1=new TextField();
		gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		f.add(t1,gbc);
		Label l2=new Label("Password");
		gbc.gridy=1;	gbc.gridx=0;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		f.add(l2,gbc);
		TextField t2=new TextField();
		gbc.gridy=1;	gbc.gridx=1;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		f.add(t2,gbc);
		Panel p1=new Panel();
		Button b1=new Button("OK");
		gbc.gridy=2;	gbc.gridx=0;
		gbc.gridwidth=2;
		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.anchor=GridBagConstraints.CENTER;
		p1.add(b1);
		f.add(p1,gbc);
		f.setVisible(true);
		
	}
}