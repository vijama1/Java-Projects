interface Demo
{
	void a();
	void show();
}
abstract class DemoClass implements Demo
{
	public void a()
	{
		System.out.print("DemoClass");
	}
}