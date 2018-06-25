class UseMoney
{
	public static void main(String args[])
	{
		Money m2=new Money();
		try
		{
		m2.set(-100,20);
		}
		catch(InvalidAmountException e1)
		{
			System.out.print(e1.getMessage());
		}
		System.out.print("Second Amount is");
		m2.show();
	}
}
		