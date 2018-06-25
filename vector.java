import java.util.*;
class UnderFlowException extends Exception
{
	public UnderFlowException(String str)
	{
		super(str);
	}
}
class Stack1
{
	Vector v;
	public Stack1()
	{
		v=new Vector();
	}
	public void push(Object o)
	{
		v.add(o);
	}
	public Object pop() throws UnderFlowException
	{
		Object o=null;
		if(v.size()>0)
		{
			System.out.print("Deleted Element:");
			o=v.get(v.size()-1);
			v.remove(v.size()-1);
		}
		else
		{
			UnderFlowException e=new UnderFlowException("Found Nothing");
			throw e;
		}
		return o;
	}
	public void empty() 
	{
		
		v.clear();
			
	}
	
		
}