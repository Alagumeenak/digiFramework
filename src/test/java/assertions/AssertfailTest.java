package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class AssertfailTest {
	public void logfail() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement     cellPhoneLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/cell-phones']"));
	
	//Assert.assertEquals(cellPhoneLink.isDisplayed(),false, "Cellphone Link is displayed");
    Assert.assertFalse(cellPhoneLink.isDisplayed(),"Cellphone Link is displayed");
	driver.quit();
	}
}
