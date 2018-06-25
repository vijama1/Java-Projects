import java.io.*;
class stpdrone
{
	public static void main(String args[])
	{
		String str,str1;
		int n=0,i,var,j=0,var1=0;
		Console con=System.console();
		System.out.println("Enter the String");
		str=con.readLine();
		char a[],b[]=null;
		a=str.toCharArray();
		n=a.length;
		System.out.print("n is:"+n);
		var=a[0];
		for(i=a.length-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
					b[j]=a[i];
			
			System.out.print(b[j]);}
			
		}
		
	}
}