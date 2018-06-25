import java.io.*;
class InvalidDenominatorException extends Exception
{
	public InvalidDenominatorException(String str)
	{
		super(str);
	}
}
class Rational
{
	private int no1;
	private int no2;
	public Rational()
	{
		no1=no2=0;
	}
	public Rational(int n1,int n2)
	{
		no1=n1;
		no2=n2;
	}
	public Rational(Rational r)
	{
		no1=r.no1;
		no2=r.no2;
	}
	public void set() throws InvalidDenominatorException
	{
		Console con=System.console();
		System.out.print("Enter Numerator:");
		no1=Integer.parseInt(con.readLine());
		System.out.print("Enter Denominator:");
		no2=Integer.parseInt(con.readLine());
		if(no2==0)
		{
			InvalidDenominatorException e=new InvalidDenominatorException("Denominator cannot be Negative");
			throw e;
			
		}
		
	}
	public void show()
	{
		System.out.print(no1+"/"+no2);
	}
	public Rational add(Rational r)
	{
		Rational temp=new Rational();
		
		if(no2%r.no2==0)
		{
		temp.no2=no2;
		temp.no1=((temp.no2/no2)*no1)+((temp.no2/r.no2)*r.no1);
		}
		else if(r.no2%no2==0)
		{
		temp.no2=r.no2;
		temp.no1=((temp.no2/no2)*no1)+((temp.no2/r.no2)*r.no1);
		}
		else
		{
		temp.no2=no2*r.no2;
		temp.no1=((temp.no2/no2)*no1)+((temp.no2/r.no2)*r.no1);
		}		
		return temp;
	}
		public Rational less(Rational r)
	{
		Rational temp=new Rational();
		
		if(no2%r.no2==0)
		{
		temp.no2=no2;
		temp.no1=((temp.no2/no2)*no1)-((temp.no2/r.no2)*r.no1);
		}
		else if(r.no2%no2==0)
		{
		temp.no2=r.no2;
		temp.no1=((temp.no2/no2)*no1)-((temp.no2/r.no2)*r.no1);
		}
		else
		{
		temp.no2=no2*r.no2;
		temp.no1=((temp.no2/no2)*no1)-((temp.no2/r.no2)*r.no1);
		}		
		return temp;
	}
	public Rational multiply(Rational r)
	{
	Rational temp=new Rational();
	
	temp.no1=no1*r.no1;
	temp.no2=no2*r.no2;
	return temp;
	}
	public Rational divide(Rational r)
	{
		Rational temp=new Rational();

		
		
				temp.no1=no1*r.no2;
				temp.no2=no2*r.no1;
		
		return temp;
	}
}