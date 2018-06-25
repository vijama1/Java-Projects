import java.awt.*;
import java.awt.event.*;
class slider implements AdjustmentListener
{
	Frame f;Panel p1,p2;Scrollbar sb1,sb2,sb3;Label l1,l2,l3;TextField t1,t2,t3;int value1=0,value2=0,value3=0;
	public slider()
	{
		f=new Frame();
		f.setSize(400,400);
		p1=new Panel();
		f.add(p1, "East");
		GridLayout gl=new GridLayout(0,3);
		p1.setLayout(gl);
		sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		sb1.addAdjustmentListener(this);
		p1.add(sb1);
		sb2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		sb2.addAdjustmentListener(this);
		p1.add(sb2);
		sb3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		sb3.addAdjustmentListener(this);
		p1.add(sb3);
		
		p2=new Panel();
		p2.setLayout(new FlowLayout());
		f.add(p2,"South");
		l1=new Label("Red"); t1=new TextField(5);
		l2=new Label("Green"); t2=new TextField(5);
		l3=new Label("Blue"); t3=new TextField(5);
		p2.add(l1); p2.add(t1);
		p2.add(l2); p2.add(t2);
		p2.add(l3); p2.add(t3);
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		
		if(e.getSource()==sb1)
		{
			value1=sb1.getValue();
			t1.setText(value1+"");
		}
		else if(e.getSource()==sb2)
		{
			value2=sb2.getValue();
			t2.setText(value2+"");
		}
		else if(e.getSource()==sb3)
		{
			value3=sb3.getValue();
			t3.setText(value3+"");
		}
		//Color c=new Color(value1,value2,value3);
		//System.out.print(value1+value2+value3);
		f.setBackground(new Color(value1,value2,value3));
	}
	public static void main(String args[])
	{
		slider s=new slider();

	}
}