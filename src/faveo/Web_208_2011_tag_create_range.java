package faveo;

import java.io.File;
import java.io.IOException;

import generics.Excel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_208_2011_tag_create_range extends Login_faveo_admin {
	@Test
	public void tag() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(6000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[8]/div/div/a/span/i")).click();
		Thread.sleep(10000);	
		int c= Excel.getRowCount("./data/status.xlsx", "tag");
		for(int i=1;i<c;i++){
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a")).click();
		Thread.sleep(10000);	
		String name=Excel.getCellValue("./data/status.xlsx", "tag", i, 0);
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(name);
		Thread.sleep(10000);	
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[3]/input")).click();
		Thread.sleep(10000);	
		String alertbar=driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/ul/li")).getText();
		String alert="The name has already been taken.";
		if(alert.startsWith(alertbar)){
			break;
		}
		}
		String text = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]")).getText();
		String act="Tag has created";
		if(text.startsWith(act)){
		System.out.println("pass tag");
		}
		else
			System.out.println("fail");
			Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath(".//*[@id='load-inbox']/span")).click();
		Thread.sleep(10000);
		//
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='tag']")).click();
		driver.findElement(By.xpath(".//*[@id='tag']")).sendKeys("sar");
		Thread.sleep(10000);
		File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr3,new File("C:\\Users\\Dyamanna\\Screenshots\\208(tag).png"));
		Thread.sleep(10000);
		as.assertAll();
	}

}
