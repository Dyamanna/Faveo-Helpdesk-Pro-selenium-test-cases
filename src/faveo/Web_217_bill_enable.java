package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_217_bill_enable extends Login_faveo_admin {
	
	@Test(priority=1)
	public void bill_enable() throws InterruptedException, IOException
	{SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(6000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[9]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(.//*[@id='status'])[1]")).click();//driver.findElement(By.xpath("(.//*[@id='status'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(.//*[@id='level'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='currency']")).sendKeys("inr");
		Thread.sleep(10000);
		driver.findElement(By.xpath("	html/body/div[1]/div/section[2]/div/form/div[2]/input")).click();
		Thread.sleep(5000);
		String update = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/form/div[1]/div[1]")).getText();
		if(update.startsWith("updat"))
		{
			log.info("passed",true);
			System.out.println("passed");
		}
		else
			System.out.println("failed");
			log.info("failed",true);
			driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(.//*[@id='load-inbox']/span)[1]")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath(".//*[@id='tool1']/a")).sendKeys(Keys.ENTER);
				JavascriptExecutor j1=(JavascriptExecutor)driver;
				j1.executeScript("window.scrollBy(0,800)", "");
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div/div[1]/ul/li[3]/a")).click();
				Thread.sleep(10000);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
				FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\217(edit).png"));	
				as.assertAll();
	}
	

}
