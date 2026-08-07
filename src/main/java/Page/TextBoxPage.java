package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	By textbox = By.linkText("Text Box");
	By FullName = By.id("userName");
	By Email = By.id("userEmail");
	By CurrentAddress = By.id("currentAddress");
	
	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}
	
	public void fillAllTextBox() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(textbox));
		driver.findElement(textbox).click();
		Thread.sleep(2000);
		driver.findElement(FullName).sendKeys("Mathew Hayden");
		driver.findElement(Email).sendKeys("mathew.hayden@gmail.com");
		driver.findElement(CurrentAddress).sendKeys("Australia");
		driver.findElement(By.id("permanentAddress")).sendKeys("Australia");
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	}


}
