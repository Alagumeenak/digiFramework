package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookPage extends BasePage {
	public BookPage(WebDriver driver) {
	super(driver);
	}
	@FindBy(xpath="//div[@class='page-title']//h1")
	private WebElement bookPageTitle;
	public WebElement getBookPageTitle() {
		return bookPageTitle;
	}
	@FindBy(id="products-orderby")
    private WebElement product;
	public WebElement getProduct() {
		return product;
	}

	public WebElement getPgsize() {
		return pgsize;
	}

	public WebElement getView() {
		return view;
	}
	@FindBy(id="products-pagesize")
	private WebElement pgsize;
	@FindBy(id="products-viewmode")
	private WebElement view;
	
/*	public void product(int variable) {

		Select select=new Select(product);
		select.selectByIndex(variable);
	}*/
}

