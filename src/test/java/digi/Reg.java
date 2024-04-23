package digi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reg {

	@Test(groups="RT")
	public void Reg_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Register")).click();	
		Reporter.log("Register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ki");
		driver.findElement(By.id("LastName")).sendKeys("Has");
		driver.findElement(By.id("Email")).sendKeys("khkh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("password@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password@123");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
	@Test(groups="FT")
	public void Reg_002(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Reg-002");
		driver.quit();

}

}
