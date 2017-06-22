package faveo;

import generics.Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_202_rating_create_delete extends Login_faveo_admin {
	@Test
	public void rating() throws InterruptedException 
	{	Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[6]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on rating
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/div/div/a/i")).click();
		int order=1;
		int rc=Excel.getRowCount("./data/status.xlsx", "rating");
		for(int i=1;i<=rc;i++)
		{
			String ord = Integer.toString(order);
		Thread.sleep(10000);
			String name = Excel.getCellValue("./data/status.xlsx", "rating", i, 0);
			driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(name);
			driver.findElement(By.xpath(".//*[@id='display_order']")).sendKeys(ord);
						order++;
						Thread.sleep(10000);
						Select s=new Select(driver.findElement(By.xpath(".//*[@id='rating_scale']")));	
						s.selectByVisibleText("5");
						driver.findElement(By.xpath("(.//*[@id='allow_modification'])[1]")).click();
						Thread.sleep(10000);
						driver.findElement(By.xpath("html/body/	div[1]/div/section[2]/form/div/div[3]/input")).click();
						Thread.sleep(10000);
						driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/button")).click();}
				Thread.sleep(10000);
				driver.findElement(By.xpath(".//*[@id='example1']/tbody/tr[4]/td[4]/button")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath(".//*[@id='delete']")).click();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
		
	
	


