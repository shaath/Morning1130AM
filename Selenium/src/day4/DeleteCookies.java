package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCookies {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.navigate().to("http://facebook.com");
		Set<Cookie> c=driver.manage().getCookies();
		
		Iterator<Cookie> it=c.iterator();
		
//		while (it.hasNext()) 
//		{
//			System.out.println(it.next());
//			
//			
//		}
		
		
		driver.manage().deleteAllCookies();
		
		
		
		c=driver.manage().getCookies();
		
		it=c.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
			
		}
		
		

	}

}
