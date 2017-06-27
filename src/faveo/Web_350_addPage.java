package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_350_addPage extends Login_faveo_admin{
	@Test
	public void add_page() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		//to click onn tools
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on knowledge response
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[4]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[4]/a/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[4]/ul/li[1]/a")).click();
		//page name
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("page4");
		Thread.sleep(6000);
	
		driver.findElement(By.xpath("html/body/div/div/section[2]/form/div/div/div[2]/div/div[3]/input")).click();
		Thread.sleep(6000);
	//logout
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[5]/a/img")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//b[.='Sign out']")).click();
	
		Thread.sleep(6000);
		
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[1]/li[6]/a")).click();
		Thread.sleep(6000);
	

		File scrFile13122 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screensho
		FileUtils.copyFile(scrFile13122, new File("C:\\Users\\Dyamanna\\Screenshots\\350(add page).png"));
		
}
}