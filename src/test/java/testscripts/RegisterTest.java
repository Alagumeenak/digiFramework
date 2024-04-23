package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository.RegisterPage;
import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;

public class RegisterTest extends BaseClass {

	@Test(dataProvider = "data")
	public void register_001(String firstname, String lastname, String email, String password, String confirmPassword) {
		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		homePage.getLogout().click();
		homePage.getRegisterLink().click();
		registerPage.getFemale().click();
		registerPage.getFirstname().sendKeys(firstname);
		registerPage.getLastname().sendKeys(lastname);
		registerPage.getEmail().sendKeys(email);
		registerPage.getPassword().sendKeys(password);
		registerPage.getConfirmPassword().sendKeys(confirmPassword);
		registerPage.getRegisterButton().click();
	}

	@DataProvider(name = "data")
	public String[][] data() {
		return ExcelUtility.readRowData("Register");
	}
}
