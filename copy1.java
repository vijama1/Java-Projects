import java.io.*;
class copy1
{
	public static void main(String args[]) throws IOException
	{
		for(int i=0;i<args.length-1;i++)
		{
			FileInputStream fis1=new FileInputStream(args[i]);
			FileOutputStream fos=new FileOutputStream(args[args.length-1],true);
		int ch;
		while((ch=fis1.read())!=-1)
		fos.write(ch);
	
		fis1.close();
		fos.close();
		}
	}
}
			
	