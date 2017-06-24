package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class web_237_unvarified_no      extends Login_faveo_admin {
	@Test
	public void status_Offline() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div/div/section[2]/div[5]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		//status online
		driver.findElement(By.xpath("(.//*[@id='status'])[1]")).click();
		Thread.sleep(5000);
		//Allow users to set ticket status(yes)
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[2]/div[2]/div[2]/div/div/div[2]/input")).click();
		Thread.sleep(5000);
		//Allow unverified users to create tickets(no)
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[2]/div[3]/div[1]/div/div/div[2]/input")).click();
		Thread.sleep(5000);
		//Make email mandatory for ticket/user creation(yes)
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[2]/div[3]/div[2]/div/div/div[1]/input")).click();
		Thread.sleep(5000);//to click on submit
		driver.findElement(By.xpath(".//*[@id='formID']/div/div[3]/input")).click();
		Thread.sleep(5000);
		//logout
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/a/span	")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[4]/ul/li[2]/div[2]/a/b")).click();
		Thread.sleep(5000);	
		//submitticket
		driver.findElement(By.xpath(".//*[@id='corewidgetbox']/div/span[2]/a/span")).click();
		Thread.sleep(5000);	
		JavascriptExecutor j1=(JavascriptExecutor)driver;
		j1.executeScript("window.scrollBy(0,300)", "");
		
		File scr3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr3, new File("C:\\Users\\Dyamanna\\Screenshots\\237(no).png"));	
		
		
		
		
	
		
		
		
		
		
		
}
}
