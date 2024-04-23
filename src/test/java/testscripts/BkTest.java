package testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.BookPage;
import ObjectRepository.HomePage;
import genericLibrary.BaseClass;

public class BkTest extends BaseClass{
@Test
public void book_001() {
	HomePage homepage=new HomePage(driver);
	BookPage book=new BookPage(driver);
	//homepage.getBookLink().click();	
	driver.findElement(By.linkText("COMPUTERS")).click();
	test.log(LogStatus.INFO, "To click on books link","clicked on Book link");
	String actuatitle=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
	try {
	Assert.assertEquals(book.getBookPageTitle().getText(),"Books","Books page is not displayed");
	test.log(LogStatus.PASS, "Book page is displayed");
    }
	catch (AssertionError e) {
		// TODO: handle exception
	test.log(LogStatus.FAIL,"Books page not displayed", test.addScreenCapture(getWebPageScreenshot(driver)));
	}
}
@Test
public void book_002() {
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		homepage.getBookLink().click();	
		test.log(LogStatus.INFO, "Clicked on Book link");
		selectOptionByIndex(bookPage.getProduct(), 3);
		selectOptionByVisibletext(bookPage.getPgsize(), "12");
		selectOptionByVisibletext(bookPage.getView(), "List");
		
		
}
@Test
public void book_005() {
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		homepage.getBookLink().click();	
		test.log(LogStatus.INFO, "Clicked on Book link");
		selectOptionByIndex(bookPage.getProduct(), 3);
		selectOptionByVisibletext(bookPage.getPgsize(), "12");
		selectOptionByVisibletext(bookPage.getView(), "List");
		
		
}
@Test(enabled=false)
public void book_003() {
	//switch to Flipkart window
	switchToWindowByTitle(driver, "flipkart");
	//close the flipkart window
	driver.close();
	//switch to amazon window
	switchToWindowByUrl(driver, "amazon.in");
	//maximize Amazon window
	driver.manage().window().maximize();
	driver.close();
}


}
