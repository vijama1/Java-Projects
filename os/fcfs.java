import java.io.*;
class fcfs
{
	public static void main(String args[])
	{
		Console con=System.console();
		int n,a;
		float avtat=0,avwt=0;
		int p[]=new int[10];
		int at[]=new int[10];
		int bt[]=new int[10];
		int ct[]=new int[10];
		int tat[]=new int[10];
		int wt[]=new int[10];
		int pn[]=new int[10];
		int t1,t2,t3,t4,min=0;
		System.out.print("Enter Number of processes: ");
		n=Integer.parseInt(con.readLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Process ID: ");
			p[i]=Integer.parseInt(con.readLine());
			/*System.out.print("Enter Arrival time: ");
			at[i]=Integer.parseInt(con.readLine());*/
			System.out.print("Enter Burst time: ");
			bt[i]=Integer.parseInt(con.readLine());
			System.out.println();
		}
		
		for(int k=1;k<n;k++)
		{
			for(int j=0;j<(n-k);j++)
			{
				if(at[j]>at[j+1])
				{
					t1=at[j];
					at[j]=at[j+1];
					at[j+1]=t1;
					min=at[j];
					t2=p[j];
					p[j]=p[j+1];
					p[j+1]=t2;
					
					t3=bt[j];
					bt[j]=bt[j+1];
					bt[j+1]=t3;
				}
			}
		}
		ct[0]=bt[0]+min;
		tat[0]=ct[0]-at[0];
		wt[0]=tat[0]-bt[0];
		avtat=tat[0];
		avwt=wt[0];
		for(int i=1;i<n;i++)
		{
			ct[i]=ct[i-1]+bt[i];
			tat[i]=ct[i]-at[i];
			wt[i]=tat[i]-bt[i];
			avtat+=tat[i];
			avwt+=wt[i];
		}
		
		System.out.println("PID"+"\t"+"BT"+"\t"+"CT"+"\t"+"TAT"+"\t"+"WT");
		for(int i=0;i<n;i++)
		{
			System.out.println(p[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
		}
		System.out.println((avtat/n)+" "+(avwt/n));
	}
}