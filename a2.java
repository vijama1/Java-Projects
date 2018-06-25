class HoldInteger
{
	private int sharedInt;
	private boolean empty=true;
	synchronized public void setSharedInt(int value)
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e1)
			{
				System.out.print(e1.getMessage());
			}
		}
		sharedInt=value;
		empty=false;
		notify();
	}
	synchronized public int getSharedInt()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e2)
			{
				System.out.print(e2.getMessage());
			}
		}
		notify();
		empty=true;
		return sharedInt;
		
	}
}
class producer extends Thread
{
	private HoldInteger pHold;
	public producer(HoldInteger h)
	{
		pHold=h;
	}
	public void run()
	{
		for(int count=1;count<=10;count++)
		{
			pHold.setSharedInt(count);
			System.out.println("Producers Assigned: "+count);
			try
			{
				sleep((int)(Math.random()*1000));
			}
			catch(InterruptedException e1)
			{
				System.out.print(e1.getMessage());
			}
		}
	}
}
class consumer extends Thread
{
	private HoldInteger cHold;
	public consumer(HoldInteger h)
	{
		cHold=h;
	}
	public void run()
	{
		int value;
		value=cHold.getSharedInt();
		System.out.print("Consumer got: "+value);
		while(value!=10)
		{
			try
			{
				sleep((int)(Math.random()*1000));
			}
			catch(InterruptedException e1)
			{
				System.out.print(e1.getMessage());
			}
			value=cHold.getSharedInt();
			System.out.print("Consumer got: "+value);
		}
	}
}
public class a2
{
	public static void main(String args[])
	{
		HoldInteger h=new HoldInteger();
		producer p=new producer(h);
		consumer c=new consumer(h);
		p.start();
		c.start();
	}
}