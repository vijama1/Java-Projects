class point
{
	private int x;
	private int y;
	final private int z;
	public point()
	{
		z=0;
	}
	public point(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	public void set(int a,int b,int c)
	{
		x=a;
		y=b;
	}
	public void show()
	{
		System.out.print(x+","+y+","+z);
	}
}