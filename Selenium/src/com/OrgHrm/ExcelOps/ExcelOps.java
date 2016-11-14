package com.OrgHrm.ExcelOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrgHrm.Functions.OrgMaster;

public class ExcelOps 
{
	public static void main(String[] args) throws IOException
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\Morning1130AM\\Selenium\\src\\com\\OrgHrm\\TestData\\EmpTestData.xlsx";
		String xlout="F:\\Morning1130AM\\Selenium\\src\\com\\OrgHrm\\Results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		XSSFSheet ws1=wb.getSheet("Sheet2");
//		XSSFRow r=ws.getRow(3);
//		XSSFCell c=r.getCell(1);
//		
//		System.out.println(c.getStringCellValue());
		
		
		int Rc=ws.getLastRowNum();
		CellStyle style=wb.createCellStyle();
		XSSFFont font=wb.createFont();
		
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f +"-----"+ l);
			String res=om.org_EmpReg(f, l);
			
			c2.setCellValue(res);
			//BackGroung colours			
//			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			
//			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			
//			c2.setCellStyle(style);
			//Font colours
			
			if (res.equalsIgnoreCase("Pass"))
			{
				font.setColor(IndexedColors.GREEN.getIndex());
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
			}
			
			style.setFont(font);
			c2.setCellStyle(style);
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
		
		

	}

}
