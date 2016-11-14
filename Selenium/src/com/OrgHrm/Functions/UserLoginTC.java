package com.OrgHrm.Functions;

public class UserLoginTC {

	public static void main(String[] args)
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Sharath123456", "Sharath123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
