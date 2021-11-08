package com.sel.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*  Java Script Executor */
public class Demo3 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.edge.driver","C:\\Practice_Sel_Prog\\Binary\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement genderm=driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]"));
			js.executeScript("arguments[0].click();",genderm);
		}
}
