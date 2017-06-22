package action;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdata  {
	public void tc() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	driver.get("http://jamboreebliss.com/Dyamanna/public/");
	ArrayList<String> user=readExcelData(0);
	ArrayList<String> pwd=readExcelData(1);
	for(int i=0;i<user.size();i++)
	{
		//to click on login modulo
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		//username
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys(user.get(i));
		
		//password
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys(pwd.get(i));
		//click on login button
		driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();

		
	}
		
	}

	public  ArrayList<String> readExcelData(int colNo) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\yari\\git\\Laxmi\\data\\faveo.xlsx");
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	HSSFSheet s=wb.getSheet("");
	Iterator<Row> it = s.iterator();
	it.next();
	ArrayList<String> list= new ArrayList<String> ();
	while(it.hasNext())
	{
		list.add(it.next().getCell(colNo).getStringCellValue());
		
	}
	System.out.println(list);
	
		return list;
		
		
		
	}
	public static void main(String[] args) throws IOException {
	
		Readdata data=new Readdata();
		{
			data.readExcelData(1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
