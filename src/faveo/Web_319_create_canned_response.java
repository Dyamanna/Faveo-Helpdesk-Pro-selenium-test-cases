package faveo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_319_create_canned_response extends Login_faveo_admin {
	@Test
	public void create() throws InterruptedException
	{

		SoftAssert as=new SoftAssert();
		//to click onn tools
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on canned response
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div/div/section[2]/div/div[1]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("reply");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("");
		
		
		
	}

}
