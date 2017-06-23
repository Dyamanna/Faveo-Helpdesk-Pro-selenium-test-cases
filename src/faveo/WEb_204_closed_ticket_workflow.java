package faveo;

import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class WEb_204_closed_ticket_workflow  extends Login_faveo_admin{
	@Test
	public void  ticket_closed() throws InterruptedException
	{Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[7]/div/div/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[1]/div/div[2]/input")).sendKeys("2");
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[2]/div/div[2]/div[2]/div[1]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[3]/div/div[2]/button")).click();
		Thread.sleep(10000);
		String actual = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/div")).getText();
		String expe = "Successfully saved your settings ";
		Thread.sleep(10000);
		if(expe.equals(actual))
		{
			System.out.println("passed");
			log.info("passed");
		}
		else
			System.out.println("failed");
		log.info("failed");
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
		Thread.sleep(10000);
		
		
	}
						
}
