package digi;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;


public class DemoRegisterTwoDimenTest {
	@DataProvider(parallel=true,name="data")
	public String[][] registerData() {
	String[][] a=new String[5][5];
	
	a[0][0]="Aka";
	a[0][1]="Sm";
	a[0][2]="akasm@gmail.com";
	a[0][3]="aka@123";
	a[0][4]="aka@123";
	
	a[1][0]="Nan";
	a[1][1]="qsp";
	a[1][2]="nanqsp@gmail.com";
	a[1][3]="nanqsp@123";
	a[1][4]="nanqsp@123";
	
	a[2][0]="Mad";
	a[2][1]="spike";
	a[2][2]="madspi@gmail.com";
	a[2][3]="mad@123";
	a[2][4]="mad@123";
	
	a[3][0]="sho";
	a[3][1]="ba";
	a[3][2]="shoba@gmail.com";
	a[3][3]="shoba@123";
	a[3][4]="shoba@123";
	
	a[4][0]="mut";
	a[4][1]="kar";
	a[4][2]="muthukar@gmail.com";
	a[4][3]="muthu@123";
	a[4][4]="muthu@123";
	
	return a;
	}
	
		
	@Test(dataProvider = "data")
	public void reg(String firstname,String lastname,String email, String pass, String conpass) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Register")).click();	
	Reporter.log("Register");
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(conpass);
	driver.findElement(By.id("register-button")).click();
	driver.quit();

}
}