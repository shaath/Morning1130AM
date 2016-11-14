package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText_GetAttribute {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String lText=driver.findElement(By.className("gb_P")).getText();
		
		System.out.println(lText);
		
		
		String s=driver.findElement(By.className("gb_P")).getAttribute("href");
		System.out.println(s);
	}

}
