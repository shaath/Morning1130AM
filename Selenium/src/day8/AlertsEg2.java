package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
	}

}
