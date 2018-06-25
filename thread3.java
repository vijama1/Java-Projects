import java.io.*;
import java.util.*;
class thread3
{
	public static void main(String args[]) throws IOException
	{
	File f=new File("D:\\learning\\programs\\Assignment3\\thread");
	if(f.exists())
	{
		String arr[];
		
		arr=f.list();
		int count=1;
		int a=1;
		Vector v=new Vector();
		for(int i=0;i<arr.length-1;i++)
		{
			//String s1=count+"";
			try
			{
			//System.out.println(arr[i]);
			FileInputStream fis=new FileInputStream(arr[i]);
			//FileOutputStream fos=new FileOutputStream(s1+".txt");
			int ch;
			while((ch=fis.read())!=-1)
			{
				v.add((char)ch);
				Object ar[]=v.toArray();
				for(int j=0;j<ar.length;j++)
					System.out.print(ar[j]);
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
			//count++;
		}
		//System.out.print("Hello");
		//System.out.print(arr.length);
		
	}
	}
}	
		