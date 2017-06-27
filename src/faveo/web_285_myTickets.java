package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class web_285_myTickets  extends Login_faveo_admin {
	@Test
	public void click_on_inbox() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath(".//*[@id='load-myticket']/span")).click();
		Thread.sleep(6000);
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s.selectByVisibleText("25");
		Thread.sleep(7000);
		
		//to click on unassign
		
		
		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\285(dashboard.my tickets).png"));	
		as.assertAll();
		 

}}
