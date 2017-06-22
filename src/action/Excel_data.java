package action;

import generics.Excel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Excel_data extends Open_browser {
	@Test
	public void ex() throws InterruptedException
	
	{
		Thread.sleep(8000);
		//to click on login modulo
				driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
				
				 String un = Excel.getCellValue("./data/input.xlsx","login", 1, 0);
				 
				 String pwd = Excel.getCellValue("./data/input.xlsx","login", 1, 1);
					
						//username
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys(un);
						
						//password
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys(pwd);
						//click on login button
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
						
		         
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
