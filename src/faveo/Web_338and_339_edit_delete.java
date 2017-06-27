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

public class Web_338and_339_edit_delete     extends Login_faveo_admin{
	@Test
	public void all_category() throws InterruptedException, IOException
	{SoftAssert as=new SoftAssert();
	//to click onn tools
	Thread.sleep(8000);
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//to click on knowledge response
	driver.findElement(By.xpath("(.//*[@id='bar']/a)[4]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(8000);
	//category
	driver.findElement(By.xpath(".//*[@id='side-bar']/li[2]/a/span")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(6000);
	driver.findElement(By.xpath(".//*[@id='side-bar']/li[2]/ul/li[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(6000);
//editing third entry 
	
	driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[3]/td[3]/a[1]")).click();
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("yyyyyyyyyyyyyyyy");
	Thread.sleep(6000);
	driver.findElement(By.xpath("	html/body/div/div/section[2]/form/div/div[3]/input")).click();
	File scrFile131 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile131, new File("C:\\Users\\Dyamanna\\Screenshots\\338(edit).png"));
	
Thread.sleep(6000);
	driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[4]/td[3]/span/button")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//button[.='Delete'])[position()=last()]")).click();
	Thread.sleep(6000);
	
	File scrFile13122 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screensho
	FileUtils.copyFile(scrFile13122, new File("C:\\Users\\Dyamanna\\Screenshots\\338(delete).png"));
	
	Thread.sleep(6000);
	

	
	
	
	
	
	
	
	


}
}