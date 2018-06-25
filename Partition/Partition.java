import java.io.*;

class Partition
{
	public static void main(String args[]) throws Exception
	{
		Console con=System.console();
		String filename;
		System.out.print("Enter File to be Created:");
		filename=con.readLine();
		File fis1=new File(filename);
		if(!fis1.exists())
		{
			fis1.createNewFile();
		}
		int fsize;
		System.out.print("Enter Size of Destination File:");
		fsize=Integer.parseInt(con.readLine());
		System.out.println("Current Size of File is "+fis1.length()+" Bytes");
		long number=fis1.length()/fsize;
		if(fis1.length()%fsize>0)
		{
			number=number+1;
		}
		System.out.print("Total Number of file in Destination is:"+number);
		int i=0;
		String s1;
		int count=1;
			FileInputStream fis3=new FileInputStream(filename);
		for(i=1;i<=number;i++)
		{
			s1=count+"";
			FileOutputStream fos1=new FileOutputStream(s1+"."+filename);
			File fis2=new File(s1+"."+filename);
			
			RandomAccessFile raf=new RandomAccessFile("fis2","rw");
			count++;
			int ch;
			while((fis2.length()<fsize)&&(ch=fis3.read())!=-1)
			{
				fos1.write(ch);
			}
				fos1.close();
				
		}
		fis3.close();
		fis1.delete();
		
}
	
}