package com.orgHrmTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OrgHrm.Functions.OrgMaster;

import day2.OrangehrmLogin;

public class LoginTC
{
	public static OrgMaster om=new OrgMaster();
	@BeforeClass
	public void launch()
	{
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
	}

	@Test
	public void login()
	{
		om.org_Login("Admin", "admin");
	}
	@AfterClass
	public void Logout_Close()
	{
		om.org_Logout();
		om.org_Close();
	}
}
