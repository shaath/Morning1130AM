package day8;import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getWindowHandle());
		
		
		driver.findElement(By.linkText("Privacy")).click();
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		while(it.hasNext())
		{
			String windowId=it.next();
			System.out.println(windowId);
			
			driver.switchTo().window(windowId);
			Sleeper.sleepTightInSeconds(5);
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			} 
			catch (Exception e)
			{
				System.out.println("THe expected link not avaialble in this page ");
			}
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
