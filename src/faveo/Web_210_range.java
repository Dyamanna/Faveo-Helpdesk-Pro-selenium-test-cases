package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_210_range extends Login_faveo_admin{
	@Test
	public void tag() throws InterruptedException, IOException
	{SoftAssert as=new SoftAssert();
	Thread.sleep(10000);	
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(6000);
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(6000);
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[8]/div/div/a/span/i")).click();
	Thread.sleep(10000);	
		Select s= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		Thread.sleep(6000);		// to click on help topic 
		s.selectByVisibleText("10");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(208).png"));
		Thread.sleep(10000);
		Select s1= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s1.selectByVisibleText("25");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(209).png"));

		Thread.sleep(10000);
		Select s2= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	
		s2.selectByVisibleText("50");
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(210).png"));

		Thread.sleep(10000);
	Select s3= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s3.selectByVisibleText("100");
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile13, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(211).png"));
		as.assertAll();
	}

}
