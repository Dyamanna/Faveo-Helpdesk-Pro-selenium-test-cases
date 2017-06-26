package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_259_crone_settinf_off_error extends Login_faveo_admin {
	@Test
	public void setting_off_error() throws InterruptedException
	{Thread.sleep(6000);
	//to click on admi
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,800)", "");
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[5]/div[2]/div/div/div[5]/div/div/a/span/i")).click();
	Thread.sleep(7000);
	//to click on url then it will display off and on button(by default it is off only) keep it off
	driver.findElement(By.xpath("(.//*[@id='tab2'])[2]")).click();
	//to open new browser
	WebDriver	driver2=new FirefoxDriver();
	driver2.get("http://jamboreebliss.com/Dyamanna/public/readmails");
	Thread.sleep(2000);
	String warning = driver.findElement(By.xpath(".//*[@id='page']/article/h2")).getText();	
	String alert="We are sorry, but the page you are looking for can not be found.";
	if(warning.equals(alert))
	{
		log.info("it throw error please on setting ",true);
		
		
		
	}
	if(warning.equals(alert))
	{
		System.out.println("it throw error please on setting ");
		
		
		
	}
	
	
	
	}

}
