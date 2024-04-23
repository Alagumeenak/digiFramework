package assertions;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
    
	@Test

	public void log(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Computers")).click();
	String actualTitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
	String expectedTitle="Books";
	Assert.assertEquals(actualTitle,expectedTitle);
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actualTitle, expectedTitle, "Books page is not displayed");
	driver.quit();
	
	Reporter.log("Test case completed",true);
	soft.assertAll();
	}

}

