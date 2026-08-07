package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class ButtonTest extends BaseTest {

	@Test
	public void buttonTest() throws InterruptedException {
		elementPage.clickOnElement();
		buttonPage.testButton();
	}

}
