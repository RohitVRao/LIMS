package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

		

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.navigate().to("https://sephora.nnnow.com/?gclid=CjwKCAjw_b6WBhAQEiwAp4HyIAAIAXfidXFpigLexpo_IZs84bw-ves4oL9GbYSeQOum7FMxKgXxPxoC7tIQAvD_BwE");
			
		   Set<String> child = driver.getWindowHandles();
		   System.out.println(child);
		   
		   driver.quit();
		   

	}

}
