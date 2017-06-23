package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_223_auto_assign extends Login_faveo_admin {
	@Test
	public void auto_assign() throws InterruptedException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[10]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		// to enable
		driver.findElement(By.xpath("(.//*[@id='status'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(.//*[@id='only_login'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//*[@id='assign_not_accept'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='thresold']")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/form/div[2]/input")).click();
		Thread.sleep(3000);
	
		
	}
	
}
