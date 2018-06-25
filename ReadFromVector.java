import java.io.*;
import java.util.*;
class ReadFromVector extends Thread
{
    wrtv v = new wrtv();
    File file[];
    int count=0;
    String str=new String();
    public ReadFromVector(wrtv v7)
    {
		v=v7;
		File f=new File("D:\\learning\\programs\\Assignment3\\thread");
        file= f.listFiles();
        count= file.length;
        str="D:\\learning\\programs\\Assignment3\\thread";
						
    }
           
    public void run()
    {
        try
        {
			int a=0;
			for(int i=0 ; i<count; i++)
            {
                String s=a+".txt";
               
                File f=new File(s);
                FileOutputStream fos = new FileOutputStream(f);
				a++;
				long b=file[i].length();
				System.out.println(b);
				
                   for(int j=0;j<b;j++)
				   {   
					int d =(Integer)v.writeToFile();
                   // while(d!= (-1) && file[i].length()>=f.length())
					
                    fos.write(d);
					
				   }
            }
		}
		catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                       
    }
}