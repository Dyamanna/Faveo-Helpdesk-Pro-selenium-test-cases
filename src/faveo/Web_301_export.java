package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_301_export {
public 	WebDriver driver;
	@Test
	public void export() throws InterruptedException, IOException
	{System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		driver=new FirefoxDriver(profile);
		driver.get("http://jamboreebliss.com/Dyamanna/public/");
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
  //username
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("jamboree_dyamann");
//password
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("ammaloveu121");
//click on login button
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
		Thread.sleep(10000);
		//to click on users
			driver.findElement(By.xpath("//a[.='Users']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on user directory
			driver.findElement(By.xpath("(.//*[@id='bar']/a)[1]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("html/body/div/div/section[2]/div/div[1]/div/div[3]/a[1]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(".//*[@id='submit']")).click();
		File scrFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("C:\\Users\\Dyamanna\\Screenshots\\301dashboard team).png"));	
		
	
	}

}