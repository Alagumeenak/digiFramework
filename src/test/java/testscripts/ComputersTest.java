package testscripts;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import genericLibrary.BaseClass;

public class ComputersTest extends BaseClass {

	@Test
	public void comp001() throws InterruptedException {
		driver.findElement(By.linkText("COMPUTERS")).click();
		WebElement comp = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("\"//div[@class='page-title']//h1\"")));
		String comp1 = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		Thread.sleep(2000);

		Assert.assertEquals(comp, "Computers", "Computers not displayed");
		Reporter.log("Computer is displayed successfully", true);
	}

	@Test
	public void comp002() {
		driver.findElement(By.linkText("COMPUTERS")).click();
		boolean desk = driver.findElement(By.linkText("Desktops")).isDisplayed();
		Assert.assertEquals(desk, true, "Desktop is not displayed");
		Reporter.log("Desktop displayed successfully");
	}
}
