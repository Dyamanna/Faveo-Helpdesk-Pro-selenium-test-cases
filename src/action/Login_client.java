package action;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Login_client extends Open_browser{
	public  Login_client()
	 {
		super();
	 }

	@BeforeMethod()
	
	public void login() throws InterruptedException
	{
		//to click on login modulo
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		//
				//username
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("demo_client");
				
				//password
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("demopass");
				//click on login button
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
				
                Thread.sleep(10000);
}
	
	
	
	
	
	@AfterClass
	public void logout() throws InterruptedException{
		
	
	Thread.sleep(5000);

	}

}
