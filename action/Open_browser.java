package action;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Open_browser {
	
	public static boolean loginRequired=true;
	public  WebDriver driver;
	public static Logger log = Log.getLogger("");
	public WebDriverWait wait;
	@BeforeClass()
	public void browser()
	{

	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer..exe");
//		driver=new InternetExplorerDriver();	

//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();	

		driver.get("http://jamboreebliss.com/Dyamanna/public/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
//		@AfterClass
//		public void close()
//		{
//			driver.quit();
//	}
}
















