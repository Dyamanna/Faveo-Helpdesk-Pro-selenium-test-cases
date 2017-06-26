package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_267_storage extends Login_faveo_admin{
	@Test
	public void storage_database() throws InterruptedException, IOException
	{
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);
	//	to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		//to click on storage
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[9]/div/div/a/span/i")).click();
		Thread.sleep(8000);	
		
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='default']")));
		s.selectByVisibleText("Database");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/input")).click();
		Thread.sleep(4000);	
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.jamboreebliss.com:2082/cpsess8259058178/3rdparty/phpMyAdmin/sql.php?db=jamboree_Dyamanna&table=ticket_attachment&server=1&target=&token=b4c5fe4b359856259a7e54fd94fbc89f#PMAURL-0:sql.php?db=jamboree_Dyamanna&table=ticket_attachment&server=1&target=&token=b4c5fe4b359856259a7e54fd94fbc89f");	
		//login 
		d.findElement(By.xpath(".//*[@id='user']")).clear();
		
		d.findElement(By.xpath(".//*[@id='user']")).sendKeys("jamboree");
		d.findElement(By.xpath(".//*[@id='pass']")).clear();
		d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("nC!6D3zOnIvA");
		d.findElement(By.xpath(".//*[@id='login_submit']")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Dyamanna\\Screenshots\\267(edit).png"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
