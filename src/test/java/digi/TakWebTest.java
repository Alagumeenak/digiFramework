package digi;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TakWebTest {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	/*	Actions action=new Actions(driver);
		action.scrollToElement(driver.findElement(By.id("CardInstancetM2wzdLP42ow_yfRTl5DeQ"))).perform();*/
		File temp=driver.findElement(By.xpath("//div//span[.=\"Women's Clothing\"]")).getScreenshotAs(OutputType.FILE);
		
		String sysDate=LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
		File per=new File("./Screenshot/"+sysDate+".png");
		FileHandler.copy(temp,per);
		/*try {
			
		}
		catch() {
		}*/

}
}
