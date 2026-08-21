package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkPage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By brokenLinkMenu = By.xpath("//*[@href=\"/broken\"]");
	By brokenLinkText = By.linkText("Click Here for Broken Link");

	public BrokenLinkPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void clickOnBrokenLinkManu() {
		js.executeScript("window.scrollBy(0, 500)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(brokenLinkMenu));
		driver.findElement(brokenLinkMenu).click();
	}

	public void clickOnBrokenLink() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(brokenLinkText));
		driver.findElement(brokenLinkText).click();
	}

}
