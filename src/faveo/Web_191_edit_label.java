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

public class Web_191_edit_label  extends Login_faveo_admin{

@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin

driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
Thread.sleep(10000);		// to click on admin
//click on ticket type

JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scrollBy(0,800)", "");
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[5]/div/div/a/span")).click();
Thread.sleep(10000); 
driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[4]/p/a[1]")).click();
Thread.sleep(10000); 
driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("diasble");
Thread.sleep(10000);
driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[3]/input")).click();//save
Thread.sleep(10000);
File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scr3,new File("C:\\Users\\Dyamanna\\Screenshots\\191(edit).png"));
Thread.sleep(10000);



}
}