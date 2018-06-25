import java.util.regex.*;
class fr
{
	public static void main(String args[])
	{
		String line="I Like php php and php";
		String result=null;
		Pattern p=Pattern.compile("php");
		Matcher m=p.matcher(line);
		if(m.find())
			result=m.replaceFirst("java");
		System.out.print(result);
	}
}