package action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Exx{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

	FileInputStream fis=new FileInputStream("C:\\Users\\yari\\Desktop\\faveo.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
		Cell dd=wb.getSheet("login").getRow(0).getCell(0);
		System.out.println(dd.toString());
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
	}
	

	
		
	


