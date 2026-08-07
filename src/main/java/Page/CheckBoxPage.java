package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By checkbox = By.cssSelector("a[href='/checkbox']");

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void clickOnCheckbox() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkbox));
		driver.findElement(checkbox).click();
		Thread.sleep(2000);
		WebElement chbox = driver.findElement(By.className("rc-tree-checkbox"));

		if (!chbox.isSelected()) { // Here we check condition if checkbox is not selected then click on on checkbox
			chbox.click(); // In selenium we use only click() to check and uncheck checkbox
			// System.out.println("Checkbox is selected");
		}

		driver.findElement(By.className("rc-tree-switcher")).click();
		driver.findElement(By.cssSelector("span[aria-label='Select Downloads']")).click();
		Thread.sleep(2000);
	}

}
