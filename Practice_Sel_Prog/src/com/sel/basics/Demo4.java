package com.sel.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo4 
{
		public static void main(String[] args) throws IOException
		{
				System.setProperty("webdriver.edge.driver","C:\\Practice_Sel_Prog\\Binary\\msedgedriver.exe");
				Properties p=new Properties();
				FileInputStream fin=new FileInputStream("C:\\Practice_Sel_Prog\\Binary\\Info.properties");
				p.load(fin);
				
				System.out.println("Name:"+p.getProperty("Name"));
				System.out.println("Surname:"+p.getProperty("Surname"));
		}
}
