package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DUmnmmi  {
	WebDriver driver;
@Test
public void gg() throws InterruptedException{
	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("http://jamboreebliss.com/Dyamanna/public/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
			//
					//username
					driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("jamboree_dyamann");
					
					//password
					

					System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
					driver=new FirefoxDriver();

				
					driver.get("http://jamboreebliss.com/Dyamanna/public/");
					driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

					driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
						//
								//username
					
	
}
}
