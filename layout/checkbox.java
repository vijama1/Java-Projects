import java.awt.*;
class checkbox
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(new GridLayout(6,0));
		
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label l1=new Label("Q. Capital of Rajasthan?");
		p1.add(l1);
		f.add(p1);
		
		Panel p2=new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label l2=new Label("A.");
		p2.add(l2);
		Checkbox c1=new Checkbox("Jaipur");
		p2.add(c1);
		f.add(p2);
		
		Panel p3=new Panel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label l3=new Label("C.");
		p3.add(l3);
		Checkbox c2=new Checkbox("Kota");
		p3.add(c2);
		f.add(p3);
		
		Panel p4=new Panel();
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label l4=new Label("C.");
		p4.add(l4);
		Checkbox c3=new Checkbox("Ajmer");
		p4.add(c3);
		f.add(p4);
		
		Panel p5=new Panel();
		p5.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label l5=new Label("D.");
		p5.add(l5);
		Checkbox c4=new Checkbox("Jodhpur");
		p5.add(c4);
		f.add(p5);
		
		Panel p6=new Panel();
		p6.setLayout(new FlowLayout(FlowLayout.LEFT));
		Button b1=new Button("Previous");
		p6.add(b1);
		Button b2=new Button("Next");
		p6.add(b2);
		f.add(p6);
		
		f.setVisible(true);
	}
}