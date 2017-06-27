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

public class Web_349_delete_article extends Login_faveo_admin{
	@Test
	public void delete() throws InterruptedException, IOException
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
		//click on articles
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[3]/a")).click();
		Thread.sleep(4000);
		//all articles
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[3]/ul/li[2]/a")).click();//
		Thread.sleep(4000);
		//to delete an article
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[2]/td[3]/span/button")).click();//
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[.='delete'])[position()=last()]")).click();
		Thread.sleep(6000);
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\349.png"));

		
	}

}
