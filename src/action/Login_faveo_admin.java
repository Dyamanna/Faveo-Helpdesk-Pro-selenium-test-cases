package action;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Login_faveo_admin extends Open_browser {
	public  Login_faveo_admin()
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
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("jamboree_dyamann");
				
				//password
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("ammaloveu121");
				//click on login button
				driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
				
                 Thread.sleep(10000);
                String tit = driver.getTitle();
                System.out.println(tit);
            	Thread.sleep(8000);

		
		
	}
	
}