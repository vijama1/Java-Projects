import java.io.*;
class ls2
{
	public static void main(String args[])
	{
		Console con=System.console();
		int a[]=new int[5];
		int i,j,temp=0,w=0;
		System.out.print("Enter  values");
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(con.readLine());
		}
		
		System.out.print("Enter n:");
		int n;
		n=Integer.parseInt(con.readLine());
		
		
		for(j=0;j<n;j++)
		{
		
		w=a[0];
		for(i=0;i<4;i++)
		{
		a[i]=a[i+1];
		a[4]=w;
		}
		}
		
		
		System.out.print(""+a[i]);
		
		System.out.println();
		
		
	}
}
