package com.orgHrmTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestNGMAster 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="admin";
	public static String f="Sharath135",l="Chandra531";
	public static String ename=f+" "+l, uname="SharathChandra15612",pswd="SharathChandra123456",cpswd="SharathChandra123456";
	@BeforeSuite
	public void org_LAunch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	
	}
	
	@AfterTest
	
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	
	
}
