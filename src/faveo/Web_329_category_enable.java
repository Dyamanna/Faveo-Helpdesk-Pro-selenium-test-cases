package faveo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_329_category_enable  extends Login_faveo_admin{
	@Test
	public void category() throws InterruptedException
	{
		SoftAssert as=new SoftAssert();
		//to click onn tools
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click on knowledge response
		driver.findElement(By.xpath("(.//*[@id='bar']/a)[4]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		//category
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[2]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//add category
		driver.findElement(By.xpath(".//*[@id='side-bar']/li[2]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//enter values

		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("sales");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.findElement(By.xpath("html/body")).sendKeys("hiii how are u");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		Thread.sleep(7000);
		
		
		
			
		
		
			
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
