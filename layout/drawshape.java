import java.awt.*;
import java.awt.event.*;
class drawshape extends MouseAdapter implements MouseMotionListener
{
	Frame f;Panel p;Point p1;int x,y;Graphics g;int x1,y1,a=1;
	public drawshape()
	{
		f=new Frame();
		f.setSize(500,500);
		p=new Panel();
		f.add(p);
		p.addMouseMotionListener(this);
		p.addMouseListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e)
	{
		/*x=e.getX();
		y=e.getY();
		g=p.getGraphics();
		//g.setColor(Color.red);
		g.drawLine(x-1,y-1,x,y);*/
	}
	public void mouseDragged(MouseEvent e)
	{
	x=e.getX();
  	y=e.getY();
  	if(a==1)
  	{
  	 	x1=x;
  	 	y1=y; 
  	 	a++;
  	 }
  	g=p.getGraphics();
   	g.drawLine(x1,y1,x,y);
    x1=x;
    y1=y;
   
	}
	public void mouseReleased(MouseEvent e1)
	{
		a=1;
	}
	public static void main(String args[])
	{
		drawshape d=new drawshape();
	}
}