
public class Stringeg2 
{
	public static void main(String[] args) 
	{
		String s="Dad";//---------->egdEQ
		String rev="";
		// DAD--------------> DAD
		int len=s.length();
		System.out.println(len);
		
//		System.out.println(s.charAt(2));
		
//		for (int i = 0; i < len; i++) 
//		{
//			System.out.println(s.charAt(i));
//			
//		}
		
		for (int i = len-1; i >= 0 ; i--) 
		{
//			System.out.print(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if (s.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is polindrome");
			
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
		
	}
}
