package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonPage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By singleclickButton = By.xpath("//*[text()='Click Me']");

	public ButtonPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
	}

	public void testButton() throws InterruptedException {
		// Double click on button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/buttons']")));
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();
		WebElement button = driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
		System.out.println("Double click perform successfully");

		// Right click on button
		WebElement button2 = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(button2).perform();
		System.out.println("Right click perform on the button");

		// Single click on button
		wait.until(ExpectedConditions.visibilityOfElementLocated(singleclickButton));
		driver.findElement(singleclickButton).click();
		System.out.println("Single click perfom");
	}

}
