package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_260_on_crone extends Login_faveo_admin {
	@Test
	public void setting_off_error() throws InterruptedException
	{Thread.sleep(6000);
	//to click on admi
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,800)", "");
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[5]/div/div/a/span/i")).click();
	Thread.sleep(7000);
	//to click on url then it will display off and on button(by default it is off only) keep it off
	driver.findElement(By.xpath("(.//*[@id='tab2'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='tab_2']/div/div[1]/div/div/span[3]")).click();
	//to open new browser
	WebDriver	driver2=new FirefoxDriver();
	driver2.get("http://jamboreebliss.com/Dyamanna/public/readmails");
	Thread.sleep(2000);
  //to open in faveo helpdeskinbox new browser	


	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver3 = new FirefoxDriver();

							driver3.get("http://jamboreebliss.com/Dyamanna/public/");
								//to click on login modulo
							driver3.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
							//username
							driver3.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("jamboree_dyamann");
							//password
							driver3.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("ammaloveu121");
								//click on login button
							driver3.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
							Thread.sleep(6000);
							//to click on admi
							driver3.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
							Thread.sleep(10000);	
							//click on agent panel
							driver3.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
							Thread.sleep(5000);
							driver3.findElement(By.xpath("(.//*[@id='load-inbox']/span)[1]")).click();
							Thread.sleep(6000);
							String recent = driver3.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[7]")).getText();
							System.out.println(recent);
							log.info("rcent"+recent,true);
	
	
	
	
	

}
}