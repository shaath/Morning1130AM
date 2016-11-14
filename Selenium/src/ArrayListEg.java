import java.util.ArrayList;


public class ArrayListEg
{
	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		//Writing the data into arraylist
		
		s.add("Selenium");
		s.add("UFT");
		s.add('M');
		s.add(20000);
		s.add(true);
		
		s.add(5, "Apple");
		
		//Finding the length of the arraylist
		
		System.out.println(s.size());
		
		// Reading the data from ArrayList
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
			
		}
		
		
	}

}
