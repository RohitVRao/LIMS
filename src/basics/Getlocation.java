package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sephora.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtextbox = driver.findElement(By.id("site_search_input"));
		Point loc = searchtextbox.getLocation();
		int x = loc.getX();
		System.out.println("x cordinate " + x);
		int y = loc.getY();
		System.out.println("y cordinate " + y);
		driver.close();		
		
		
		
		
		
		

	}

}
