package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By radioBoxOption1 = By.cssSelector("input[id='impressiveRadio']");
	By radioBoxoption = By.xpath("//*[@href='/radio-button']");

	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void clickOnRadioButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioBoxoption));
		driver.findElement(radioBoxoption).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioBoxOption1));
		driver.findElement(radioBoxOption1).click();
		Thread.sleep(3000);
	}

}
