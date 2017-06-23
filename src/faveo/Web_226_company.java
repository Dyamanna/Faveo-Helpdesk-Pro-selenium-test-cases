package faveo;

import generics.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_226_company  extends Login_faveo_admin {
	
	@Test
	public void company() throws InterruptedException
	{//to click on admin
		SoftAssert as=new SoftAssert();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[@class='fa fa-building-o fa-stack-1x']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='company_name']")).clear();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='company_name']")).sendKeys("google");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='website']")).clear();
		Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='website']")).sendKeys("http://www.google.com");
		Thread.sleep(5000);
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='admin_header_color1']")));
		s.selectByIndex(3);
		Thread.sleep(5000);
		Select s1=new Select(driver.findElement(By.xpath(".//*[@id='agent_header_color1']")));
		s1.selectByIndex(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
		String	act=driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]")).getText();
		String exp="Company updated successfully";
	if(act.equalsIgnoreCase(exp))
	{
		log.info("passed",true);
	}
	else
		log.info("failed",true);
	
		
	}
	}


