import java.io.*;
import java.util.*;

class countwords
{
	private String s5;
	public countwords(String s4)
	{
		s5=s4;
	}
	public static void main(String args[]) throws Exception
	{
		Console con=System.console();
		String filename;
		System.out.print("Enter File to be Created:");
		filename=con.readLine();
		File fis1=new File(filename);
		StreamTokenizer st=new StreamTokenizer(new FileInputStream(filename));
		HashSet set=new HashSet();
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			switch(st.ttype)
			{
				case StreamTokenizer.TT_WORD:
				set.add(st.sval);
				break;
			}
		}
			Map map=new HashMap();
			Iterator iter=set.iterator();
			while(iter.hasNext())
			{
				String s=(String)(iter.next());
				//System.out.print(s);
				int count=0;
				StreamTokenizer st1=new StreamTokenizer(new FileInputStream(filename));
				
				while(st1.nextToken()!=StreamTokenizer.TT_EOF)
				{
					if(s.equals(st1.sval))
					{
						count++;
						//System.out.print(count);
					}
				}
				map.put(s,count);
			}
			Set set1=map.keySet();
			iter=set1.iterator();

			//System.out.println(s1);
			while(iter.hasNext())
			{
				String s1=(String)(iter.next());
				System.out.println(s1+" "+map.get(s1));
			}
	}
}
			