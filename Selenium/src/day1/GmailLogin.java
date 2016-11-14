package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
//		FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		//maximize the window
		driver.manage().window().maximize();
		//Entering the data into email text box
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		//clicking on next button
		driver.findElement(By.name("signIn")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		//entering data into password filed
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		//click on sign in button
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
//		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
//		driver.findElement(By.linkText("Sign out")).click();
		
	}

}
