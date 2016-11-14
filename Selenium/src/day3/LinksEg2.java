package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg2
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		//1st method
		
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		//2 nd 
		
		List<WebElement> home=driver.findElements(By.linkText("Home"));
		System.out.println(home.size());
		
		for (int i = 0; i < home.size(); i++) 
		{
			home.get(i).click();
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			//navigate()
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			home=driver.findElements(By.linkText("Home"));
			
		}
	}

}
