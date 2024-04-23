package testscripts;

import org.testng.annotations.Test;

import ObjectRepository.AddtocartPage;
import ObjectRepository.HomePage;
import ObjectRepository.JewelryPage;
import genericLibrary.BaseClass;

   public class AddtocartTest extends BaseClass{
   @Test	
   public void addtocart() {
   HomePage homePage=new HomePage(driver);
   AddtocartPage addcart=new AddtocartPage(driver);
   JewelryPage jewelryPage=new JewelryPage(driver);
   homePage.getJewelryLink().click();
   jewelryPage.getAddtocart().click();
   homePage.getShoppingCartLink().click();
   addcart.getAgree().click();
   addcart.getCheckout().click();
   
   }
   @Test
   public void removecart() {
	   HomePage homePage=new HomePage(driver);
	   AddtocartPage addcart=new AddtocartPage(driver);
	   JewelryPage jewelryPage=new JewelryPage(driver);
	   homePage.getJewelryLink().click();
	   jewelryPage.getAddtocart().click();
	   homePage.getShoppingCartLink().click();
	   
   }
}
