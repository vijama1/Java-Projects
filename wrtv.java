import java.io.*;
import java.util.*;
class wrtv
{
    Vector v = new Vector();
           
    synchronized public void writeToVector(int c)
	{
	//System.out.print(c);
		v.add(c);
		notify();
    }
    synchronized public Object writeToFile()
    {
	//System.out.print("Hello oder");
        while(v.size()==0)
        {
			try
            {
				wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        Object obj=v.get(0);
        v.remove(0);
        return obj;
	}           
}


