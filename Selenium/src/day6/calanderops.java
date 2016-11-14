package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class calanderops {

	public static void main(String[] args) 
	{
		String date="18/november/2017";
		String[] split=date.split("/");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		
		//Year
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!year.equals(calyear))
		{
			driver.findElement(By.className("nextMonth ")).click();
			
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		

		//Month
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//Day Selection 
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < cols.size(); i++)
		{
			String calday=cols.get(i).getText();
			
			if (calday.equals(day))
			{
				cols.get(i).click();
				break;
			}
		}
	}

}
