package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Test;
 
public class DataProviderTest  {
 
	private static WebDriver driver;
 
  @DataProvider(name = "Authentication")
 
  public static Object[][] credentials()
  {
 
        return new Object[][] { 	{ "11", "Test3"},{ "demo_admin", "demopass" }};
 
  }
 
  // Here we are calling the Data Provider object with its Name
 
  @Test(dataProvider = "Authentication")
 
  public void test(String sUsername, String sPassword) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
	  driver = new FirefoxDriver();
 
      driver.get("http://www.faveohelpdesk.com/demo/helpdesk/");
 
    //to click on login modulo
    		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
    		//
    				//username
    				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys(sUsername);
    				
    				//password
    				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys(sPassword);
    				//click on login button
    				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
    				
                     Thread.sleep(5000);
                     
                     String act=driver.getTitle();
                     String tit="Faveo | HELP DESK";
                     
                     
                     if(tit.equals(act))
                     {
                    	 System.out.println("you are in the correct page now");
                     }
                     
                     
      driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[5]/a/span")).click();
      
     Thread.sleep(5000);

     driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[5]/ul/li[2]/div[2]/a/b")).click();
      
      Thread.sleep(3000);

      driver.quit();
  }}
 