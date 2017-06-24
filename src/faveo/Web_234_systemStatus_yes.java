package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_234_systemStatus_yes extends Login_faveo_admin {
	@Test
	public void status_yes() throws InterruptedException, IOException
	{
		Thread.sleep(6000);
		//to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div/div/section[2]/div[5]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		//to click on stuatus
		driver.findElement(By.xpath("(.//*[@id='status'])[1]")).click();
		Thread.sleep(10000);
		//to click on online ok
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[2]/div[2]/div[2]/div/div/div[2]/input")).click();
		Thread.sleep(5000);
		//to submit
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[3]/input")).click();
		Thread.sleep(5000);		 
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span	")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/ul/li[2]/div[2]/a/b")).click();
		Thread.sleep(5000);		
		//to click on login
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).clear();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("manoj");
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).clear();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("123456");
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='corewidgetbox']/div/span[2]/a/span")).click();
		Thread.sleep(5000);		
	//to click on open tickets
		driver.findElement(By.xpath(".//*[@id='content']/div/form/ul/li[1]/a")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='hello']/tr/td[2]/a")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(".//*[@id='d1']")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		Thread.sleep(10000);		
		File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr3, new File("C:\\Users\\Dyamanna\\Screenshots\\234(enble).png"));	
		

		
		
		
		
			
		
		
	}
	

}
