import java.io.*;
class vhistogram
{
	public static void main(String arg[])
	{
		Console con=System.console();
		int a[]=new int[5];
		int i=0,j=0,k=0,max=0,var;
		System.out.println("Enter  values");
		for(i=0;i<a.length;i++)
		{
		a[i]=Integer.parseInt(con.readLine());
		}
		for(j=0;j<a.length;j++)
		
		{
			if(a[j]>=max)
			max=a[j];
		}
			var=max;
			for(i=0;i<max;i++)
			{
			for(j=0;j<a.length;j++)
			{
				if(a[j]<var)
				{
				System.out.print(" ");
				}
				if(a[j]>=var)
				{
				System.out.print("*");
				}				
			}
			
			var--;
			System.out.println();
			}
			
			
			
	
		}
	}
