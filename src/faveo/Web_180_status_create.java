package faveo;

import generics.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_180_status_create  extends Login_faveo_admin{
	@Test
	public void create() throws InterruptedException
	{
Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		//click on ticket type
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", ""); 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		
		
		//to click on create
	
		
		
		int rc1= Excel.getRowCount("./data/input.xlsx", "statusdata");
		
		for(int i=1;i<=rc1;i++){	
		driver.findElement(By.xpath(".//*[@id='create']")).click();
		Thread.sleep(10000);
		
		
			String status = Excel.getCellValue("./data/input.xlsx", "statusdata", i, 0);
			String order = Excel.getCellValue("./data/input.xlsx", "statusdata", i, 1);
			String colour = Excel.getCellValue("./data/input.xlsx", "statusdata", i, 2);
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[1]/div/input")).sendKeys(status);
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[2]/div/input")).sendKeys(order);
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[4]/div/input")).sendKeys(colour);
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='sending_email']/div[1]/div/div[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='sending_email']/div[1]/div/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='sending_email']/div[1]/div/div[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
		Thread.sleep(8000);
		
		}
}
}