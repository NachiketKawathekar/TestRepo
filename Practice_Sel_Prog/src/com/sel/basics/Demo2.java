package com.sel.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Window Handling */
public class Demo2 
{
		public static void main(String[] args)
		{
				System.setProperty("webdriver.edge.driver","C:\\Practice_Sel_Prog\\Binary\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("http://www.naukri.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				String parent=driver.getWindowHandle();
				Set<String> allchild=driver.getWindowHandles();
				Iterator<String> it=allchild.iterator();
				while(it.hasNext())
				{
					String child=it.next();
					if(!parent.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						System.out.println(driver.switchTo().window(child).getTitle());
					}
					
				}
				driver.switchTo().window(parent);
				System.out.println(driver.switchTo().window(parent).getTitle());
				driver.quit();
		}
}
