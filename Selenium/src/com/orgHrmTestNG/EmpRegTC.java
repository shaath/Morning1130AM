package com.orgHrmTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpRegTC extends TestNGMAster
{
	@Test
	public void org_Empreg()
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		
	}

}
