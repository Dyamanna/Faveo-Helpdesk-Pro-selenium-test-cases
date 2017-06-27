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

public class Web_323_tools_knowledge  extends Login_faveo_admin{
@Test

public void canned() throws InterruptedException, IOException
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
	FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\323(knowledge).png"));
	
	
	
	
	
	
	
}
}
