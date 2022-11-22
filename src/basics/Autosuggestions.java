package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("redmi");
		
		Thread.sleep(3000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele1.size());
		
		
		for(WebElement element: ele1)
		{
			System.out.println(element.getText());
			
		}
		driver.close();
		
	}			
}
