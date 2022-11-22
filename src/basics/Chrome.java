package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\"C:\\Program Files\\Google\\Chrome\\Application\"");
		WebDriver driver = new ChromeDriver();
		

	}

}
