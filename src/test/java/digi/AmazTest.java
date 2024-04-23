package digi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	  
		for (WebElement link : links) {
			
		
		System.out.println(link.getText());
		}
		driver.quit();
	}

}
