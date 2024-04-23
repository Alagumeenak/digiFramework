package genericLibrary;


import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.HomePage;

public class BaseClass extends UtilityMethods {
 
public WebDriver driver;
public static ExtentReports reports;
public static ExtentTest test;
  @BeforeSuite
  public void beforesuite() {
	  //ExtentReports report=new ExtentReports("./reports/report.html");
	  reports=new ExtentReports("./report/"+getTime()+".html");
	  Reporter.log("database connection successfull",true);
  }
  
  @BeforeTest
  public void beforetest() {
	  Reporter.log("Before test",true);
  }
 
  
 // @Parameters({"browser","url"})
  @BeforeClass
  public void beforeclass() {
	  String browser=FileUtility.getProrperty("browser");
		 String url=FileUtility.getProrperty("url");
	  if(browser.equalsIgnoreCase("chrome")) {
	  driver= new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  driver=new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("edge")) {
		 driver=new EdgeDriver();
	}
	  else {
		  driver=new ChromeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  initObjects(driver);
	  Reporter.log("Browser Launched",true);
  }
 
 
  @BeforeMethod
  public void beforemethod(Method method) {
	  test=reports.startTest(method.getName());
	  
	  HomePage homePage=new HomePage(driver);
	 String email=FileUtility.getProrperty("email");
	 String pass=FileUtility.getProrperty("pass");
	 homePage.getLogin().click();
	 // driver.findElement(By.linkText("Log in")).click();
	 homePage.getEmail().sendKeys(email);
	//  driver.findElement(By.id("Email")).sendKeys(email);
	 homePage.getPassword().sendKeys(pass);
	 // driver.findElement(By.id("Password")).sendKeys(pass);
	 homePage.getLogbutton().click();
	  //driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	  Reporter.log("Before method",true);
  }
  @AfterMethod
  public void aftermethod() {
	  HomePage homePage=new HomePage(driver);
	  homePage.getLogout().click();
	 // driver.findElement(By.linkText("Log out")).click();
	  reports.endTest(test);
	  Reporter.log("After method",true);
  }
  @AfterClass
  public void afterclass() {
	  Reporter.log("Browser closed",true);
	 driver.quit(); 
  }
  @AfterTest
  public void aftertest() {
	  Reporter.log("After test",true);
  }
  @AfterSuite
  public void aftersuite(){
	  reports.flush();
	  Reporter.log("After Suite",true);
  }
}
