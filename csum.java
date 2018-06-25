import java.io.*;
class csum
{
	public static void main(String args[])
	{
		Console con=System.console();
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j,sum=0;
		System.out.print("Enter 9 Values");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=Integer.parseInt(con.readLine());
				b[j][i]=a[i][j];
			}
		System.out.println("Matrix is");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+" ");
					System.out.println();
			}	
		
		System.out.println("Sum is");
			for(i=0;i<b.length;i++)
			{
				for(j=0;j<b[i].length;j++)
				{
					sum+=b[i][j];
				}
				System.out.print("for" +i+ "column="+sum);
					System.out.println();
					sum=0;
			}
	}
}
					
	