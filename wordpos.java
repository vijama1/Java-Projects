class wordpos
{
public static void main(String arg[])
{
	int tenthousand,thousand,tens,once;
	    tenthousand=(int)(Math.random()*10);
		thousand=(int)(Math.random()*10);
		tens=(int)(Math.random()*10);
		once=(int)(Math.random()*10);
		System.out.print("a=" +tenthousand + "b=" +thousand + "c=" +tens + "d=" +once);
		if(tenthousand!=0)
		{
					switch(tenthousand)
		{
			case 1:
				System.out.print("\nOne Thousand ");
				break;
			case 2:
				System.out.print("\nTwo Thousand ");
				break;	
			case 3:
				System.out.print("\nThree Thousand ");
				break;
			case 4:
				System.out.print("\nFour Thousand ");
				break;
			case 5:
				System.out.print("\nFive Thousand ");
				break;
			case 6:
				System.out.print("\nSix Thousand ");
				break;
			case 7:
				System.out.print("\nSeven Thousand ");
				break;
			case 8:
				System.out.print("\nEight Thousand ");
				break;	
			case 9:
				System.out.print("\nNine Thousand ");
				break;
		}
		}
		else
		System.out.print("");
	
		if(thousand!=0)
		{
						switch(thousand)
		{
			case 1:
				System.out.print("One Hundred ");
				break;
			case 2:
				System.out.print("Two Hundred ");
				break;	
			case 3:
				System.out.print("Three Hundred " );
				break;
			case 4:
				System.out.print("Four Hundred ");
				break;
			case 5:
				System.out.print("Five Hundred ");
				break;
			case 6:
				System.out.print("Six Hundred ");
				break;
			case 7:
				System.out.print("Seven Hundred ");
				break;
			case 8:
				System.out.print("Eight Hundred ");
				break;	
			case 9:
				System.out.print("Nine Hundred ");
				break;
		}
		}
		else
        System.out.print("");
	
		if(tens!=0)
		{	
						switch(tens)
		{
			case 1:
			switch(once)
		{
			case 1:
				System.out.print("Eleven");
				break;
			case 2:
				System.out.print("Twelve ");
				break;	
			case 3:
				System.out.print("Thirteen" );
				break;
			case 4:
				System.out.print("Fourteen ");
				break;
			case 5:
				System.out.print("Fifteen ");
				break;
			case 6:
				System.out.print("Sixteen ");
				break;
			case 7:
				System.out.print("Seventeen ");
				break;
			case 8:
				System.out.print("Eighteen ");
				break;	
			case 9:
				System.out.print("Ninteen ");
				break;
			default:
				System.out.print("Ten");
		}
            break;		
						
			case 2:
				System.out.print("Twenty ");
				break;	
			case 3:
				System.out.print("Thirty ");
				break;
			case 4:
				System.out.print("Fourty ");
				break;
			case 5:
				System.out.print("Fifty ");
				break;
			case 6:
				System.out.print("Sixty ");
				break;
			case 7:
				System.out.print("Seventy ");
				break;
			case 8:
				System.out.print("Eighty ");
				break;	
			case 9:
				System.out.print("Ninty ");
				break;
		}		
		}
		else
		System.out.print("");

		if(once!=0)
		{	
						switch(once)
		{
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;	
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;	
			case 9:
				System.out.print("Nine ");
				break;
		}		
		}
		else
		System.out.print("");	
}
}
		