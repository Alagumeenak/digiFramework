package testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import ObjectRepository.AddtocartPage;
import ObjectRepository.CheckoutPage;
import ObjectRepository.HomePage;
import ObjectRepository.JewelryPage;
import ObjectRepository.PaymentInformationPage;
import genericLibrary.BaseClass;
@Listeners(listenersUtility.ListenersImpl.class)
public class SystemTest extends BaseClass{
	@Test
	public void sys_001() {
		
	HomePage homePage=new HomePage(driver);
	JewelryPage jewelrypage=new JewelryPage(driver);
	AddtocartPage addtocartPage=new AddtocartPage(driver);
	CheckoutPage checkoutpage=new CheckoutPage(driver);
	PaymentInformationPage payinfoPage=new PaymentInformationPage(driver);
	homePage.getJewelryLink().click();
	Assert.assertEquals(jewelrypage.getPagetitle().getText(),"Jewelry", "Jewelry page not displayed");
	jewelrypage.getAddtocart().click();
	homePage.getShoppingCartLink().click();
	addtocartPage.getAgree().click();
	addtocartPage.getCheckout().click();
	checkoutpage.getContinueaddress().click();
	checkoutpage.getShipcontinue().click();
	checkoutpage.getShippingmethod().click();
	checkoutpage.getShipmethodcontinue().click();
	
	checkoutpage.getPaymentCreditmethod().click();
	checkoutpage.getPaycontinue().click();
	payinfoPage.getCardtype().click();
	selectOptionByValue(payinfoPage.getCardtype(),"MasterCard");
	payinfoPage.getCardholdername().sendKeys("Kannan");
	payinfoPage.getCardno().sendKeys("5299920000000149");
	payinfoPage.getExpiremonth().click();
	selectOptionByVisibletext(payinfoPage.getExpiremonth(), "08");
	selectOptionByVisibletext(payinfoPage.getExpireyear(), "2025");
	payinfoPage.getCardcode().sendKeys("1234");
	
	checkoutpage.getPaycontinue().click();
	checkoutpage.getConfirm().click();
	
	}
}
