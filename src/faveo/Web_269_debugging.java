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

public class Web_269_debugging  extends Login_faveo_admin{
@Test
public void debugging() throws InterruptedException, IOException
{

	SoftAssert as=new SoftAssert();
	Thread.sleep(10000);
//	to click on admi
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,1000)", "");
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[6]/div[2]/div/div/div/div/div/a/span/i")).click();
	Thread.sleep(6000);
	//enable
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input")).click();
	Thread.sleep(6000);//yes
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div/div[2]/div/div/div[1]/input")).click();
	Thread.sleep(6000);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\269(edit).png"));	
	
	

	
	
}
}
