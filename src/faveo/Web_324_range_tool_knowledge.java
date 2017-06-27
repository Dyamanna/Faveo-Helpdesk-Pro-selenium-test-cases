package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_324_range_tool_knowledge extends Login_faveo_admin{
	@Test
	public void range() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click onn tools
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on knowledge response
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[4]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		log.info(driver.getTitle(),true);
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\324(knowledge Range).png"));
		
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("bin");
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).click();
		Thread.sleep(5000);
		File scrFile131 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile131, new File("C:\\Users\\Dyamanna\\Screenshots\\328(search bin pass).png"));
		
		
		
		Select s= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s.selectByVisibleText("25");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\325().png"));
		Thread.sleep(10000);
		Select s1= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s1.selectByVisibleText("10");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\326.png"));

		Thread.sleep(10000);
		Select s2= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	
		s2.selectByVisibleText("50");
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\327.png"));

		Thread.sleep(10000);
	Select s3= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s3.selectByVisibleText("100");
		File scrFile1322 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1322, new File("C:\\Users\\Dyamanna\\Screenshots\\328.png"));
		as.assertAll();
		
		
		
	}

}
