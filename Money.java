class InvalidAmountException extends Exception
{
	public InvalidAmountException(String str)
	{
		super(str);
	}
}
class Money
	{
		private int rs;
		private int paisa;
		public Money()
		{
			rs=paisa=0;
		}
		public Money(int r,int p)
		{
			rs=r;
			paisa=p;
		}
		public Money(Money m)
		{
			rs=m.rs;
			paisa=m.paisa;
		}
		
	public void set(int r,int p) throws InvalidAmountException
	{
		if(r>=0 && p>=0)
		{
			rs=r;
			paisa=p;
		}
		else 
		{
			InvalidAmountException e=new InvalidAmountException("Amount cannot be Negative");
			throw e;
		}
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
	}
	