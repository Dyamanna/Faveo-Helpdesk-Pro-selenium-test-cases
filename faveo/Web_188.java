package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_188 extends Login_faveo_admin{
	@Test
	public void create() throws InterruptedException
	{
	
		
		
		
		
		
		
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		//click on ticket type
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[5]/div/div/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
		Thread.sleep(6000);		

		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("dfshvbcb");

		
		
	}

}
