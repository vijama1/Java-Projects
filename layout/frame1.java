import java.awt.*;
class frame1
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(new GridBagLayout());
		Button b1=new Button("OK");
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=2;	gbc.gridy=2;
		gbc.gridwidth=2;	gbc.gridheight=2;
		gbc.ipadx=6;	gbc.ipady=4;
		Insets i=new Insets(2,5,3,6);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;	gbc.weighty=1.0;
		f.add(b1,gbc);
		Button b2=new Button("Cancel");
		gbc.gridx=2;
		f.add(b2,gbc);
		f.setVisible(true);
	}
}