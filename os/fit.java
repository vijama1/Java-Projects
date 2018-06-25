import java.io.*;
class fit
{
	public static void main(String args[])
	{
		Console con=System.console();
		int ns,np;
		int rs[]=new int [10];
		int ss[]=new int[10];
		int ps[]=new int[10];
		System.out.print("Enter Number of Slots: ");
		ns=Integer.parseInt(con.readLine());
		System.out.print("Enter Number of Processes");
		np=Integer.parseInt(con.readLine());
		
		for(int i=0;i<ns;i++)
		{
			System.out.print("Enter Slot Size ss"+"["+(i)+"]: ");
			ss[i]=Integer.parseInt(con.readLine());
		}
		System.out.println();
		for(int j=0;j<np;j++)
		{
			System.out.print("Enter Process Size ps"+"["+(j)+"]: ");
			ps[j]=Integer.parseInt(con.readLine());
		}
		System.out.println();
		for(int i=0;i<np;i++)
		{
			for(int j=0;j<ns;j++)
			{
				if((ps[i]<=ss[j])&&(ss[j]>0))
				{
					System.out.println();
					System.out.println("ps["+i+"] is alloted to ss["+j+"]");
					rs[j]=ss[j]-ps[i];
					ss[j]=-1;
				}
			}
		}
		System.out.println();
		for(int i=0;i<ns;i++)
		{
			System.out.println("Remaining Slot size is ss["+i+" ]="+rs[i]);
		}
		
	}
}