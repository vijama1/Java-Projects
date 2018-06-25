import java.awt.*;
import java.awt.event.*;
class Painting extends MouseAdapter implements MouseMotionListener
{
 Frame f;
 Graphics g;
 int x,y,x1,y1,count=1;
 public Painting()
 {
  	f=new Frame();
  	f.setSize(300,400);
  	f.addMouseMotionListener(this);
  	f.addMouseListener(this);
  	f.setVisible(true);
 }
 public void mouseDragged(MouseEvent e)
 {
    x=e.getX();
  	y=e.getY();
  	if(count==1)
  	{
  	 	x1=x;
  	 	y1=y; 
  	 	count++;
  	 }
  	g=f.getGraphics();
  	g.setColor(Color.blue);
   	g.drawLine(x1,y1,x,y);
    x1=x;
    y1=y;
   
 }
 
 public void mouseReleased(MouseEvent e2)
 {
  count=1;
 }
 
 
 public void mouseMoved(MouseEvent e1)
 {
 
 }
 
 
 public static void main(String args[])
 {
 	Painting p=new Painting();
 }
}