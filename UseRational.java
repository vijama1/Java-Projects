import java.io.*;
class UseRational
{
	public static void main(String args[])
	{
		Rational r1=new Rational();
		System.out.print("Default:");
		Rational r2=new Rational();
		r1.show();
		System.out.println();
		System.out.print("For First Number\n");
		try
		{
		r2.set();
		}
		catch(InvalidDenominatorException e1)
		{
			e1.printStackTrace();
		}
			
		System.out.print("First Number is:");
		r2.show();
		System.out.println();
	}
	
}