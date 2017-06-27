package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_305_search_range    extends Login_faveo_admin {
	@Test
	public void create_range_search() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click on users
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[2]/a")).click();
		Thread.sleep(10000);
		//to click on user directory
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[1]")).click();
		Thread.sleep(10000); 
		
		driver.findElement(By.xpath(".//*[@id='search-text']")).sendKeys("akshay");
		driver.findElement(By.xpath(".//*[@id='search-text']")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(10000);
		File scr35=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr35, new File("C:\\Users\\Dyamanna\\Screenshots\\309(search).png"));		
		
		
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s.selectByVisibleText("25");
		File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr3, new File("C:\\Users\\Dyamanna\\Screenshots\\305(25).png"));		
		Thread.sleep(5000);
		//to display 10
		Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s1.selectByVisibleText("10");
		File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr1, new File("C:\\Users\\Dyamanna\\Screenshots\\306(10).png"));		
		Thread.sleep(5000);
		//to display 10
		Select s2=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s2.selectByVisibleText("50");
		File scr13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr13, new File("C:\\Users\\Dyamanna\\Screenshots\\307(50).png"));		
		Thread.sleep(5000);
		//to display 10
		Select s111=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s111.selectByVisibleText("100");
		File scr312=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr312, new File("C:\\Users\\Dyamanna\\Screenshots\\308(100).png"));		
		Thread.sleep(5000);	
			

		
		
}}
