package action;

import generics.Excel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Multi_excel extends Open_browser {
	@Test
	public void ex() throws InterruptedException
	
	{
		Thread.sleep(8000);
		//to click on login modulo
				
				int rc = Excel.getRowCount("./data/input.xlsx", "login");
				
				for(int i=1;i<=rc;i++)
					
				{
					driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
					
					 String un = Excel.getCellValue("./data/input.xlsx","login", i, 0);
					 
					 String pwd = Excel.getCellValue("./data/input.xlsx","login", i, 1);
					
						//username
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys(un);
						
						//password
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys(pwd);
						//click on login button
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
	
						Thread.sleep(10000);
						
						driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[5]/a/span")).click();

						Thread.sleep(10000);
						driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[5]/ul/li[2]/div[2]/a/b")).click();
						Thread.sleep(10000);
						
				}
				
			
}}
