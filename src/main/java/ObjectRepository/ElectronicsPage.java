package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePage {
	public ElectronicsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
    
	public WebElement getElectronicsTitle() {
		return electronicsTitle;
	}
	public WebElement getCellphoneimg() {
		return cellphoneimg;
	}

	@FindBy(xpath="//div[@class=\"page-title\"]/h1")
    private WebElement electronicsTitle;
    @FindBy(xpath="//img[@alt=\"Picture for category Cell phones\"]")
	private WebElement cellphoneimg;
}
