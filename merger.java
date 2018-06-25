import java.io.*;
class merger
{
	public static void main(String args[]) throws IOException
	{
		Console con=System.console();
		String filename=con.readLine();
		String fname="."+filename;
		File f=new File("D:\\learning\\programs\\Assignment3");
		int count=1;
		String s1=count+"";
		if (f.exists())
		{
		String a[];
		a=f.list();
		
			for(int i=1;i<a.length;i++)
			{
				if(a[i].contains(fname))
				{
					FileInputStream fis5=new FileInputStream(a[i]);
					FileOutputStream fos2=new FileOutputStream(filename,true);
					int ch;
					while((ch=fis5.read())!=-1)
					{
						fos2.write(ch);
					}
					fos2.close();
				}
			
			
			}
		
		
		}
	}
			
}	