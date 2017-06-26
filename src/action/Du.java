package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Du {
	@Test
	public void o()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http://www.google.com");
		

		
		
			
		}
	

}
