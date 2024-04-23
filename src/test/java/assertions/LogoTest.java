package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogoTest {
	@Test
	
	public void logo_001(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo=driver.findElement(By.xpath("//div[@class='header-logo']//img"));
		Assert.assertTrue(logo.isDisplayed());
		Reporter.log("Testcase done",true);
		driver.quit();
		
	}
	

}
