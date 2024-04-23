package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;
@Listeners(listenersUtility.ListenersImpl.class)
public class HomePageTest extends BaseClass {
	@Test
	public void home_001() {
		HomePage homepage = new HomePage(driver);
		homepage.getLogo().getText();
		homepage.getSearchtextfield().sendKeys("laptop");
		homepage.getSearchbutton().click();

	}

	public void home_002() {
		HomePage homepage = new HomePage(driver);
		scrollToElement(homepage.getLapTopImage());
	}

	@Test
	public void home_003() {
		HomePage homepage = new HomePage(driver);
		scrollFromOrigin(homepage.getLapTopImage(), 0, 300);
		scrollFromOrigin(homepage.getLapTopImage(), 0, -500);
	}
	// @Test(dataProvider="")

	@Test(dataProvider = "pdata")
	public void home_004(String products) {
		HomePage homePage = new HomePage(driver);
		homePage.getSearchtextfield().sendKeys(products);
		homePage.getSearchbutton().click();
	}

	@DataProvider(name = "pdata")
	public String[][] productdata() {
		return ExcelUtility.rdRowData("Products");
	}

}
