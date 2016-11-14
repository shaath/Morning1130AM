package com.OrgHrm.Functions;

public class TestSuite {

	public static void main(String[] args)
	{
		//LoginTC
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//EmpReg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_EmpReg("Sharath123", "Chandra");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//UserReg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Sharath123 Chandra", "Sharath123456789", "Sharath123456", "Sharath123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//UserLogin
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Sharath123456789", "Sharath123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
