package testscripts;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.AddtocartPage;
import ObjectRepository.BookPage;
import ObjectRepository.CheckoutPage;
import ObjectRepository.ComputerPage;
import ObjectRepository.ElectronicsPage;
import ObjectRepository.HomePage;
import ObjectRepository.JewelryPage;
import ObjectRepository.PaymentInformationPage;
import genericLibrary.BaseClass;

public class CommonTest extends BaseClass{
	
    //Verify user is able to search the product
	
	@Test
	public void home_001() {
	
		HomePage homepage=new HomePage(driver);
        homepage.getLogo().getText();
		homepage.getSearchtextfield().sendKeys("laptop");
		homepage.getSearchbutton().click();
		
	}
	//Verify user is able to check whether book page is displayed or not
	@Test
	
	public void book_001() {
		HomePage homepage=new HomePage(driver);
		BookPage book=new BookPage(driver);
		homepage.getBookLink().click();	
		Assert.assertEquals(book.getBookPageTitle().getText(),"Books","Books page is not displayed");
	    }
	@Test
	public void book_002() {
			HomePage homepage=new HomePage(driver);
			BookPage bookPage=new BookPage(driver);
			homepage.getBookLink().click();	
			selectOptionByIndex(bookPage.getProduct(), 3);
			selectOptionByVisibletext(bookPage.getPgsize(), "12");
			selectOptionByVisibletext(bookPage.getView(), "List");
			
	}
	//Verify user is able to check whether computer is displayed or not

	@Test
	public void comp_001() {
		HomePage homepage=new HomePage(driver);
		ComputerPage comp=new ComputerPage(driver);
		homepage.getComputerLink().click();
		 Assert.assertEquals(comp.getcomputerPageTitle().getText(),"COMPUTERS","Computer is not displayed");
	}
	//Verify user is able to open the desktop and check desktop is displayed or not
	public void comp_002() {
		HomePage homepage=new HomePage(driver);
		ComputerPage comp=new ComputerPage(driver);
		homepage.getComputerLink().click();
		Assert.assertTrue(comp.getDesktopText().isDisplayed());
		Assert.assertTrue(comp.getDesktopImage().isDisplayed());
		
	}
	
	@Test
	public void electronic_001() {
		HomePage homepage=new HomePage(driver);
		ElectronicsPage electronicPage=new ElectronicsPage(driver);
		homepage.getElectronicPage().click();
		try {
			Assert.assertEquals(electronicPage.getElectronicsTitle().getText(),"Electronics","Ëlectronics page not displayed");
		    test.log(LogStatus.PASS, "Ëlectronics page displayed");
		    }
		catch (Exception e) {
		test.log(LogStatus.FAIL,"Ëlectronics page not displayed" );
		e.printStackTrace();
			// TODO: handle exception
		
		                     }
	    }
	
		@Test
		public void jewelry_001(){
			HomePage homepage=new HomePage(driver);
			JewelryPage jewelrypage=new JewelryPage(driver);
			
			Assert.assertEquals(jewelrypage.getPagetitle().getText(),"Jewelry", "Jewelry page not displayed");
			homepage.getJewelryLink().click();
			Assert.assertEquals(jewelrypage.getHeartChainimg().isDisplayed(),true,"Black and diamond image is not displayed");
			jewelrypage.getAddtocart().click();
		}
		@Test
		public void addtocart_001(){
			HomePage homePage=new HomePage(driver);
			JewelryPage jewelrypage=new JewelryPage(driver);
			AddtocartPage addtocartPage=new AddtocartPage(driver);
			
			//Assert.assertEquals(jewelrypage.getPagetitle().getText(),"Jewelry", "Jewelry page not displayed");
			jewelrypage.getAddtocart().click();
			homePage.getShoppingCartLink().click();
			addtocartPage.getAgree().click();
			addtocartPage.getCheckout().click();
			
		}
		public void checkout_001() {
			HomePage homePage=new HomePage(driver);
			CheckoutPage checkoutpage=new CheckoutPage(driver);
			PaymentInformationPage payPage=new PaymentInformationPage(driver);
			checkoutpage.getContinueaddress().click();
			
			checkoutpage.getShipcontinue().click();
			
			checkoutpage.getShippingmethod().click();
			checkoutpage.getShipmethodcontinue().click();
			
			checkoutpage.getPaymentCreditmethod().click();
			checkoutpage.getPaycontinue().click();
			selectOptionByValue(payPage.getCardtype(),"MasterCard");
			
		}
		
		
}
