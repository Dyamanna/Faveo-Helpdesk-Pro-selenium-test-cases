package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_314_canned_318_search_range extends Login_faveo_admin {
	@Test
	public void create_range_search() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click onn tools
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on canned response
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='form-control input-xs']")).sendKeys("customer");
		driver.findElement(By.xpath("//input[@class='form-control input-xs']")).sendKeys(Keys.ENTER);
		
		File scrFile123 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		
		FileUtils.copyFile(scrFile123, new File("C:\\Users\\Dyamanna\\Screenshots\\319.png"));
		
		Select s= new Select(driver.findElement(By.xpath(".//*[@id='example1_length']/label/select")));
		s.selectByVisibleText("25");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\314.png"));
		Thread.sleep(10000);
		Select s1= new Select(driver.findElement(By.xpath(".//*[@id='example1_length']/label/select")));
		s1.selectByVisibleText("10");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\315(edit).png"));

		Thread.sleep(10000);
		Select s2= new Select(driver.findElement(By.xpath(".//*[@id='example1_length']/label/select")));
	
		s2.selectByVisibleText("50");
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\316(edit).png"));

		Thread.sleep(10000);
	Select s3= new Select(driver.findElement(By.xpath(".//*[@id='example1_length']/label/select")));
		s3.selectByVisibleText("100");
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\317(edit).png"));
		as.assertAll();

		
		
		
		
}
}