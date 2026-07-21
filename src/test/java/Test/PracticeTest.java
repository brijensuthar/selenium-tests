package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Page.PracticePage;

public class PracticeTest extends Base {

	public PracticePage obj;

	@BeforeMethod
	public void setup() {
		openBrowser();
		obj = new PracticePage(driver);
	}

	@Test (priority = 1, enabled = false)
	public void clickElement() throws InterruptedException {
		obj.clickOnElement();
	}
	
	@Test (priority = 2, enabled = false)
	public void testTextBox() throws InterruptedException {
		obj.clickOnElement();
		obj.fillAllTextBox();
	}
	
	@Test (priority = 3, enabled = true)
	public void testCheckbox() throws InterruptedException {
		obj.clickOnElement();
//		obj.clickOnCheckbox();
//		obj.clickOnRadioButton();
		Thread.sleep(5000);
		obj.testTable();
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
}
