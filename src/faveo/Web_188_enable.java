package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_188_enable extends Login_faveo_admin{

@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admi
driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
Thread.sleep(10000);		// to click on admin
//click on ticket type

JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scrollBy(0,800)", "");
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[5]/div/div/a/span")).click();
Thread.sleep(10000); 
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
Thread.sleep(6000);		// to click on +

driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("very vtttgvnew");
Thread.sleep(6000);		
driver.findElement(By.xpath(".//*[@id='color']")).sendKeys("#FFFFFF");
Thread.sleep(6000);	

driver.findElement(By.xpath(".//*[@id='order']")).sendKeys("3");//colour
driver.findElement(By.xpath(".//*[@id='status']")).click();

Thread.sleep(6000);	
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[3]/input")).click();//save
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("(.//*[@id='load-inbox']/span)[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//*[@id='tool4']/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//*[@id='labels-button']")).click();
	File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr3,new File("C:\\Users\\Dyamanna\\Screenshots\\188(enble).png"));
	Thread.sleep(10000);
	




}
}
