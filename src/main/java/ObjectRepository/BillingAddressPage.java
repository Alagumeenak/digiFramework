package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressPage extends BasePage{
	public BillingAddressPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="billing-address-select")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	public WebElement getFirstNameaddress() {
		return firstNameaddress;
	}
	public WebElement getLastNameaddress() {
		return lastNameaddress;
	}
	public WebElement getEmailaddress() {
		return emailaddress;
	}
	public WebElement getCompanyaddress() {
		return companyaddress;
	}
	public WebElement getCountrydropaddress() {
		return countrydropaddress;
	}
	public WebElement getStateaddress() {
		return stateaddress;
	}
	public WebElement getCityaddress() {
		return cityaddress;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getFaxno() {
		return faxno;
	}
	public WebElement getContinueaddress() {
		return continueaddress;
	}
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement firstNameaddress;	
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement lastNameaddress;
	@FindBy(id="BillingNewAddress_Email")
	private WebElement emailaddress;
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyaddress;
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement countrydropaddress;
	@FindBy(id="BillingNewAddress_StateProvinceId")
	private WebElement stateaddress;
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityaddress;
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement postalcode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phone;
	@FindBy(id="BillingNewAddress_FaxNumber")
	private WebElement faxno;
	@FindBy(xpath="//div[@id='billing-buttons-container']/input[@value='Continue']")
	private WebElement continueaddress;
}
