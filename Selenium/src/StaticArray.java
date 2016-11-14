
public class StaticArray 
{

	public static void main(String[] args) 
	{
		String[] course={"Manual","Selenium","UFT","LoadRunner","CodedUI","SoapUI"};
		
		//Length of the Array
		System.out.println(course.length);

		//Reading Values from an Array
		
//		System.out.println(course[0]);
//		System.out.println(course[1]);
//		System.out.println(course[2]);
//		System.out.println(course[3]);
//		System.out.println(course[4]);
//		System.out.println(course[5]);
		
		for (int i = 0; i < course.length; i++)
		{
			System.out.println(course[i]);
		}
		
	}

}
