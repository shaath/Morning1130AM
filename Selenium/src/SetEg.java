import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetEg 
{
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Apple");
		s.add("Manual");
		s.add("Sharath");
		s.add("Selenium");
		s.add("Sharath");
		
		//Reading the data 
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String sText=it.next();
			System.out.println(sText);
		}
	}

}
