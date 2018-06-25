import java.io.*;
import java.util.*;
class ReadFile extends Thread
{
    wrtv v = new wrtv();
    File file[];
    int count=0;
    public ReadFile(wrtv v5)
    {
        v=v5;
        File f=new File("D:\\learning\\programs\\Assignment3\\thread");
        file=f.listFiles();
        count=file.length;
        for(int i=0;i<file.length;i++)
        System.out.println(file[i].getName());
    }
    public void run()
    {
		for(int i=0 ; i<count ;i++)
		{
            try
            {
				FileInputStream fis = new FileInputStream(file[i]);
                int ch;
					//System.out.print("Hello");
                while((ch=fis.read())!=-1)
                {
                    v.writeToVector(ch);
					//System.out.print("Hello");
                }
				//System.out.print("Hello World");
            }
            catch(Exception e)
			{
                System.out.println(e.getMessage());
            }
                                   
        }
		//System.out.print("Hello World");
                       
	}
}
