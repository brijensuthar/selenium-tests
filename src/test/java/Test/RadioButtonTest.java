package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class RadioButtonTest extends BaseTest {

	@Test
	public void radioButtonTest() throws InterruptedException {
		elementPage.clickOnElement();
		radioButtonPage.clickOnRadioButton();
	}

}
