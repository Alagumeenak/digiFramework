package digi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(groups="RT")
	public void login_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("login-001");
		driver.quit();
	}
	@Test(groups="FT")
	public void login_002(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("login-002");
		driver.quit();

}
}
