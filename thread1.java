class one extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am First");
		}
	}
}
class two extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am Second");
		}
	}
}
class three extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I am Third");
		}
	}
}
class thread1
{
	public static void main(String args[])
	{
		one o=new one();
		o.start();
		two t=new two();
		t.start();
		three th=new three();
		th.start();
		for(int i=1;i<=10;i++)
			System.out.println("i am main");
	}
}