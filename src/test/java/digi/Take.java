package digi;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		LocalDateTime systemDate=LocalDateTime.now();
	    String ScreenshotDate=systemDate.toString().replace(":", "-").replace("-", "_");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File temp=ts.getScreenshotAs(OutputType.FILE);
	    File per=new File("./Screenshot"+ScreenshotDate+".png");
	    FileHandler.copy(temp, per);
	    driver.quit();
	   
	}
}
