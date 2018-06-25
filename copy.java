import java.io.*;
class copy
{
	public static void main(String args[]) throws IOException
	{
	FileInputStream fis1=new FileInputStream("A.txt");
	FileInputStream fis2=new FileInputStream("B.txt");
	FileOutputStream fos=new FileOutputStream("C.txt",true);
		int ch;
		while((ch=fis1.read())!=-1)
		fos.write(ch);
		while((ch=fis2.read())!=-1)
		fos.write(ch);
	
		fis1.close();
		fis2.close();
		fos.close();
	}
}
			
	