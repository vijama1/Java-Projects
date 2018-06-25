import java.io.*;
class ls1
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
		
		
		for(i=0;i<a.length;i++)
		{
		
		if(i<=n){
			
			w=a[i];
		}
		else
		
			a[i]=w;

		a[i]=a[i+n];
		
		
		System.out.print(""+a[i]);
		
		System.out.println();
		}
		
	}
}
