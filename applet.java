import java.awt.*;
import java.applet.*;
public class applet extends Applet
{
	public void init()
	{
		Label l=new Label("Enter Name");
		add(l);
		TextField t=new TextField();
		add(t);
		Button b=new Button("Click");
		add(b);
	}
}