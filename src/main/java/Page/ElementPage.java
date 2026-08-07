package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementPage {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	By elementClick = By.xpath("//*[@href=\"/elements\"]");
	
	public ElementPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}
	
	public void clickOnElement() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementClick));
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(elementClick).click();
	}

}
