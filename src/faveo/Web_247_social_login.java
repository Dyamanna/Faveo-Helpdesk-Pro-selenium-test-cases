package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_247_social_login  extends Login_faveo_admin{
	@Test
	public void socail_login() throws InterruptedException
	{

		Thread.sleep(6000);
		//to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		// click kon social login 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on admin
	//click on facebook setting 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
