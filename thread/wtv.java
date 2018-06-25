import java.io.*;
import java.util.*;
aman wtv extends Thread
{
	
		int count=1;
		int a=1;
		boolean value=false;
	synchronized public void wrtv(int v2) throws Exception
	{
			File f=new File("D:\\learning\\programs\\Assignment3\\thread");
		if(f.exists())
		{
		String arr[];
		
		arr=f.list();
		Vector v=new Vector();
		for(int i=0;i<arr.length-2;i++)
		{
			String s1=count+"";
			try
			{
			//System.out.println(arr[i]);
			FileInputStream fis=new FileInputStream(arr[i]);
			//FileOutputStream fos=new FileOutputStream(s1+".txt");
			int ch;
			while((ch=fis.read())!=-1)
			{
				v.add((char)ch);
				while(value==true)
				{
					try
					{
					wait();
					}
					catch(InterruptedException e2)
					{
						System.out.print(e2.getMessage());
					}
				}
				FileOutputStream fos=new FileOutputStream(s1+".txt");
				fos.write((int)v.elementAt(a));
				a++;
				//ListIterator l=v.listIterator();
				//System.out.print((char)v.get(a));
				//fos.write(ch);
				//v.remove(a);
			}
			}
			catch(FileNotFoundException e1)
			{
				System.out.print(e1.getMessage());
			}
			count++;
		}
		
				/*Object ar[]=v.toArray();
				for(int j=0;j<ar.length;j++)
					System.out.print(ar[j]);*/
				//System.out.print(" ");
		//System.out.print("Hello");
		//System.out.print(arr.length);
		
	}
	}
}