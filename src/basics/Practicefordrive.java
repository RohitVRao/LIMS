package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practicefordrive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(user)).click();
		
		driver.close();		
		
		
	
		
		
	}

}
