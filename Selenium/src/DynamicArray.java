
public class DynamicArray {

	public static void main(String[] args) 
	{
		Object[] x=new Object[10];
		
		//Find the length of the array
//		System.out.println(x.length);
		
		//Writing the data into an array
		
		x[2]="Selenium";
		x[5]=30000;
		x[7]=true;
		
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
		
		

	}

}
