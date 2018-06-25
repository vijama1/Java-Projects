import java.lang.*;
import java.io.*;
class UseVector
{
	public static void main(String args[]) 
	{
		Console con=System.console();
		try
		{
			
			int number;
			System.out.print("Enter Number of elements you want to enter:");
			
			number=Integer.parseInt(con.readLine());
			if(number!=0)
			{
			Stack1 s1=new Stack1();
		
			String arr[]=new String[number];
		
		for(int i=0;i<number;i++)
		{
			arr[i]=con.readLine();
			s1.push(arr[i]);
		}
		System.out.print("Enter How many elements you want to pop");
		int number1=Integer.parseInt(con.readLine());
		for(int i=0;i<number1;i++)
		
		System.out.println((String)s1.pop());
		s1.empty();
		}
		else
			System.out.print("Found Nothing");
		}
		catch(UnderFlowException e1)
		{
			System.out.print(e1.getMessage());
		}
	}
}