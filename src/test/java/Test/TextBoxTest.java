package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class TextBoxTest extends BaseTest {
	@Test
	public void textBoxTest() throws InterruptedException {
		elementPage.clickOnElement();
		textBoxPage.fillAllTextBox();
	}

}
