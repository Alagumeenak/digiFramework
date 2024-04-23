package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends BasePage {
	
	
		public ComputerPage(WebDriver driver) {
			super(driver);
		}
		@FindBy(xpath="//div[@class='page-title']//h1")
		private WebElement computerPageTitle;
		
		@FindBy(linkText="Desktops")
		private WebElement desktopText;
		
		@FindBy(xpath="//div[@class='sub-category-item']//img[@title='Show products in category Desktops']")
		private WebElement desktopImage;
		public WebElement getcomputerPageTitle() {
			return computerPageTitle;
		}
		public WebElement getDesktopText() {
			return desktopText;
		}
		public WebElement getDesktopImage() {
			return desktopImage;
		}
		

}
