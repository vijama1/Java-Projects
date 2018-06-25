import java.io.*;
import java.util.*;
import java.lang.*;

class s2
{
	public static void main(String args[]) throws Exception
	{
		StreamTokenizer st=new StreamTokenizer(new FileInputStream("A.java"));
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			String s;
			switch(st.ttype)
			{
				case StreamTokenizer.TT_EOL:
				s="EOL";
				break;
				case StreamTokenizer.TT_NUMBER:
				s=st.nval+"";
				break;
				case StreamTokenizer.TT_WORD:
				s=st.sval;
				break;
				default:
				s=""+((char)st.ttype);
			}
			System.out.println(s);
		}
	}
}