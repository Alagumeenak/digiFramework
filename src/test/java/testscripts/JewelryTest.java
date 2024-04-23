package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.ElectronicsPage;
import ObjectRepository.HomePage;
import ObjectRepository.JewelryPage;
import genericLibrary.BaseClass;

public class JewelryTest extends BaseClass {
	@Test
	public void jewelry() {
		HomePage homepage=new HomePage(driver);
		ElectronicsPage electronicPage=new ElectronicsPage(driver);
		JewelryPage jewelryPage=new JewelryPage(driver);
		Assert.assertEquals(jewelryPage.getPagetitle().getText(),"Jewelry", "Jewelry page not displayed");
	
		jewelryPage.getAddtocart().click();
		
	}

}
