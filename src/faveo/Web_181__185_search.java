package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_181__185_search extends Login_faveo_admin {

@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin
try{
driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
Thread.sleep(10000);		// to click on admin
//click on ticket type

JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scrollBy(0,800)", "");
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[5]/div/div/a/span")).click();
Thread.sleep(10000); 
Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s.selectByVisibleText("10");
File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr,new File("C:\\Users\\Dyamanna\\Screenshots\\181.png"));
Thread.sleep(10000);
Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s1.selectByVisibleText("25");
File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr1,new File("C:\\Users\\Dyamanna\\Screenshots\\182.png"));
Thread.sleep(10000);
Select s2=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s2.selectByVisibleText("100");
File scr2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr2,new File("C:\\Users\\Dyamanna\\Screenshots\\183.png"));
Thread.sleep(10000);
Select s3=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s3.selectByVisibleText("50");
File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr3,new File("C:\\Users\\Dyamanna\\Screenshots\\184.png"));
Thread.sleep(10000);
}
catch(Exception e)
{
	log.info("e"+e);
}
}
}
