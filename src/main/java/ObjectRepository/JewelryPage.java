package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage extends BasePage {
	public JewelryPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class='page-title']/h1")
	private WebElement pagetitle;
	@FindBy(xpath="//div[@class='product-item']//img[@alt='Picture of Black & White Diamond Heart']")
	private WebElement heartChainimg;
	public WebElement getHeartChainimg() {
		return heartChainimg;
	}
	@FindBy(xpath="//a[.='Black & White Diamond Heart']/../..//input[@value='Add to cart']")
	private WebElement addtocart;
	@FindBy(xpath="//span[.='Shopping cart']")
	private WebElement cart;
	public WebElement getCart() {
		return cart;
	}
	public WebElement getPagetitle() {
		return pagetitle;
	}
	
	
	public WebElement getAddtocart() {
		return addtocart;
	}
}
