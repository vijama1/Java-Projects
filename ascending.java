import java.io.*;
class ascending
{
	public static void main(String args[])
	{
		Console con=System.console();
		int a[]=new int[5];
		int i,j,temp=0,max=0,n;
		System.out.print("Enter  values");
		n=a.length;
		
		for(i=0;i<n;i++)
		{	
		a[i]=Integer.parseInt(con.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				continue;
			}
			temp=a[n-1];
			a[n-1]=max;
			
		}	
		for(i=0;i<a.length;i++)
				System.out.print(a[i]);
			System.out.println();
	}
	
}
