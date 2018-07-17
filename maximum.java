class maximum
{
	public static void main(String arg[])
	{
		int a,b,c,d,max1,max2;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		System.out.print("a="+a +"b="+b +"c="+c +"d="+d);
		if(a>b)
			max1=a;
		else
			max1=b;
		if(c>d)
			max2=c;
		else
			max2=d;
		if(max1>max2)
			max2=max1;
	
		System.out.print("\nMaximum is"+max2);
	}
}	