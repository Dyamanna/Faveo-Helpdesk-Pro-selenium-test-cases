package faveo;

import generics.Excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_303_create_user  extends Login_faveo_admin {
	@Test
	public void create_user() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click on users
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[2]/a")).click();
		Thread.sleep(10000);
		//to click on user directory
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[1]")).click();
		Thread.sleep(10000); 
		//click on create user
		int rc = Excel.getRowCount("./data/status.xlsx", "user");
		for(int i=1;i<=rc;i++){
			driver.findElement(By.xpath("html/body/div/div/section[2]/div/div[1]/div/div[3]/a[2]")).click();
			Thread.sleep(5000); 
		
			String mail = Excel.getCellValue("./data/status.xlsx", "user", i, 0);
			String user = Excel.getCellValue("./data/status.xlsx", "user", i, 1);
			String fname = Excel.getCellValue("./data/status.xlsx", "user", i, 2);
			Thread.sleep(5000); 
			
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(mail);
			Thread.sleep(5000); 
			
			driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys(user);
			Thread.sleep(5000); 
			
			driver.findElement(By.xpath(".//*[@id='first_name")).sendKeys(fname);
			Thread.sleep(5000); 
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
			Thread.sleep(5000); 
		}

		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\303(dashboard dept).png"));	
		

	

as.assertAll();
		
}
}