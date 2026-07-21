package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage {

	WebDriver driver;
	private WebDriverWait wait;
	JavascriptExecutor js;

	By element = By.xpath("//*[@href=\"/elements\"]");
	By textbox = By.linkText("Text Box");
	By checkbox = By.cssSelector("a[href='/checkbox']");
	By FullName = By.id("userName");
	By Email = By.id("userEmail");
	By CurrentAddress = By.id("currentAddress");
	By radioBoxOption1 = By.cssSelector("input[id='impressiveRadio']");
	//By webTable = By.cssSelector("a[href='/webtables']");
	By webTable = By.xpath("//*[@href='/webtables']");

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.js = (JavascriptExecutor) driver;
	}

	public void clickOnElement() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(element).click();
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
	
	public void clickOnCheckbox() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkbox));
		driver.findElement(checkbox).click();
		Thread.sleep(2000);
		WebElement chbox = driver.findElement(By.className("rc-tree-checkbox"));
		
		if(!chbox.isSelected()) { // Here we check condition if checkbox is not selected then click on on checkbox
			chbox.click(); // In selenium we use only click() to check and uncheck checkbox
			//System.out.println("Checkbox is selected");
		}
		
		driver.findElement(By.className("rc-tree-switcher")).click();
		driver.findElement(By.cssSelector("span[aria-label='Select Downloads']")).click();
		Thread.sleep(2000);
	}
	
	public void clickOnRadioButton() throws InterruptedException {
		driver.findElement(By.xpath("//*[@href=\"/radio-button\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioBoxOption1));
		driver.findElement(radioBoxOption1).click();
		Thread.sleep(3000);
	}
	
	public void testTable() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(webTable));
		driver.findElement(webTable).click();
		Thread.sleep(5000);
		int rows = driver.findElements(By.tagName("tr")).size();
		System.out.println(rows);
		
		List<WebElement> list = driver.findElements(By.tagName("th"));
		System.out.println(list.size());

	}
}
