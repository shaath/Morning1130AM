
public class NestedIf 
{
	public static void main(String[] args) 
	{
		int a=500;
		int b=600000;
		int c=7000;
		
		if (a>b & a>c) 
		{
			System.out.println("A is Greater");
		}
		else if (b>c & b>a) 
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
		
	}

}
