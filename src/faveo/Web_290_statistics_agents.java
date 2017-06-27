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

public class Web_290_statistics_agents extends Login_faveo_admin {
	@Test
	public void click_on_inbox() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath(".//*[@id='agents']")).click();
		
		//to click on agents
		Thread.sleep(10000);
		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\289(dashboard dept).png"));	
		as.assertAll();
		  

}
}