import java.io.*;
class som
{
	public static void main(String args[])
	{
		Console con=System.console();
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		System.out.print("Enter 9 Values");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j]=Integer.parseInt(con.readLine());
		System.out.print("Enter 9 more Values");
			for(i=0;i<b.length;i++)
				for(j=0;j<b[i].length;j++)
				{
					b[i][j]=Integer.parseInt(con.readLine());
					c[i][j]=a[i][j]+b[i][j];
				}
		System.out.println("Sum Matrix is");
			for(i=0;i<c.length;i++)
			{
				for(j=0;j<c[i].length;j++)
					System.out.print(c[i][j]+" ");
					System.out.println();
			}
	}
}
					
	