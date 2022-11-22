package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException
	{
		
      WebDriver Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      Driver.get("https://www.instagram.com/");
      Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      Driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
      Driver.findElement(By.cssSelector("input[name='password']")).sendKeys("manager");
      
      
      
      
      





      
	
	}	
 }
