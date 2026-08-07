package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkPage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public LinkPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void testLink() throws InterruptedException {
		// Simple Link
		js.executeScript("window.scrollBy(0,500)");
		WebElement linksMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Links']")));
		linksMenu.click();
		String parentWindow = driver.getWindowHandle();

		WebElement homeLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("simpleLink")));
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", homeLink);
		wait.until(ExpectedConditions.elementToBeClickable(homeLink)).click();
		Thread.sleep(3000);

		// Dynamic Link
		WebElement dynamicLink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='dynamicLink']")));

		// js.executeScript("arguments[0].scrollIntoView({block:'center'});",
		// dynamicLink);
		wait.until(ExpectedConditions.elementToBeClickable(dynamicLink)).click();
		Thread.sleep(2000);

		// Click on created link
		driver.findElement(By.id("created")).click();
		System.out.println("Clicked on created link successfully");

		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='No Content']")).click();
		System.out.println("Clicked on No Content link successfully");

		driver.findElement(By.id("moved")).click();
		System.out.println("Clicked on Moved Link successfully");
		
		

	}

}
