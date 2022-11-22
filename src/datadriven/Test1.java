package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("selenium excel sheet.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
		
	
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.findElement(By.id("id_userLoginId")).sendKeys(un);
		Driver.findElement(By.id("id_password")).sendKeys(pwd);
		
		
		
		
		
		

	}

}
