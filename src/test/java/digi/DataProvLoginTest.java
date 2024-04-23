package digi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvLoginTest {
	@DataProvider()
	public String[][] logdetails(){
		 String[][] arr=new String[2][2];
		 
		 arr[0][0]="muthukar@gmail.com";
		 arr[0][1]="muthu@123";
		 
		 arr[1][0]="shoba@gmail.com";
		 arr[1][1]="shoba@123";
		 
		return arr;	
		
	}
@Test(dataProvider = "logdetails")
public void log(String email,String pasw) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pasw);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
}
}
