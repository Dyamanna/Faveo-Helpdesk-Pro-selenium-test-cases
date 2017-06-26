package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_266_approval_user_closed  extends Login_faveo_admin{
	@Test
	public void approval() throws InterruptedException, IOException
	{SoftAssert as=new SoftAssert();
		Thread.sleep(10000);
	//	to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[8]/div/div/a/span")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span	")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/ul/li[2]/div[2]/a/b")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("sheshi");
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("123456");
		//click on login button
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
		Thread.sleep(7000);
		//to click on my tickets
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[1]/li[4]/a")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//*[@id='hello']/tr/td[2]/a)[1]")).click();
		Thread.sleep(7000);		
		driver.findElement(By.xpath(".//*[@id='d1']")).click();
		Thread.sleep(7000);		
		driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div/ul/li[3]/a")).click();
		Thread.sleep(7000);		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\266(edit).png"));	
		as.assertAll();

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
