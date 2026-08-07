package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class CheckBoxTest extends BaseTest {

	@Test
	public void checkBoxTest() throws InterruptedException {
		elementPage.clickOnElement();
		checkBoxPage.clickOnCheckbox();
	}

}
