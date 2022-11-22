package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sephora.nnnow.com/?gclid=Cj0KCQjwxb2XBhDBARIsAOjDZ36w82DM1pXJqCYF4ZrrPtNPk3inElcGcKyncFTxTthboqzTPzN2UHAaAklrEALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("(//span[@class='nw-mainnav-text'])[7]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='nw-navtreev2-link nw-navtreev2-link-level3'])[100]")).click();
		
		driver.quit();

	}

}
