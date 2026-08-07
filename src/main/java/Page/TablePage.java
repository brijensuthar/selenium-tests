package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TablePage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By webTable = By.xpath("//*[@href='/webtables']");

	public TablePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void testTable() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(webTable));
		driver.findElement(webTable).click();
		Thread.sleep(5000);
		int rows = driver.findElements(By.tagName("tr")).size();
		System.out.println(rows);

		List<WebElement> list = driver.findElements(By.tagName("th"));
		System.out.println(list.size());
	}

}
