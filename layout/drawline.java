import java.awt.*;
import java.awt.event.*;
class drawline extends Frame implements MouseMotionListener
{
	Frame f;Panel p;Point p1;int x,y;Graphics g;
	public drawline()
	{
		f=new Frame();
		f.setSize(500,500);
		p=new Panel();
		f.add(p);
		p.addMouseMotionListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		g=p.getGraphics();
		g.setColor(Color.red);
		g.drawLine(0,0,x,y);
		g.setColor(Color.green);
		g.drawLine(f.getWidth(),0,x,y);
		g.setColor(Color.blue);
		g.drawLine(0,f.getHeight()-50,x,y);
		g.setColor(Color.yellow);
		g.drawLine(f.getWidth(),f.getHeight(),x,y);
		//System.out.print(f.getWidth().,f.getHeight());
	}
	public void mouseDragged(MouseEvent e)
	{
	}
	public static void main(String args[])
	{
		drawline d=new drawline();
	}
}