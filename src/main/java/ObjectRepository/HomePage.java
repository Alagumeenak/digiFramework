package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	} 
	@FindBy(className = "header-logo")
	private WebElement logo;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	@FindBy(linkText = "Log in")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement logbutton;
	
	@FindBy(id="Password")
	
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement conpassword;
	public WebElement getConpassword() {
		return conpassword;
	}
	@FindBy(id="small-searchterms")
	private WebElement searchtextfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbutton;
	@FindBy(linkText = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computerLink;
	 @FindBy(linkText = "ELECTRONICS")
	 private WebElement electronicPage;
	 @FindBy(linkText = "JEWELRY")
	 private WebElement jewelryLink;
	 @FindBy(css="[alt='Picture of 14.1-inch Laptop']")
	 private WebElement lapTopImage;
	 
	@FindBy(linkText = "Log out")
	 private WebElement logout;
	 public WebElement getEmail() {
			return email;
		}
	 public WebElement getLogout() {
			return logout;
		}

		public WebElement getPassword() {
			return password;
		}
	 public WebElement getLapTopImage() {
		return lapTopImage;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	@FindBy(xpath="//span[.='Shopping cart']")
	 private WebElement shoppingCartLink;
	 
    public WebElement getJewelryLink() {
		return jewelryLink;
	}

    public WebElement getLogo() {
	 return logo;
     }
	
    public WebElement getRegisterLink() {
	  return registerLink;
     }

    public WebElement getLogin() {
	return login;
     }
    public WebElement getLogbutton() {
		return logbutton;
	}

public WebElement getSearchtextfield() {
	return searchtextfield;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public WebElement getElectronicPage() {
	return electronicPage;
	}
public WebElement getBookLink() {
	return bookLink;
}

public WebElement getComputerLink() {
	return computerLink;
}
  
  }

