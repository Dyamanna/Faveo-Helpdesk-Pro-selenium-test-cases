package faveo;

import generics.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_262_security extends Login_faveo_admin{
	@Test(priority=2)
	public void security() throws InterruptedException
	{
		Thread.sleep(6000);
		//to click on admi
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[6]/div/div/a/span/i")).click();
		Thread.sleep(6000);
		//enter attempts
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[2]/div/div[2]/span/input")).clear();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[2]/div/div[2]/span/input")).sendKeys("2");
		Thread.sleep(6000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[3]/div/div[2]/span/input")).clear();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/form/div[3]/div/div[2]/span/input")).sendKeys("1");
		Thread.sleep(6000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[3]/button")).click();
}
		//submit
	@Test(priority=1)
	public void check() throws InterruptedException{
		WebDriver dr=new FirefoxDriver();
		dr.get("http://jamboreebliss.com/Dyamanna/public/");
		int rc = Excel.getRowCount("./data/status.xlsx", "security");
		for(int i=1;i<=rc;i++){
			dr.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
			
			String un=Excel.getCellValue("./data/status.xlsx", "security", i, 0);	
			
		String pwd=Excel.getCellValue("./data/status.xlsx", "security", i, 1);	
		
		dr.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys(un);
		Thread.sleep(10000);
		dr.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys(pwd);
		Thread.sleep(10000);
		//click on login button
		dr.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
		
		Thread.sleep(5000);
	driver.navigate().refresh();
		}
	}

	
	
}
