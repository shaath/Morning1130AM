package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//getTitle()
		
		System.out.println(driver.getTitle());
		
		//getcurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		//close()
		driver.close();
		
		//quit()
		driver.quit();
		
	}

}
