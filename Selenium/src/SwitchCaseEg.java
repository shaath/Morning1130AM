
public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="uft";
		
		switch (course.toUpperCase()) 
		{
		case "SELENIUM":
			System.out.println("You are selected selenium");
			break;
		case "UFT":	
			System.out.println("You are selected UFT");
			break;
		case "MANUAL":
			System.out.println("You are selected Manual");
			break;
		case "LOADRUNNER":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
