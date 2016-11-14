package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtablesEg1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Employee")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			String empId=cols.get(1).getText();
			System.out.println(empId);
			
			if (empId.equalsIgnoreCase("0016"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
			
		}
	}

}
