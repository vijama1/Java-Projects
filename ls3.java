import java.io.*;
class ls3
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,w,j,n;
        Console con = System.console();
                               
        System.out.println("Enter the Array Elements:");
        for(i=0;i<a.length;i++)
        a[i]=Integer.parseInt(con.readLine());
        System.out.print("Enter Positions to be Shifted:");
        n=Integer.parseInt(con.readLine());
        for(j=0;j<n;j++)
        {
            w=a[0];
            for(i=0;i<a.length-1;i++)
                a[i]=a[i+1];
                a[9]=w;
        }
		System.out.print("Sorted Array is:");
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
		
	}
}
