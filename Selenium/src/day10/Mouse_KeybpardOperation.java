package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeybpardOperation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		//Focusing on the gmail link
		act.moveToElement(gmail).build().perform();
		Thread.sleep(5000);
		//Right click on the gmail link
		act.contextClick().build().perform();
		Thread.sleep(5000);
		//Clicking on down arrow key 3 times 
		
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(5000);
//		//clicking on enter
//		act.sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.chord("P")).build().perform();
	}
}
