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

public class Web_273_widgets extends Login_faveo_admin{
	@Test
	public void widget_footer() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);
//		to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);	
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1200)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[7]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
		Thread.sleep(10000);	
		//footer 1
		
		
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[4]/span/a")).click();
		Thread.sleep(5000);	
		//enter footer1
		driver.findElement(By.xpath(".//*[@id='edit_widget1']/div/div/form/div[2]/div[1]/input")).clear();
		Thread.sleep(5000);	
	
		driver.findElement(By.xpath(".//*[@id='edit_widget1']/div/div/form/div[2]/div[1]/input")).sendKeys("faveo_helpdesk ladybird");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("html/body")).clear();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(".//*[@id='edit_widget1']/div/div/form/div[3]/input")).click();
		Thread.sleep(5000);	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\273(edit).png"));	
		
		
		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span	")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/ul/li[2]/div[2]/a/b")).click();
		
		
		Thread.sleep(7000);
		
		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\273(widgets).png"));	
		
		
		
		
	}
}
