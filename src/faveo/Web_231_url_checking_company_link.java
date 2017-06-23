package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_231_url_checking_company_link extends Login_faveo_admin {
	@Test
	public void url() throws InterruptedException, IOException  {
	Thread.sleep(5000);
	{driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span")).click();
	driver.findElement(By.xpath("//b[.='Sign out']);")).click();
	String exp1="Dyamanna";
	String act21 = driver.findElement(By.xpath(".//*[@id='logo']/a")).getText();
	if(exp1.equalsIgnoreCase(act21))
			{
		log.info("passes",true);
			}
	else
		log.info("failed:you are not in the correct page",true);
		log.info(driver.getCurrentUrl(),true);
	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\229(2).png"));	
	Thread.sleep(8000);
	driver.findElement(By.xpath(".//*[@id='colophon']/div/div[3]/div[1]/p/a[1]")).click();
	Thread.sleep(8000);
	String face = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).getText();
	
	String a="facebook";
	if(face.equalsIgnoreCase(a))
	{
		log.info("yes you are in the correct page",true);
	}
	else
		log.info("yes you are not in the correct page",true);
	File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile11, new File("C:\\Users\\Dyamanna\\Screenshots\\229(3).png"));	
	

}}}
