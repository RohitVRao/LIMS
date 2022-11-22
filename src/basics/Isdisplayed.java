package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtextbox = driver.findElement(By.id("main-search"));
		
		if(searchtextbox.isDisplayed())
		{
			System.out.println("pass");
			searchtextbox.sendKeys("jeans");
		}
		
		else
		{
			System.out.println("fail");
		}
		driver.close();
		
		
		
		
		

	}
	

}
