package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logout {
public 	WebDriver driver;
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span	")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/ul/li[2]/div[2]/a/b")).click();
	
	}

}
