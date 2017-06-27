package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_332_all_category extends Login_faveo_admin{
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
File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile13, new File("C:\\Users\\Dyamanna\\Screenshots\\332.png"));
//searching category
Thread.sleep(7000);
driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("testing");
driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).click();
Thread.sleep(6000);
File scrFile103 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile103, new File("C:\\Users\\Dyamanna\\Screenshots\\332(searching..).png"));




	//range of the categories

Select s= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s.selectByVisibleText("25");
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\333(edit).png"));
Thread.sleep(10000);
Select s1= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s1.selectByVisibleText("10");
File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\334(edit).png"));

Thread.sleep(10000);
Select s2= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));

s2.selectByVisibleText("50");
File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile12, new File("C:\\Users\\Dyamanna\\Screenshots\\335(edit).png"));

Thread.sleep(10000);
Select s3= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
s3.selectByVisibleText("100");
File scrFile1312 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile1312, new File("C:\\Users\\Dyamanna\\Screenshots\\336(edit).png"));

as.assertAll();









}
}
