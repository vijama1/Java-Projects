class even
{
	public static void main(String arg[])
	{
		int a,b,c,d,even=0;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		System.out.print("a=" +a + "b=" +b + "c=" +c + "d=" +d);
		if(a%2==0 && b%2==0 && c%2==0 && d%2==0)
			System.out.print("\nAll are Even");
		else if((a%2==0 && b%2==0 && c%2==0) || (b%2==0 && c%2==0 && d%2==0) || (a%2==0 && c%2==0 && d%2==0) || (d%2==0 && b%2==0 && a%2==0) || (b%2==0 && d%2==0 && c%2==0) || (c%2==0 && a%2==0 && b%2==0))
			System.out.print("\nThree Are Even");
		else if((a%2==0 && b%2==0) || (b%2==0 && c%2==0) || (c%2==0 && d%2==0) || (d%2==0 && a%2==0) || (a%2==0 && c%2==0) || (b%2==0 && d%2==0))
			System.out.print("\nTwo are Even");
		else if (a%2==0 || b%2==0 || c%2==0 || d%2==0)
			System.out.print("\nOne is Even");
		else 
			System.out.print("\nNone is Even");
	}
}	