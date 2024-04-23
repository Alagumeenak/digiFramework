package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


  public class RegisterPage extends BasePage{
  public RegisterPage(WebDriver driver) {
	super(driver);
   }
    @FindBy(id="gender-female")
    private WebElement female;
    @FindBy(id="FirstName")
    private WebElement firstname;
    @FindBy(id="LastName")
    private WebElement lastname;
    @FindBy(id="Email")
    private WebElement email;
    @FindBy(id="Password")
    private WebElement password;
    @FindBy(id="ConfirmPassword")
    private WebElement confirmPassword;
    @FindBy(id="register-button")
    private WebElement registerButton;
    public WebElement getShopProducts() {
		return shopProducts;
	}
	@FindBy(xpath="//button[.='shop products']//ancestor::div[@class='carousel carousel-slider']")
    private WebElement shopProducts;
    public WebElement getFemale() {
		return female;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
    }
