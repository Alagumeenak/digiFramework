package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage extends BasePage{
	public AddtocartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[class='page-title']")
	private WebElement pgtitle;
	public WebElement getPgtitle() {
		return pgtitle;
	}
	public WebElement getAgree() {
		return agree;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(id="termsofservice")
    private WebElement agree;
	@FindBy(id="checkout")
	private WebElement checkout;

}
