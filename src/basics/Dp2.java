package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dp2 {  //FRAMES

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("9875679876");	
		
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("mobile");
		
		Thread.sleep(5000);
		
		
		

		
		
		
		
		driver.close();
	}

}

