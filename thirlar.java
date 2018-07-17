class thirlar
{
	public static void main(String arg[])
	{
		int a,b,c,d,min,secmin;
		a=(int)(Math.random()*100);
		b=(int)(Math.random()*100);
		c=(int)(Math.random()*100);
		d=(int)(Math.random()*100);
		System.out.print("a="+a +"b="+b +"c="+c +"d="+d);
		if(a>b)
		{
		min=b;
		secmin=a;	
	    }
		else
		{
		min=a;
		secmin=b;
		}
		if(min>c)
		{
		secmin=min;	
		min=c;
		}
		else if(secmin>c)
			secmin=c;
		if(min>d)
		{
			secmin=min;
			min=d;
		}
		else if(secmin>d)
			secmin=d;
		
		System.out.print("\nThird Largest Number is:"+secmin);
        	
	}		

			}	
		