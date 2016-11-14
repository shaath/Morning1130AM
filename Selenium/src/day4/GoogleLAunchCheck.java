package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLAunchCheck {

	public static void main(String[] args) throws IOException 
	{
		String expval="Google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://goole.com");
		
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("PAss");
		}
		else
		{
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Morning1130AM\\Selenium\\src\\Screenshot\\google12.png"));

			System.out.println("Fail");
		}
	}

}
