package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class LinkTest extends BaseTest {

	@Test
	public void linkTest() throws InterruptedException {
		elementPage.clickOnElement();
		linkPage.testLink();
	}

}
