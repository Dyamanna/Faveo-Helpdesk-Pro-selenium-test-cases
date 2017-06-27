package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_295_users_filter  extends Login_faveo_admin {
	@Test
	public void click_on_inbox() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click on users
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[2]/a")).click();
		Thread.sleep(10000);
		//to click on user directory
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[1]")).click();
		Thread.sleep(10000);
		//to filter
		driver.findElement(By.xpath(".//*[@id='labels-button']")).click();
		Thread.sleep(10000);
		//to click on agent users
		driver.findElement(By.xpath(".//*[@id='profile-type-filter']/li[2]/a")).click();
		Thread.sleep(10000);
		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\295dashboard users).png"));	
		Thread.sleep(8000);
		
		
		
		//to filter*********client
				driver.findElement(By.xpath(".//*[@id='labels-button']")).click();
				Thread.sleep(10000);
				//to click on agent users
				driver.findElement(By.xpath(".//*[@id='profile-type-filter']/li[3]/a")).click();
				Thread.sleep(10000);
				File scrFile11= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
				FileUtils.copyFile(scrFile11, new File("C:\\Users\\Dyamanna\\Screenshots\\296dashboard users).png"));	
				Thread.sleep(8000);
				
				
				
				
				//to filter*****ban
				driver.findElement(By.xpath(".//*[@id='labels-button']")).click();
				Thread.sleep(10000);
				//to click on agent users
				driver.findElement(By.xpath(".//*[@id='profile-type-filter']/li[7]/a")).click();
				Thread.sleep(10000);
				File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
				FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\300dashboard users).png"));	
				Thread.sleep(8000);
				
				
				
				
				
				
			//*********
				//to filter deactive
				driver.findElement(By.xpath(".//*[@id='labels-button']")).click();
				Thread.sleep(10000);
				//to click on agent users
				driver.findElement(By.xpath(".//*[@id='profile-type-filter']/li[6]/a")).click();
				Thread.sleep(10000);
				File scrFile13= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
				FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\299dashboard users).png"));	
				Thread.sleep(8000);
			
		as.assertAll();
	
}}
