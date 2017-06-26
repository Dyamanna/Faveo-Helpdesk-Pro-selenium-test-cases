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

public class Web_274_social extends Login_faveo_admin {
	@Test
	public void social() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);
//		to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);	
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1300)", "");
		driver.findElement(By.xpath("html/body/div/div/section[2]/div[7]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("google");
		Thread.sleep(10000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\278(edit).png"));
		Thread.sleep(10000);
	Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s.selectByVisibleText("25");
		File scrFile22= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile22, new File("C:\\Users\\Dyamanna\\Screenshots\\274(edit).png"));
		Thread.sleep(10000);
		Select s1= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s1.selectByVisibleText("10");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\275(edit).png"));

		Thread.sleep(10000);
		Select s2= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	
		s2.selectByVisibleText("50");
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\276(edit).png"));

		Thread.sleep(10000);
	Select s3= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s3.selectByVisibleText("100");
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\277(edit).png"));
		as.assertAll();
	
	}

}
