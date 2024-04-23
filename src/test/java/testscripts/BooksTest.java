package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;

public class BooksTest extends BaseClass {
@Test
public void book_001() {
	driver.findElement(By.linkText("BOOKS")).click();
	test.log(LogStatus.INFO, "Clicked on books link");
	String book=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
	try {
	Assert.assertEquals(book,"Computers","Books not displayed");
	 Reporter.log("Book is displayed successfully", true);
	 test.log(LogStatus.PASS,"Book page is displayed");
	}
	catch (AssertionError e) {
		// TODO: handle exception
		test.log(LogStatus.FAIL, test.addScreenCapture(getWebPageScreenshot(driver)));
	}
	Reporter.log("Testcase is completed",true);
}
	
@Test
 public void book_002() {
	 driver.findElement(By.linkText("BOOKS")).click();
	boolean product =driver.findElement(By.id("products-orderby")).isDisplayed();
	 Assert.assertEquals(product, true, "Position is not displayed");
	 Reporter.log("Succesfull",true);
 }

}
