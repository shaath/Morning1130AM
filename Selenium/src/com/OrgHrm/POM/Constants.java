package com.OrgHrm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	
	WebDriver driver=new FirefoxDriver();
	
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	AdminLogin al=PageFactory.initElements(driver, AdminLogin.class);
}
