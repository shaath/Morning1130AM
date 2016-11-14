package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://Bing.com");
		driver.manage().window().maximize();
		
		List<WebElement>  links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
		}
		
	}

}
