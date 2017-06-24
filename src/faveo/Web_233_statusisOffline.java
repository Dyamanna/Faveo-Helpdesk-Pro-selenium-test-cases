package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_233_statusisOffline extends Login_faveo_admin {
	@Test(priority=2)
	public void status_offline() throws InterruptedException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,900)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(.//*[@id='status'])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[3]/input")).click();
		Thread.sleep(6000);	
		as.assertAll();
	}
@Test(priority=1)
public void  checking_createticket_offline() throws IOException, InterruptedException
{
	driver=new  FirefoxDriver();
	driver.get("http://jamboreebliss.com/Dyamanna/public/");
	File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr3,new File("C:\\Users\\Dyamanna\\Screenshots\\233(offline1).png"));
	Thread.sleep(10000);
	WebElement submit = driver.findElement(By.xpath(".//*[@id='corewidgetbox']/div/span[1]/a/span"));
	File scr31=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr31,new File("C:\\Users\\Dyamanna\\Screenshots\\233(offline2).png"));
	if(submit.isDisplayed())
			{
		log.info("displayed",true);
			}
	
}
}
