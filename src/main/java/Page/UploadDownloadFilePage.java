package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDownloadFilePage {

	public WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	By menu = By.cssSelector("a[href=\"/upload-download\"]");
	By downloadButton = By.id("downloadButton");
	By uploadFile = By.id("uploadFile");

	public UploadDownloadFilePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.js = (JavascriptExecutor) driver;
	}

	public void uploadDownloadFile() {

		WebElement menuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", menuElement);

		wait.until(ExpectedConditions.elementToBeClickable(menuElement)).click();

		WebElement downloadElement = wait.until(ExpectedConditions.visibilityOfElementLocated(downloadButton));
		
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", downloadElement);
		
		wait.until(ExpectedConditions.elementToBeClickable(downloadElement)).click();

		WebElement uploadElement = wait.until(ExpectedConditions.visibilityOfElementLocated(uploadFile));

		String filePath = System.getProperty("user.dir") + "/src/test/resources/TestData/sampleFile.jpeg";

		uploadElement.sendKeys(filePath);
	}
}
