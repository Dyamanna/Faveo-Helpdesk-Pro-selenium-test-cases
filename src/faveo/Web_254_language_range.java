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

import action.Login_faveo_admin;

public class Web_254_language_range extends Login_faveo_admin {
	@Test
	public void range() throws InterruptedException, IOException
	{ Thread.sleep(6000);
	//to click on admi
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,800)", "");
	// click on language setting
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
	Thread.sleep(10000);
	//to display range of the languages
	Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	s.selectByVisibleText("25");
	File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr3, new File("C:\\Users\\Dyamanna\\Screenshots\\254(25).png"));		
	Thread.sleep(5000);
	//to display 10
	Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	s1.selectByVisibleText("10");
	File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr1, new File("C:\\Users\\Dyamanna\\Screenshots\\254(10).png"));		
	Thread.sleep(5000);
	//to display 10
	Select s2=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	s2.selectByVisibleText("50");
	File scr13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr13, new File("C:\\Users\\Dyamanna\\Screenshots\\254(50).png"));		
	Thread.sleep(5000);
	//to display 10
	Select s111=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	s111.selectByVisibleText("100");
	File scr312=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr312, new File("C:\\Users\\Dyamanna\\Screenshots\\254(100).png"));		
	Thread.sleep(5000);	
		
	}

}
