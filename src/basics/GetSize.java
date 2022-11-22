package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sephora.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtextbox = driver.findElement(By.id("site_search_input"));
		Dimension s = searchtextbox.getSize();
		int h = s.getHeight();
		System.out.println("height " + h);
		int w = s.getWidth();
		System.out.println("width " + w);
		driver.close();		
		

	}

}
