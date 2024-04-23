package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.ElectronicsPage;
import ObjectRepository.HomePage;
import genericLibrary.BaseClass;
public class ElectronicsTest extends BaseClass{
@Test(groups = "ST")
public void electronic_001() {
	HomePage homepage=new HomePage(driver);
	ElectronicsPage electronicPage=new ElectronicsPage(driver);
	homepage.getElectronicPage().click();
	try {
		Assert.assertEquals(electronicPage.getElectronicsTitle().getText(),"Electronics","Ëlectronics page not displayed");
	    test.log(LogStatus.PASS, "Ëlectronics page displayed");
	} catch (Exception e) {
	test.log(LogStatus.FAIL,"Ëlectronics page not displayed" );
	e.printStackTrace();
		// TODO: handle exception
	
	}
	//Assert.assertEquals(electronicPage.getElectronicsTitle().getText(),"Electronics","Ëlectronics page not displayed");
    
    }


    }
