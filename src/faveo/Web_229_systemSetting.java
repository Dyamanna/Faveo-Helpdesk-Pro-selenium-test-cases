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

public class Web_229_systemSetting extends Login_faveo_admin{
	@Test
	public void system() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,900)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='name']")).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Dyamanna");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[3]/input")).submit();
		Thread.sleep(6000);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\229(edit).png"));	
		
		String update=driver.findElement(By.xpath(".//*[@id='formID']/div/div[2]/div[1]")).getText();
		Thread.sleep(6000);
		String exp="System updated successfully";
		if(update.equalsIgnoreCase(exp))
		{
			log.info("passed",true);
		}
		else
			log.info("fail",true);
		
		String url=driver.getCurrentUrl();
		String appurl="http://jamboreebliss.com/Dyamanna/public";
		if(url.equalsIgnoreCase(appurl))
		{
			log.info("both urls are equal",true);
		}
		else
			log.info("not equal",true);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span")).click();
		driver.findElement(By.xpath("//b[.='Sign out']);")).click();
	
		as.assertAll();
			} 

}
