package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@id='billing-buttons-container']/input[@value='Continue']")
	private WebElement continueaddress;
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input[@class='button-1 new-address-next-step-button']")
	private WebElement shipcontinue;
	
	@FindBy(id="shippingoption_2")
	private WebElement shippingmethod;
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	private WebElement shipmethodcontinue;
	@FindBy(id="paymentmethod_2")
	private WebElement paymentcreditmethod;
	
	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	private WebElement paycontinue;
	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement confirm;

	public WebElement getContinueaddress() {
		return continueaddress;
	}
	public WebElement getShipcontinue() {
		return shipcontinue;
	}
	public WebElement getShippingmethod() {
		return shippingmethod;
	}
	public WebElement getShipmethodcontinue() {
		return shipmethodcontinue;
	}
	public WebElement getPaymentCreditmethod() {
		return paymentcreditmethod;
	}
	public WebElement getPaycontinue() {
		return paycontinue;
	}
	
	public WebElement getPaymentcreditmethod() {
		return paymentcreditmethod;
	}
	
	public WebElement getConfirm() {
		return confirm;
	}
	
	
}
