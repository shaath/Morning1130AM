package com.orgHrmTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrgHrm.Functions.OrgMaster;

public class EmpregTest 
{
	OrgMaster om=new OrgMaster();
	@BeforeClass
	public void launch()
	{
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@BeforeMethod
	public void login()
	{
		String res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	@Test
	public void empreg()
	{
		String res=om.org_EmpReg("Chandra", "Shekar");
		System.out.println(res);
	}
	@AfterMethod
	public void logout()
	{
		String res=om.org_Logout();
		System.out.println(res);
	}
	@AfterClass
	public void close()
	{
		om.org_Close();
	}

}
