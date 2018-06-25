class one implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am First");
		}
	}
}
class two implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am Second");
		}
	}
}
class three implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am Third");
		}
	}
}
class thread2
{
	public static void main(String args[]) throws InterruptedException
	{
		one o=new one();
		Thread t1=new Thread(o);
		t1.start();
		t1.join(2000);
		t1.interrupt();
		two t=new two();
		Thread t2=new Thread(t);
		t2.start();
		t2.setPriority(2);
		System.out.println(t2.getPriority());
		three th=new three();
		Thread t3=new Thread(th);
		t3.start();
		t3.setPriority(3);
		for(int i=1;i<=10;i++)
			System.out.println("i am main");
	}
}