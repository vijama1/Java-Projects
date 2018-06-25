import java.io.*;
import java.util.*;
import java.util.regex.*;
class thread6 extends Thread
{
	public static void main(String args[]) throws Exception
	{
		Console con=System.console();
		String dirname;
		System.out.print("Enter Name of the Directory");
		dirname=con.readLine();
		File f=new File("D:\\learning\\programs\\Assignment3",dirname);
			String arr[];
			int count;
			arr=f.list();
			//count=arr.length;
			//int i;
			try
			{
			for(int i=0;i<arr.length;i++)
			{	//System.out.println(arr[i]);
				//System.out.print("Hello");
		
            
                //int ch;
				//int a[]=new int[10];
				FileInputStream fis = new FileInputStream(arr[i]);
				//StreamTokenizer st=new StreamTokenizer(fis);
				//for(int j=0;j<10;j++)
				/*while(st.nextToken()!=StreamTokenizer.TT_EOF)
					{
						System.out.print("Hello You");
						switch(st.ttype)
						{
							case StreamTokenizer.TT_WORD:
							break;
							case StreamTokenizer.TT_NUMBER:
							//a[j]=StreamTokenizer.TT_NUMBER;
							//System.out.print(a[j]);
							break;
						}
					}*/
		
				
             // while((ch=fis.read())!=-1)
                
                   /* Pattern p=Pattern.compile("\\d+");
					Matcher m=p.matcher(arr[i]);
					System.out.print("Hello");
					while(m.find())
					System.out.print("Hello");*/
                
				//System.out.print("Hello World");
		
		}
			}
            catch(Exception e)
			{
                System.out.println(e.getMessage());
            }
			                       
			
		//System.out.print("Hello World");
    }                   
}
	