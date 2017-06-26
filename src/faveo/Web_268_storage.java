package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_268_storage extends Login_faveo_admin{
	@Test
	public void storage_database() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);
	//	to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		//to click on storage
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[9]/div/div/a/span/i")).click();
		Thread.sleep(8000);	
		
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='default']")));
		s.selectByVisibleText("In Folder ");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/input")).click();
		Thread.sleep(4000);	
		
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\268(edit).png"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
