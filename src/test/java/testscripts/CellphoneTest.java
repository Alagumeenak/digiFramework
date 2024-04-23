package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.CellphonePage;
import ObjectRepository.ElectronicsPage;
import ObjectRepository.HomePage;

public class CellphoneTest extends ElectronicsTest {
	
	@Test
	public void electronic_cellphone() {
	HomePage homepage=new HomePage(driver);
	ElectronicsPage electronicPage=new ElectronicsPage(driver);
	CellphonePage cellphonepage=new CellphonePage(driver);
	//click on cellphone link
	cellphonepage.getPageTitle().click();
	//verify cellphone page is displayed or not
	Assert.assertEquals(cellphonepage.getPageTitle(), "Cell phones", "cell phone page is not displayed");
	
	Select select=new Select(cellphonepage.getSortbyDropdown());
	select.selectByIndex(2);
	select.selectByVisibleText("Price: High to Low");
	
	
	}
}
