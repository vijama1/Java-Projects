import java.awt.*;
class Question
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(new GridLayout(6,0));
		
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label p1l=new Label("Q. Capital of Rajasthan?");
		p1.add(p1l);
		f.add(p1);
		
		Panel p2=new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label p2l=new Label("A.");
		p2.add(p2l);
		Checkbox c1=new Checkbox("Jaipur");
		p2.add(c1);
		f.add(p2);
		
		Panel p3=new Panel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label p3l=new Label("C.");
		p3.add(p3l);
		Checkbox c2=new Checkbox("Jodhpur");
		p3.add(c2);
		f.add(p3);
		
		Panel p4=new Panel();
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label p4l=new Label("C.");
		p4.add(p4l);
		Checkbox c3=new Checkbox("Bikaner");
		p4.add(c3);
		f.add(p4);
		
		Panel p5=new Panel();
		p5.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label p5l=new Label("D.");
		p5.add(p5l);
		Checkbox c4=new Checkbox("Udaipur");
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