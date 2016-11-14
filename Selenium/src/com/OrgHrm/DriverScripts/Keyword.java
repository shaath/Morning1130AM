package com.OrgHrm.DriverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OrgHrm.Functions.OrgMaster;

public class Keyword 
{
	@Test
	public void kscript() throws IOException
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		String xlpath="F:\\Morning1130AM\\Selenium\\src\\com\\OrgHrm\\TestData\\Keyword.xlsx";
		String xlout="F:\\Morning1130AM\\Selenium\\src\\com\\OrgHrm\\Results\\KeyRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		
		int TcRc=ws.getLastRowNum();
		int TsRc=ws1.getLastRowNum();
		//Test Case sheet
		for (int i = 1; i <= TcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String TcId=ws.getRow(i).getCell(0).getStringCellValue();
				//Test Steps Sheet
				
				for (int j = 1; j <= TsRc; j++) 
				{
					String TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (TcId.equalsIgnoreCase(TsTcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":	
							res=om.org_EmpReg("Sharath", "Chandra");
							break;
						case "Usereg":	
							res=om.org_Userreg("Sharath Chandra", "Sharath123456", "Sharath123456", "Sharath123456");
							break;
						case "Ulogin":	
							res=om.org_Login("Sharath123456", "Sharath123456");
							break;
						default:
							System.out.println("select a proper keyword");
							break;
						}
						//Result Update in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						//Result in test case sheet
						if(!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
