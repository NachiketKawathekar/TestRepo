package com.sel.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*Practice Form*/
public class Demo1 
{
		public static void main(String[] args) 
		{
				System.setProperty("webdriver.edge.driver","C:\\Practice_Sel_Prog\\Binary\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
				
				Actions acrs=new Actions(driver);
				acrs.moveToElement(driver.findElement(By.xpath("//b[text()=\"Admin\"]"))).click().build().perform();
				
				WebElement ad=driver.findElement(By.xpath("//input[@name=\"btnAdd\"]"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)",ad);
				ad.click();
				
				WebElement s=driver.findElement(By.xpath("//select[@name=\"systemUser[userType]\"]"));
				Select se=new Select(s);
				se.selectByIndex(0);
				
				driver.findElement(By.xpath("//input[@class=\"formInputText inputFormatHint ac_input\"]")).sendKeys("Gauri");
				driver.findElement(By.xpath("//input[@class=\"formInputText\"]")).sendKeys("Gauri Kulkarni");
				
				WebElement st=driver.findElement(By.xpath("//select[@name=\"systemUser[status]\"]"));
				Select sel1=new Select(st);
				sel1.selectByIndex(0);
				
				driver.findElement(By.xpath("//input[@name=\"systemUser[password]\"]")).sendKeys("12345");
				driver.findElement(By.xpath("//input[@name=\"systemUser[confirmPassword]\"]")).sendKeys("12345");
				driver.findElement(By.xpath("//input[@class=\"addbutton\"]")).click();
				driver.close();
		}
}
