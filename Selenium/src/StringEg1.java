
public class StringEg1 {

	public static void main(String[] args) 
	{
		String a="Hi, Welcome to the selenium1212";
		String b="Selenium";
		
		System.out.println(a);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		if ((a.toUpperCase()).contains(b.toUpperCase()))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}
	

}
