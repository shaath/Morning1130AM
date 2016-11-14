package com.orgHrmTestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotaions 
{

	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is Function1 code");
	}
	@Test(enabled=false)
	public void function2()
	{
		System.out.println("This is Function2 code");
	}
	@Test(priority=2)
	public void a()
	{
		System.out.println("This is A Code");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before Class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test");
	}

}
