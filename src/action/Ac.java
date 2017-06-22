package action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.faveohelpdesk.com/online-demo/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='menu-item-593']/a")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
//		
//		driver.findElement(By.xpath(".//*[@id='content']/div[4]/div/div[1]/div/div[1]/a/img"));
//		
//		
//		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("dyamanna0143@gmail.com");
//		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("ammaloveu121");
//		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).click();
//		
//		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
