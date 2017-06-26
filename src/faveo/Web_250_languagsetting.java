package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_250_languagsetting {
	public WebDriver driver;
	@Test
	public void language() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		FirefoxProfile f=new  FirefoxProfile();
		f.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		driver=new FirefoxDriver(f);
		driver.get("http://jamboreebliss.com/Dyamanna/public/");
		//to click on login modulo
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		//username
			driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("jamboree_dyamann");
			driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("ammaloveu121");
				//click on login button
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
				Thread.sleep(10000);
                String tit = driver.getTitle();
                System.out.println(tit);
            	Thread.sleep(8000);
      Thread.sleep(6000);
		//to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		// click on language setting
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/span/a[1]")).click();
	
	
	}

}
