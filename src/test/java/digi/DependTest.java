
package digi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


	public class DependTest{
	@Test()
	public void register() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		Reporter.log("Register");
		driver.manage().window().maximize();
		driver.get("facebook.com");
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(dependsOnMethods = "register")
	public void login(){
		WebDriver driver=new ChromeDriver();
		Reporter.log("Login");
		driver.manage().window().maximize();
		
		driver.quit();
	}
	@Test(dependsOnMethods = "login")
	public void addToCart(){
		WebDriver driver=new ChromeDriver();
		System.out.println("add to cart");
		driver.manage().window().maximize();
	
		driver.quit();
	}
	@Test(dependsOnMethods = "addToCart")
	public void Payment(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		
		
		driver.quit();
	}
	
	
}
