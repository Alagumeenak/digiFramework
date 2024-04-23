package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage extends BasePage {

	public PaymentInformationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="CreditCardType")
	private WebElement cardtype;
	@FindBy(id="paymentmethod_2")
	private WebElement paymentcreditmethod;
	public WebElement getPaymentcreditmethod() {
		return paymentcreditmethod;
	}
	public WebElement getCardholdername() {
		return cardholdername;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getExpiremonth() {
		return expiremonth;
	}
	public WebElement getExpireyear() { 
		return expireyear;
	}
	public WebElement getCardcode() {
		return cardcode;
	}
	@FindBy(id="CardholderName")
	private WebElement cardholdername;
	@FindBy(id="CardNumber")
	private WebElement cardno;
	@FindBy(id="ExpireMonth")
	private WebElement expiremonth;
	@FindBy(id="ExpireYear")
	private WebElement expireyear;
	@FindBy(id="CardCode")
	private WebElement cardcode;
	public WebElement getCardtype() {
		return cardtype;
	}
	
}
