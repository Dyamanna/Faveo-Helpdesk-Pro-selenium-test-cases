package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver	driver=new FirefoxDriver();

		driver.get("http://www.faveohelpdesk.com/demo/helpdesk/");	
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	
	
		//to click on login modulo
				driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
				//
						//username
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("demo_admin");
						
						//password
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("demopass");
						//click on login button
						driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
						
		                 Thread.sleep(10000);
		                String tit = driver.getTitle();
		                System.out.println(tit);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
